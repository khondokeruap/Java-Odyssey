package src.odyssey.java.assignments.operators;
public class Employee {
    public static void main(String[] args) {
//        noArg();
        twoArg();
//        threeArg();
//        fourArg();
//        fiveArg();

    }
    public static void noArg() {
            DemoEmployee no_arg = new DemoEmployee();
            System.out.println("\n...............");
            System.out.println("Print full name Method: ");
            no_arg.PrintFullName();
            System.out.println("\n...............");
            System.out.println("Print information: ");
            no_arg.print();
        }

    public static void twoArg() {
        DemoEmployee two_arg = new DemoEmployee("Salman", "Zougy");
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        two_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        two_arg.print();
    }

    public static void threeArg() {
        DemoEmployee three_arg = new DemoEmployee("Khaled", "Hassan","01/32/2000");
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        three_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        three_arg.print();
    }

    public static void fourArg() {
        DemoEmployee four_arg = new DemoEmployee("Mohiuddin", "Shamim","05/35/1999", "QA Software testing engineer");
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        four_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        four_arg.print();
    }

    public static void fiveArg() {
        DemoEmployee five_arg = new DemoEmployee("Mohiuddin", "Shamim","05/35/1999", "QA Software testing engineer", "Quality control");
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        five_arg.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        five_arg.print();
    }
}
