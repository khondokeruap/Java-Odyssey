package src.odyssey.java.assignments.operators;

public class DemoEmployee {
    // Field
    String fName;
    String lName;
    String dob;
    String title;
    String department;

    //  Constructor no argument
    public DemoEmployee() {

        this.fName = "Default First name ";
        this.lName = "Default Last name ";
        this.dob = "Default MM/DD/YYYY";
        this.title = "Default Designation ";
        this.department = "Default Department ";
    }
    // two argument
    public DemoEmployee (String fName, String lName) {

        this.fName = fName;
        this.lName = lName;
        this.dob = "Default MM/DD/YYYY";
        this.title = "Default Designation ";
        this.department = "Default Department ";
    }
    // three argument
    public DemoEmployee (String fName, String lName, String dob) {

        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.title = "Default Designation ";
        this.department = "Default Department ";
    }
    // four argument
    public DemoEmployee (String fName, String lName, String dob, String title) {

        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.title = title;
        this.department = "Default Department ";
    }
    // five argument
    public DemoEmployee (String fName, String lName, String dob, String title, String department) {

        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.title = title;
        this.department = department;
    }
    // Method
    public void print(){
        System.out.println("Full Name: "+ this.fName +" "+ this.lName);
        System.out.println("Date of Birth: " + this.dob);
        System.out.println("Job Title: " + this.title);
        System.out.println("Department: " + this.department);
    }
    public void PrintFullName(){
        System.out.println("Full Name: "+ this.fName +" "+ this.lName);
    }
}
