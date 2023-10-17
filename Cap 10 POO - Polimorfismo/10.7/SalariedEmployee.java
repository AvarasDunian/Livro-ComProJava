// Figura 10.5: SalariedEmployee.java 
// A classe concreta SlaariedEmployee estende a classe Employee abstrata.

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // construtor com quarto argumentos
    public SalariedEmployee( String first, String last, String ssn, double salary ){
        super( first, last, ssn ); // passa para o construtor Employee
        setWeeklySalary( salary ); // valida e armazena o sal�rio
    }

    // configura o sal�rio
    public void setWeeklySalary ( double salary ){
        weeklySalary = salary < 0.0 ? 0.0 : salary; 
    } // fim do m�todo setWeeklySalary

    // retorna o sal�rio
    public double getWeeklySalary(){
        return weeklySalary;
    } // fim do m�todo getWeeklySalary

    // calcula vencimentos; implementa o m�todo Payable da 
    // interface que era abstrata na superclasse Employee
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    } // fim do m�todo getPaymentAmount
    
    // retorna a representa��o String do objeto SalariedEmployee
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f", 
            super.toString(), "weekly salary", getWeeklySalary());
    } // fim do m�todo toString
} // fim da classe Salaried Employee
