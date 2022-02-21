package business;

import employee.Employee;

public abstract class SalaryCalculator {
    /*when common functionallity for both child classes is used*/
    public int getGrossSalary(Employee e, int actualSalary){
    int grossSalary = 0;
    /*formula for counting the salary, i think this should change accroding to what is formula for in university*/
    int perDaySalary = actualSalary/30;
    grossSalary = perDaySalary * e.getDatsAttended();
    return grossSalary;
    }
    /*specific functionallity is used*/
    public abstract void calculateNetSalary(Employee e, int actualSalary);
}
