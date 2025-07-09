public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public abstract double earnings();
    public String toString(){
        return String.format("%s %s\nSSN: %s", firstName, lastName, socialSecurityNumber);
    }
}
