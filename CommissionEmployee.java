public class CommissionEmployee extends Employee {
     private double grossSale;
     private double commissionRate;
     public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSale, double commissionRate){
         super(firstName, lastName, socialSecurityNumber);
         this.grossSale = grossSale;
         this.commissionRate = commissionRate;
     }
    @Override
    public double earnings() {
       return grossSale*commissionRate;
    }
    @Override
    public String toString() {
        return String.format("Commission Employee: %s\\nGross Sales: $%f; Commission Rate: %f", super.toString(), grossSale, commissionRate);

    }
}
