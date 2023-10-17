// Figura 9.4: CommissionEmployee.java
// Classe CommissionEmployee representa um funcionário que recebeu uma 
// porcentagem das vendas brutas.

public class CommissionEmployee extends Object{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // porcentagem da comissão

    // construtor de cinco argumentos
    public CommissionEmployee( String first, String last, String ssn, double sales, double rate ){
        // chamada implicita para o construtor Object ocorre aqui
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales); // valida e armazena as vendas brutas
        setCommissionRate(rate); // valida e armazena a taxa de comissão
    } // fim do construtor CommissionEmployee de cinco argumentos

    // configura o nome
    public void setFirstName(String first){
        firstName = first; // deve validar
    } // fim do método setFirstName

    // retorna o nome
    public String getFirstName(){
        return firstName;
    } // fim do método getFirstName

    // configura o sobre nome
    public void setLastName(String last){
        lastName = last; // deve validar
    } // fim do método setLastName

    // retorna o sobrenome
    public String getLastName(){
        return lastName;
    } // fim do método getLastName

    // configura o CIC
    public void setSocialNumber(String ssn){
        socialSecurityNumber = ssn; 
    } // fim do mátodo getSocialSecurity

    // retorna o CIC
    public String getSocialNumber(){
        return socialSecurityNumber;
    } // fim do método getSocialNumber

    // configura a quantidade de vendas brutas
    public void setGrossSales(double sales){
        grossSales = (sales < 0.0 ) ? 0.0 : sales;
    } // fim do método setGrossSales

    // retorna a quantidade de vendas brutas
    public double getGrossSales(){
        return grossSales;
    } // fim do método getGrossSales

    // configura a taxa de comissão
    public void setCommissionRate(double rate){
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    } // fim do método setComissionRate

    // retorna a taxa de comissão
    public double getCommissionRate(){
        return commissionRate;
    } // fim do método earnings

    // calcula os lucros
    public double earnings(){
        return commissionRate * grossSales;
    } // fim do método earnings

    // retorna a representação String do objeto CommissionEmployee
    @Override // indica que esse método sobrescreve o método de superclasse
    public String toString(){
        return String.format("%s: %s %s\n%s: %s \n%s: %2f\n%s: %.2f",
            "commission employee", firstName, lastName,
            "social security number", socialSecurityNumber,
            "gross sales", grossSales,
            "commission rate", commissionRate);
    } // fim do método toString
} // fim da classe CommissionEmployee