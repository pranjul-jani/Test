package factory;

public class Main {

    public static void main(String[] args) {
        Phone myPhone = new PhoneFactory().getDesiredPhone("secure phone");
        myPhone.getSpecifications();

        /*
        
        select unique(salary) from employees ORDER BY salary limit 5;

         */
    }
}
