package business;

import employee.Employee;

public class EmployeeOneSalary extends SalaryCalculator{
    public void calculateNetSalary(Employee e, int actualSalary){
        int grossSalary = getGrossSalary(e,actualSalary);
        int tax = 10000;
        int fund = 101;
        int bonus = 1000;
        int netSalary = grossSalary  - 2*(tax + fund + bonus);
        System.out.println("This employee salary is");
        System.out.println("Empid: " + e.getEmpid());
        System.out.println("Empname " +e.getEmpname());
        System.out.println("Designation" + e.getDesignation());
        System.out.println("Gross " + grossSalary);
        System.out.println("Net " + netSalary);
    }
}
