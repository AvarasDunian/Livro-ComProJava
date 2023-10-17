// Figura 9.6: BaseplusCommissionEmployee.java
// A classe BasePlusCommissionEmployee representa um empregado que
// recebe um sal�rio-base al�m da comiss�o

public class BaseplusCommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // porcentagem da comiss�o
    private double baseSalary; // sal�rio-base por semana

    // construtor de cinco argumentos
    public BaseplusCommissionEmployee( String first, String last, String ssn, 
            double sales, double rate, double salary ){
        // chamada implicita para o construtor Object ocorre aqui
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales); // valida e armazena as vendas brutas
        setCommissionRate(rate); // valida e armazena a taxa de comiss�o
        setBaseSalary(salary); // valida e armazena sal�rio-base
    } // fim do construtor CommissionEmployee de cinco argumentos

    // configura o nome
    public void setFirstName(String first){
        firstName = first; // deve validar
    } // fim do m�todo setFirstName

    // retorna o nome
    public String getFirstName(){
        return firstName;
    } // fim do m�todo getFirstName

    // configura o sobre nome
    public void setLastName(String last){
        lastName = last; // deve validar
    } // fim do m�todo setLastName

    // retorna o sobrenome
    public String getLastName(){
        return lastName;
    } // fim do m�todo getLastName

    // configura o CIC
    public void setSocialNumber(String ssn){
        socialSecurityNumber = ssn; 
    } // fim do m�todo getSocialSecurity

    // retorna o CIC
    public String getSocialNumber(){
        return socialSecurityNumber;
    } // fim do m�todo getSocialNumber

    // configura a quantidade de vendas brutas
    public void setGrossSales(double sales){
        grossSales = (sales < 0.0 ) ? 0.0 : sales;
    } // fim do m�todo setGrossSales

    // retorna a quantidade de vendas brutas
    public double getGrossSales(){
        return grossSales;
    } // fim do m�todo getGrossSales

    // configura a taxa de comiss�o
    public void setCommissionRate(double rate){
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    } // fim do m�todo setComissionRate

    // retorna a taxa de comiss�o
    public double getCommissionRate(){
        return commissionRate;
    } // fim do m�todo earnings

    // configura o sal�rio-base
    public void setBaseSalary(double salary){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    } // fim do m�todo setBaseSalary

    // retorna o sal�rio-base
    public double getBaseSalary(){
        return baseSalary;
    } // fim do m�todo getBaseSalary

    // calcula os lucros
    public double earnings(){
        return baseSalary + ( commissionRate * grossSales );
    } // fim do m�todo earnings

    // retorna a representa��o String do objeto CommissionEmployee
    @Override // indica que esse m�todo sobrescreve o m�todo de superclasse
    public String toString(){
        return String.format("%s: %s %s\n%s: %s \n%s: %2f\n%s: %.2f\n%s: %.2f",
            "commission employee", firstName, lastName,
            "social security number", socialSecurityNumber,
            "gross sales", grossSales,
            "commission rate", commissionRate,
            "base salary", baseSalary);
    } // fim do m�todo toString
} // fim da calsse BasePlusCommissionEmployee
