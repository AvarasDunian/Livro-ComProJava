// Figura 9.8: BaseplusCommissionEmployee.java
// membros private da superclasse não podem sera acessados em uma subclasse

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; // salário-base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee( String first, String last, String ssn, 
            double sales, double rate, double salary){
        // chamada explicita para o construtor CommissionEmployee da superclasse
        super( first, last, ssn, sales, rate );

        baseSalary = salary; // valida e armazena salário-base
    } // fim do construtor BaseplusComissionEmployee de seis argumentos

    // configura o salário-base
    public void setBaseSalary( double salary ){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    } // fim do método setBaseSalary

    // retorna o salário-base
    public double getBaseSalary(){
        return baseSalary;
    } // fim do método getBaseSalary

    // calcula os lucros
    @Override // indica que esse método sobrescreve um método de suplerclasse
    public double earnings(){
        // não permitido: commissionRate e grossSales private em superclasse
        return baseSalary + ( commissionRate * grossSales);
    } // fim do método earnings

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override // indica que esse método sobrescreve um étodo de superclasse
    public String toString(){
        return String.format("%s: %s %s\n%s: %s \n%s: %2f\n%s: %.2f",
        "commission employee", firstName, lastName,
        "social security number", socialSecurityNumber,
        "gross sales", grossSales,
        "commission rate", commissionRate,
        "base salary", baseSalary);
    }
}
