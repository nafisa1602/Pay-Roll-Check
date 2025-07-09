public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double earnings() {
        return weeklySalary;
    }
    public String toString(){
        return String.format("Salaried Employee: %s\nWeekly Salary: $%f",
                super.toString(), weeklySalary);
    }
}
