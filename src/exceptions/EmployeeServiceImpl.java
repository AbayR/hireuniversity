package exceptions;

import dao.EmployeeDAOMySqlImpl;
import dao.IEmployeeDAO;
import employee.Employee;
import service.IEmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {

    private IEmployeeDAO empDao = new EmployeeDAOMySqlImpl();

    @Override
    public void addEmployee(Employee e) {
        empDao.addEmployee(e);
    }

    @Override
    public void deleteEmployee(int empid) {
        empDao.deleteEmployee(empid);
    }

    @Override
    public void updateEmployee(Employee e) {
    empDao.updateEmployee(e);
    }

    @Override
    public Employee findEmployee(Employee e) throws EmployeeNotFoundException, SQLException {
        return empDao.findEmployee(e);
    }

    @Override
    public List<Employee> showAllEmployees() {
        return empDao.showAllEmployees();
    }
}
