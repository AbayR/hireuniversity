package Main;

import business.EmployeeOneSalary;
import business.EmployeeTwoSalary;
import employee.Employee;

public class EmployeeSalaryMain {
    public static void main(String[] args){
        EmployeeOneSalary pe = new EmployeeOneSalary();
        pe.calculateNetSalary(new Employee(1234, "ascii", "Somebody", 28), 5000);
        EmployeeTwoSalary se = new EmployeeTwoSalary();
        se.calculateNetSalary(new Employee(1234, "fixsy", "Somebody1", 27), 15000);
    }
}
