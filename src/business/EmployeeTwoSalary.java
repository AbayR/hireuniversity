package business;

import employee.Employee;

public class EmployeeTwoSalary extends SalaryCalculator /*parenting this is child class of the salary calculator class*/{
    public void calculateNetSalary(Employee e, int actualSalary){
        int grossSalary = getGrossSalary(e,actualSalary);
        int tax = 20000;
        int fund = 102;
        int bonus = 2000;
        int netSalary = grossSalary  - 2*(tax + fund + bonus);
        System.out.println("And this employee salary is");
        System.out.println("Empid: " + e.getEmpid());
        System.out.println("Empname " +e.getEmpname());
        System.out.println("Designation" + e.getDesignation());
        System.out.println("Gross " + grossSalary);
        System.out.println("Net " + netSalary);
    }
}
