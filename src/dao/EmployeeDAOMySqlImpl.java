package dao;

import employee.Employee;
import exceptions.EmployeeNotFoundException;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDAOMySqlImpl implements IEmployeeDAO /*polymorphism to use the methods created in parent class in this class*/{

    private Connection cn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    public static final String INS_COMMAND = "INSERT INTO employee VALUES(?,?,?,?)";
    public static final String UPDATE_COMMAND = "UPDATE employee SET empname=?,designation=?, daysattended=?, WHERE empid=?";
    public static final String DELETE_COMMAND = "DELETE FROM employee WHERE empid=?";
    public static final String FIND_COMMAND = "SELECT * FROM employee WHERE empid=?";
    public static final String SELECT_ALL = "SELECT * FROM employee";

    /*constructor for database connection*/
    public EmployeeDAOMySqlImpl(){
        try{
            cn = DriverManager.getConnection(IEmployeeDAO.URL, IEmployeeDAO.USERNAME, IEmployeeDAO.PASSWORD);
        } catch (SQLException e){
            System.out.println("Unable to establish the connection with db for shame:(");
            e.printStackTrace();
        }

    }
    /* CRUD Operations*/
    @Override
    public void addEmployee(Employee e) {
        int i = 0;
    try {
        /*created prepared statement*/
        pst = cn.prepareStatement(INS_COMMAND);
        pst.setInt(1, e.getEmpid());
        pst.setString(2, e.getEmpname());
        pst.setString(3, e.getDesignation());
        pst.setInt(4, e.getDatsAttended());
        i = pst.executeUpdate();
    }catch (SQLException e1){
        System.out.println("Unable to add record filled..");
        e1.printStackTrace();
    } /*close the prepared statement using finally block*/
    finally{
        try {
            pst.close();
        }catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
        if(i>1){
            System.out.println("record is added");
        }
    }

    @Override
    public void deleteEmployee(int empid) {
       int i = 0;
       try {
           pst = cn.prepareStatement(DELETE_COMMAND);
           pst.setInt(1, empid);
           i = pst.executeUpdate();
       }catch (SQLException e){
           System.out.println("delete operation has just failed maan");
           e.printStackTrace();
       } finally {
           try {
               pst.close();
           }catch (SQLException e){
               e.printStackTrace();
           }
       }
       if(i>0){
           System.out.println("Record deleted successfully");
       }
    }

    @Override
    public void updateEmployee(Employee e) {
        int i=0;
        try {
            pst = cn.prepareStatement(UPDATE_COMMAND);
            pst.setInt(4, e.getEmpid());
            pst.setString(1, e.getEmpname());
            pst.setString(2, e.getDesignation());
            pst.setInt(3, e.getDatsAttended());
            i = pst.executeUpdate();
        }catch (SQLException e1) {
            System.out.println("Update failed fuck");
            e1.printStackTrace();
        }finally {try {
            pst.close();
        }
        catch (SQLException e1){
            e1.printStackTrace();
        }
        }
        if(i>0){
            System.out.println("Record updated successfully");
        }
    }

    @Override
    public Employee findEmployee(Employee e) throws EmployeeNotFoundException, SQLException {
        Employee findTemp = null;
        try {
            pst = cn.prepareStatement(FIND_COMMAND);
            pst.setInt(1, e.getEmpid());
            rs = pst.executeQuery();
            if (!rs.next()) {
                throw new EmployeeNotFoundException(e.getEmpid());
            }
            findTemp = new Employee();
            findTemp.setEmpname(rs.getString("empname"));
            findTemp.setDesignation(rs.getString("designation"));
            findTemp.setDatsAttended(rs.getInt("datsattended"));
            findTemp.setEmpid(e.getEmpid());
        }catch(SQLException e1){
            e1.printStackTrace();
        }finally {
            try{
            pst.close();
            rs.close();
            }catch (SQLException e1){
                e1.printStackTrace();
            }
        }
        return findTemp;
    }


    @Override
    public List<Employee> showAllEmployees() {
        Employee selectAllTemp = null;
        List<Employee> elist = new LinkedList<>();
        try {
            pst = cn.prepareStatement(SELECT_ALL);
            rs = pst.executeQuery();
            while (rs.next()){
                /*creating new object employee*/
                selectAllTemp = new Employee();
                selectAllTemp.setEmpid(rs.getInt("empid"));
                selectAllTemp.setEmpname(rs.getString("empname"));
                selectAllTemp.setDesignation(rs.getString("designation"));
                selectAllTemp.setDatsAttended(rs.getInt("datsattended"));
                elist.add(selectAllTemp);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }


        return elist;
    }
}
