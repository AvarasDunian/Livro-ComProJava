// Figura 10.1: PolimorphismTest.java
// Atribuindo refer~encias de superclasse e subclasse a
// vari�veis de superclasse e de subclasse.

public class PolymorphismTest {
    public static void main ( String[] args ){
        // atribui uma refer�ncia de superclasse a vari�vel de superclasse
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06);
        
        // atribui uma refer�ncia de subclasse a vari�vel de subclasse
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Bob", "Jones", "333-33-3333", 5000, 0.04, 300);

        // invoca toString no objeto de superclasse utilizando a vari�vel de superclasse
        System.out.printf("%s %s:\n\n%s\n\n" ,
            "Call CommissionEmployee's toString with superclass reference", 
            "to superclass objetct", commissionEmployee.toString());

        System.out.printf("%s %s:\n\n%s\n\n" ,
            "Call BasePlusCommissionEmployee's toString with subclass", 
            "reference to superclass object", basePlusCommissionEmployee.toString());

        // invoca toString no objeto de subclasse utilizando a vari�vel de superclasse
        CommissionEmployee commissionEmployee2 =  
            basePlusCommissionEmployee;
        System.out.printf("%s %s:\n\n%s\n\n", 
            "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());
    } // fim de main
} // fim da classe PolyMorphismTest