package src.odyssey.java.assignments.operators;

public class Department extends EmployeeInheritancePolymorphism {
    private String title;

    public Department(){
    super();
    baseSalary = 60000.00;
    title = "QA Automation Engineer";
}
    public void SetTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    private double baseSalary;

    public void SetBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
        public void print(){
        super.print();
           System.out.println("Title: " + this.title);
           System.out.println("Base salary: "+ this.baseSalary);

    }
}
