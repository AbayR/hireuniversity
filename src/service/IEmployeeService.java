package service;

import employee.Employee;
import exceptions.EmployeeNotFoundException;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
    /*this class was created to connect the db with main, the encapsulation is going to be done in other classes
    * this class is important because for example if we want to make changes in db for example to move from the mysql to postgre or oracle
    * all we need to change is this interface, so we dont need to change whole main class, it was possible using polymorphism
    *  */
    public abstract void addEmployee(Employee e);
    public abstract void deleteEmployee(int empid);
    public abstract void updateEmployee(Employee e);
    public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException, SQLException; /*connecting the database with the main class*/
    public List<Employee> showAllEmployees();
}
