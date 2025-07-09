public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hour){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hour = hour;
    }
    @Override
    public double earnings() {
       if(hour <= 40.0){
           return wage*hour;
       }
        else{
            return wage*40.0+(hour-40.0)*40*1.5;
       }
    }
    public String toString() {
        return String.format("Hourly Employee: %s\nHourly Wage: $%f; Hours Worked: %f",
                super.toString(), wage, hour);
    }
}
