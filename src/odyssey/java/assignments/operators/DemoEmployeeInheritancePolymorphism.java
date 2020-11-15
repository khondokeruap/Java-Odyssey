package src.odyssey.java.assignments.operators;
public class DemoEmployeeInheritancePolymorphism {
    public static void main(String[] args) {
//
        EmployeeInheritancePolymorphism info = new EmployeeInheritancePolymorphism();
            info.setFirstName("Khondoker");
            info.setLasttName("Islam");
            info.setDateOfBirth("01/01/1987");
            System.out.println("\n...............");
            System.out.println("Print full name Method: ");
            info.PrintFullName();
            System.out.println("\n...............");
            System.out.println("Print information: ");
            info.print();
        EmployeeInheritancePolymorphism info1 = new EmployeeInheritancePolymorphism();
        info1.setFirstName("Salman");
        info1.setLasttName("Zougy");
        info1.setDateOfBirth("04/21/1985");
        System.out.println("\n...............");
        System.out.println("Print full name Method: ");
        info1.PrintFullName();
        System.out.println("\n...............");
        System.out.println("Print information: ");
        info1.print();
        System.out.println("\n...............");

       // from child
        Department obj = new Department();
        obj.setFirstName("Salman");
        obj.setLasttName("Zougy");
        obj.print();
        }
}
