public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // construtor de cinco argumentos
    public BasePlusCommissionEmployee( String first, String last, String ssn, 
        double sales, double rate, double base){
            super( first, last, ssn, sales, rate );
            setBaseSalary ( base ); // valida as horas trabalhadas
        } // fim do construtor HourlyEmployee com cinco argumentos

    // configura o sal�rio-base
    public void setBaseSalary( double salary ){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // n�o negativo
    } // fim do m�todo setBaseSalary

    // retorna o sal�rio-base
    public double getBaseSalary(){
        return baseSalary;
    } // fim do m�todo getBaseSalary

    // calcula os vencimentos; sobrescreve o m�todo earnings em CommissionEmployee
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    } // fim do m�todo earnings

    // retorna a representa��o String do objeto BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format("%s %s; %s $%,.2f",
        "base-salaried", super.toString(),
        "base salary", getBaseSalary() );
    }// fim do m�todo toString
} // fim da classe BasePlusCommissionEmployee
