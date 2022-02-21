package employee;

public class Employee {
    /*creating variables*/
    private int empid;
    private String empname;
    private String designation;
    private int datsAttended;

    //constructor for superclass
    public Employee(){
        super();
    }
    //contructor using fields
    public Employee(int empid, String empname, String designation, int datsAttended){
        super();
        this.empid = empid;
        this.empname = empname;
        this.designation = designation;
        this.datsAttended = datsAttended;
    }
    //getters and setters

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDatsAttended() {
        return datsAttended;
    }

    public void setDatsAttended(int datsAttended) {
        this.datsAttended = datsAttended;
    }
}
