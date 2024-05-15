package temp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Department department1 = new Department("DepartmentA");
        Department department2 = new Department("DepartmentB");
        Department department3 = new Department("DepartmentC");

        Employee emp1 = new Employee("Alice", department1);
        Employee emp2 = new Employee("Bob", department2);
        Employee emp3 = new Employee("Charlie", department3);

        //List<Employee> employees = List.of(emp1, emp2, emp3);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);


        // Using flatMap to flatten the stream of departments
//        List<Department> allDepartments = employees.stream()
//                .flatMap(employee -> employee.department)
//                .flatMap(department -> Stream.of(department))
//                .collect(Collectors.toList());

        // Print all departments
//        allDepartments.forEach(System.out::println);
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
