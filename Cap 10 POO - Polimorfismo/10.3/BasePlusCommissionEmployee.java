// Figura 9.8: BaseplusCommissionEmployee.java
// membros private da superclasse n�o podem sera acessados em uma subclasse

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; // sal�rio-base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee( String first, String last, String ssn, 
            double sales, double rate, double salary){
        // chamada explicita para o construtor CommissionEmployee da superclasse
        super( first, last, ssn, sales, rate );

        baseSalary = salary; // valida e armazena sal�rio-base
    } // fim do construtor BaseplusComissionEmployee de seis argumentos

    // configura o sal�rio-base
    public void setBaseSalary( double salary ){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    } // fim do m�todo setBaseSalary

    // retorna o sal�rio-base
    public double getBaseSalary(){
        return baseSalary;
    } // fim do m�todo getBaseSalary

    // calcula os lucros
    @Override // indica que esse m�todo sobrescreve um m�todo de suplerclasse
    public double earnings(){
        // n�o permitido: commissionRate e grossSales private em superclasse
        return baseSalary + ( commissionRate * grossSales);
    } // fim do m�todo earnings

    // retorna a representa��o de String de BasePlusCommissionEmployee
    @Override // indica que esse m�todo sobrescreve um �todo de superclasse
    public String toString(){
        return String.format("%s: %s %s\n%s: %s \n%s: %2f\n%s: %.2f",
        "commission employee", firstName, lastName,
        "social security number", socialSecurityNumber,
        "gross sales", grossSales,
        "commission rate", commissionRate,
        "base salary", baseSalary);
    }
}
