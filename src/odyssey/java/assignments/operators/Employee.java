package src.odyssey.java.assignments.operators;
public class Employee {
    public static void main(String[] args) {
//        noarg();
        twoarg();
//        threearg();
//        fourarg();
//        fivearg();

    }
    public static void noarg() {
            Back_Employee no_arg = new Back_Employee();
            System.out.println(no_arg.fName);
            System.out.println(no_arg.lName);
            System.out.println(no_arg.dob);
            System.out.println(no_arg.title);
            System.out.println(no_arg.department);
            System.out.println("\n...............");
            System.out.println("Print full name Method: ");
            no_arg.PrintFullName();
            System.out.println("\n...............");
            System.out.println("Print information: ");
            no_arg.print();
        }

    public static void twoarg() {
        Back_Employee two_arg = new Back_Employee("Salman", "Zougy");
        System.out.println(two_arg.fName);
        System.out.println(two_arg.lName);
        System.out.println(two_arg.dob);
        System.out.println(two_arg.title);
        System.out.println(two_arg.department);
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        two_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        two_arg.print();
    }

    public static void threearg() {
        Back_Employee three_arg = new Back_Employee("Khaled", "Hassan","01/32/2000");
        System.out.println(three_arg.fName);
        System.out.println(three_arg.lName);
        System.out.println(three_arg.dob);
        System.out.println(three_arg.title);
        System.out.println(three_arg.department);
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        three_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        three_arg.print();
    }

    public static void fourarg() {
        Back_Employee four_arg = new Back_Employee("Mohiuddin", "Shamim","05/35/1999", "QA Software testing engineer");
        System.out.println(four_arg.fName);
        System.out.println(four_arg.lName);
        System.out.println(four_arg.dob);
        System.out.println(four_arg.title);
        System.out.println(four_arg.department);
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        four_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        four_arg.print();
    }

    public static void fivearg() {
        Back_Employee five_arg = new Back_Employee("Mohiuddin", "Shamim","05/35/1999", "QA Software testing engineer", "Quality control");
        System.out.println(five_arg.fName);
        System.out.println(five_arg.lName);
        System.out.println(five_arg.dob);
        System.out.println(five_arg.title);
        System.out.println(five_arg.department);
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        five_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        five_arg.print();
    }
}
