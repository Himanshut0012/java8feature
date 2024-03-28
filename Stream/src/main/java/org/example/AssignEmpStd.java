import java.io.File;
import java.util.Arrays;
import java.util.List;

public class AssignEmpStd {

    protected List<Employee> getEmployeesList(){
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Amrish Mishra", "Senior Software Engineer", "IT", Arrays.asList("Gorakhpur", "New Jersey"), "New Jersey", 50000),
                new Employee(102, "Aisha Gupta", "Project Manager", "IT", Arrays.asList("Lucknow", "Chicago"), "Chicago", 60000),
                new Employee(103, "Rohan Singh", "Data Analyst", "Analytics", Arrays.asList("Pune", "New York"), "New York", 55000),
                new Employee(104, "Aisha Gupta", "Project Manager", "IT", Arrays.asList("Lucknow", "Chicago"), "Chicago", 60000),
                new Employee(105, "Rohan Singh", "Data Analyst", "Analytics", Arrays.asList("Pune", "New York"), "New York", 55000),
                new Employee(129, "Vikram Reddy", "DevOps Engineer", "IT", Arrays.asList("Hyderabad", "Seattle"), "Seattle", 62000),
                new Employee(130, "Sara Ali", "Product Manager", "Product", Arrays.asList("Bangalore", "San Francisco"), "San Francisco", 70000)
        );

        return  employeeList;
    }

    protected List<Employee> getEmpByFile(){
        File file =
    }
}
