// Figura 9.5: CommissionEmployeeTest.java
// Programa de teste da classe CommissionEmployee

public class CommissionEmployeeTest {
    public static void main ( String[] args ){
        // instancia o objeto CommissionEmployee
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06);
        
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

                employee.setGrossSales(500); // configura vendas brutas
                employee.setCommissionRate(.1);

                System.out.printf("\n%s:\n\n%s\n",
                    "Updated employee information obtained by toString", employee );
    } // fim de main
} // fim da classe CommissionEmployeeTest
