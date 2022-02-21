package service;

import employee.Employee;
import exceptions.EmployeeNotFoundException;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
    public abstract void addEmployee(Employee e);
    public abstract void deleteEmployee(int empid);
    public abstract void updateEmployee(Employee e);
    public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException, SQLException;
    public List<Employee> showAllEmployees();
}
