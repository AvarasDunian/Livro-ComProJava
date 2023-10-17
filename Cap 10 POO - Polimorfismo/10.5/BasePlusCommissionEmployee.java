public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // construtor de cinco argumentos
    public BasePlusCommissionEmployee( String first, String last, String ssn, 
        double sales, double rate, double base){
            super( first, last, ssn, sales, rate );
            setBaseSalary ( base ); // valida as horas trabalhadas
        } // fim do construtor HourlyEmployee com cinco argumentos

    // configura o salário-base
    public void setBaseSalary( double salary ){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // não negativo
    } // fim do método setBaseSalary

    // retorna o salário-base
    public double getBaseSalary(){
        return baseSalary;
    } // fim do método getBaseSalary

    // calcula os vencimentos; sobrescreve o método earnings em CommissionEmployee
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    } // fim do método earnings

    // retorna a representação String do objeto BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format("%s %s; %s $%,.2f",
        "base-salaried", super.toString(),
        "base salary", getBaseSalary() );
    }// fim do método toString
} // fim da classe BasePlusCommissionEmployee
