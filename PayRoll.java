public class PayRoll {
    public static void main(String[] args){

                Employee[] employees = new Employee[4];

                employees[0] = new SalariedEmployee("Nafisa", "Usrat", "123-45-789", 800.00);
                employees[1] = new HourlyEmployee("Innum", "Rtyf", "222-78-2229", 20.00, 45);
                employees[2] = new CommissionEmployee("Tony", "Brown", "389-00-3673", 10000, 0.06);
                employees[3] = new BasePlusCommissionEmployee("Diana", "Yuktha", "444-44-4444", 5000, 0.04, 300);

                System.out.println("Employees processed polymorphically:\n");

                for (Employee emp : employees) {
                    System.out.println(emp);  // toString()

                    // Increase base salary if applicable
                    if (emp instanceof BasePlusCommissionEmployee) {
                        BasePlusCommissionEmployee baseEmp = (BasePlusCommissionEmployee) emp;
                        baseEmp.increaseBaseSalary(10);  // increase by 10%
                        System.out.println("Base salary increased by 10%.");
                    }

                    System.out.printf("Earnings: $%.2f\n\n", emp.earnings());  // earnings()
                }
            }
        }
