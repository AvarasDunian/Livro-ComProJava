// Figura 10.5: SalariedEmployee.java 
// A classe concreta SlaariedEmployee estende a classe Employee abstrata.

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // construtor com quarto argumentos
    public SalariedEmployee( String first, String last, String ssn, double salary ){
        super( first, last, ssn ); // passa para o construtor Employee
        setWeeklySalary( salary ); // valida e armazena o salário
    }

    // configura o salário
    public void setWeeklySalary ( double salary ){
        weeklySalary = salary < 0.0 ? 0.0 : salary; 
    } // fim do método setWeeklySalary

    // retorna o salário
    public double getWeeklySalary(){
        return weeklySalary;
    } // fim do método getWeeklySalary

    // calcula vencimentos; implementa o método Payable da 
    // interface que era abstrata na superclasse Employee
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    } // fim do método getPaymentAmount
    
    // retorna a representação String do objeto SalariedEmployee
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f", 
            super.toString(), "weekly salary", getWeeklySalary());
    } // fim do método toString
} // fim da classe Salaried Employee
