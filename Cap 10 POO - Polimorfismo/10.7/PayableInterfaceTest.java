// Figura 10.15: PayableInterfaceTest.java
// Testa a interface Payable.

public class PayableInterfaceTest {
    public static void main ( String[] args ) {
        // cria array Payable de quatro elementos
        Payable[] payableObjects = new Payable[4];

        // preenche o arry com objetos que implementam Payable
        payableObjects[0] = new Invoice( "01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice( "06789", "tire", 4, 79.95);        
        payableObjects[2] = 
            new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = 
            new SalariedEmployee( "Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println(
            "Invoices and Employees processed polymorphically:\n");

        // processa genericamente cada elemento no array payableObjects
        for ( Payable currentPayable : payableObjects){
            // gera saída de currentPayable e o pagamento apropriado
            System.out.printf("%s \n%s: $%,.2f\n\n", 
                currentPayable.toString(),
                "payment due", currentPayable.getPaymentAmount());
        } // for final
    } // fim de main
} // fim da classe PayableInterfaceTest
