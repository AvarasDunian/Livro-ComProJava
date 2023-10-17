// Figura 10.7: CommissionEmployee.java
// Classe CommissionEmployee estede Employee

public class CommissionEmployee extends Employee {
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // porcentagem da comiss�o

    // construtor de cinco argumentos
    public CommissionEmployee( String first, String last, String ssn, 
        double sales, double rate){
            super( first, last, ssn);
            setGrossSales( sales ); // valida a remunera��o por hora
            setCommissionRate( rate ); // valida as horas trabalhadas
    } // fim do construtor HourlyEmployee com cinco argumentos

    // configura a taxa de comiss�o 
    public void setCommissionRate( double rate){
        commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
    } // fim do m�todo setCommissionRate

    // returna a taxa de comiss�o
    public double getCommissionRate(){
        return commissionRate;
    } // fim do m�todo getCommissionRate

    // configura a quantidade de vendas brutas
    public void setGrossSales(double sales){
        grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    } // fim do m�todo setGrossSales

    // retorna a quantidade de vendas brutas
    public double getGrossSales(){
        return grossSales;
    } // fim do m�todo getGrossSales

    // calcula os rendimentos; sobrescreve o m�todo earnings em Employee
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    } // fim do m�todo earnings

    // retorna a representa��o String do objeto CommissionEmployee
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
        "commission employee", super.toString(),
        "gross sales", getGrossSales(),
        "commission rate", getCommissionRate());
    }// fim do m�todo toString
} // fim da classe CommissionEmployee


