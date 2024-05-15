import java.util.*;

public class MainFive {

    public static void main(String[] args) {
//        final Employee e = new Employee("pranjul", 1L, "abc");

        String s = "abc";
        String a = "abc";
        s = "def";


        Map<Employee, Integer> map = new HashMap<>();
//
//        map.put("Rajesh", 1);
//        map.put("Pranjul", 2);
//        map.put("Rakesh", 3);


        Employee e1 = new Employee("c", 5, "abc");
        Employee e2 = new Employee("c", 1, "abc");
        Employee e3 = new Employee("b", 5, "abc");
        Employee e4 = new Employee("b", 1, "abc");
        Employee e5 = new Employee("a", 5, "abc");

        /*
        (c,5)
        (c,1)
        (b,5)
        (b,1)
        (a,5)
         */

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.name.compareTo(e2.name) == 0) {
                    return (int) e1.id - e2.id;
                }
                return e1.name.compareTo(e2.name);
            }
        });

        for (Employee e : employeeList) {
            System.out.println(e.name + "->" + e.id);
        }



    }

    /*
    hashcode("Rajesh") = x;
    x & (size - 1)


     0, 1,
     2 -> Pranjul, y, v2 ->
     3 -> Rajesh, x, v1, -> Rakesh, x1, v2
     4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
     */
}
