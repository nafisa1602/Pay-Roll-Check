public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate,double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        this.baseSalary = baseSalary;
    }
    public void increaseBaseSalary(double percent) {
        baseSalary += baseSalary * percent / 100;
    }
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("Base-Salaried Commission Employee: %s\nBase Salary: $%f", super.toString(), baseSalary);
    }
}
