package src.odyssey.java.assignments.operators;

public class EmployeeInheritancePolymorphism {
    // Field
    private String firstName;
    private String lastName;
    private String dateOfBirth;

public EmployeeInheritancePolymorphism(){
this.firstName = "First Name";
this.lastName = "Last Name";
this. dateOfBirth = "10/10/2020";
}

    public void setFirstName(String fName){
        this.firstName= fName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLasttName(String lName){
        this.lastName= lName;
    }
    public String getLasttName(){
        return this.lastName;
    }
    public void setDateOfBirth(String dob){
        this.dateOfBirth= dob;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    // Method
    public void print(){
        System.out.println("Full Name: "+ this.firstName +" "+ this.lastName);
        System.out.println("Date of Birth: " + this.dateOfBirth);

    }
    public void PrintFullName(){
        System.out.println("Full Name: "+ this.firstName +" "+ this.lastName);
    }
}
