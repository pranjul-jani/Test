import java.util.concurrent.atomic.AtomicInteger;

public class MainSix {

    public static void main(String[] args) {

        Address address = new Address();

        EmployeeEntity employeeEntity = new EmployeeEntity(1, "pranjul", address);
        EmployeeEntity employeeEntity1 = new EmployeeEntity(2, "pranjul", address);


    }
}
