// Figura 9.9: BaseplusCommissionEmployee.java
// BasePlusCommissionEmployee herda a instância protected
// variáveis de CommissionEmployee

public class BaseplusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; // salário-base por semana

    // construtor de seis argumentos
    public BaseplusCommissionEmployee( String first, String last, String ssn, 
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
        return getBaseSalary() + super.earnings();
    } // fim do método earnings

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override // indica que esse método sobrescreve um étodo de superclasse
    public String toString(){
        return String.format("%s %s\n%s: %.2f", "base-salaried",
            super.toString(), "base-salary", getBaseSalary());
    } // fim do método toString
} // fim da classe BasePlusCommissionEmployee
