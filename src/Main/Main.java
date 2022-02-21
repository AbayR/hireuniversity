package Main;

import employee.Employee;
import exceptions.EmployeeNotFoundException;
import exceptions.EmployeeServiceImpl;
import service.IEmployeeService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        IEmployeeService eservice = new EmployeeServiceImpl();
        eservice.addEmployee(new Employee(11, "Abay", "Professor", 30));
        eservice.addEmployee(new Employee(22, "Elnar", "Manager", 29));
        eservice.addEmployee(new Employee(33, "Abayka", "Teacher", 28));
        eservice.addEmployee(new Employee(44, "Elnarka", "PE", 27));
        System.out.println("   ");

        List<Employee> elist = eservice.showAllEmployees();
        for (Employee e : elist){
            System.out.println(e.getEmpid()+":" + e.getEmpname()+ ":" + e.getDesignation()+":"+e.getDatsAttended());
        }
        System.out.println("   ");
        eservice.deleteEmployee(11);
        eservice.updateEmployee(new Employee(22,"updated", "Senior", 29));
        try{Employee temp = eservice.findEmployee(new Employee(22,"updated", "Senior", 29));
            System.out.println(temp.getEmpid()+" "+temp.getEmpname());
        }catch (EmployeeNotFoundException | SQLException e1){
            e1.printStackTrace();
        }

    }
}
