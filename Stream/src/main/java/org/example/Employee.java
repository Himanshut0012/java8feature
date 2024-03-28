import java.util.List;

public class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private String  department;
    private List<String> address;
    private String workLocation;
    private int salary;

    public Employee(int empId, String empName, String empDesignation, String department, List<String> address, String workLocation, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.department = department;
        this.address = address;
        this.workLocation = workLocation;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
