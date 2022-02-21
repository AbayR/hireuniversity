package dao;

import employee.Employee;
import exceptions.EmployeeNotFoundException;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeDAO {
    /*respective database*/
    public abstract void addEmployee(Employee e);
    public abstract void deleteEmployee(int empid);
    public abstract void updateEmployee(Employee e);
    public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException, SQLException;
    public List<Employee> showAllEmployees();
    /*creating constant*/
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "ThisPassword";
    /*driver class*/
    public static final String DRIVER_CLASSNAME = "mysql.jdbc.Driver";
}
