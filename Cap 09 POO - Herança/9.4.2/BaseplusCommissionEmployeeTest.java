// Figura 9.7: BasePluysCommissionEmployeeTest.java
// Programa de teste de BasePlusCommssionEmployee.

public class BaseplusCommissionEmployeeTest {
    public static void main ( String[] args ){
        // instancia o objeto CommissionEmployee
        BaseplusCommissionEmployee employee = new BaseplusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
                // obtém os dados de empregado comissionado
                System.out.println(
                    "Employee information obtained by get methods: \n" );
                System.out.printf("%s %s\n", "First Name is", 
                    employee.getFirstName());
                System.out.printf("%s %s\n", "Last Name is",
                    employee.getLastName());
                System.out.printf("%s %s\n", "Social security number is",
                    employee.getSocialNumber());
                System.out.printf("%s %.2f\n", "Commission rate is", 
                    employee.getCommissionRate());
                System.out.printf("%s %.2f\n", "Base salary is", 
                    employee.getBaseSalary());

                employee.setGrossSales(500); // configura vendas brutas
                employee.setCommissionRate(.1);

                System.out.printf("\n%s:\n\n%s\n",
                    "Updated employee information obtained by toString", employee );
    } // fim de main
} // fim da classe BasePlusCommissionEmployeeTest
