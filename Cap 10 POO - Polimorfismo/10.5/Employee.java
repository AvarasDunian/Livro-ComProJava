// Figura 10.4: Employee.java
// Superclasse abstrata Employee

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // construtor com tr�s argumentos
    public Employee ( String first, String last, String ssn ){
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    } // fim do construtor Employee com tr�s argumentos

    // configura o nome
    public void setFirstName ( String first ){
        firstName = first; // deve validar
    } // fim do m�todo getFirstName

    // retorna o nome
    public String getFirstName(){
        return firstName; 
    } // fim do m�todo setFirstName

    // configura o sobrenome
    public void setLastName( String last ){
        lastName = last; // deve validar
    } // fim do m�todo setLastName

    // retorna o sobrenome
    public String getLastName () {
        return lastName;
    } // fim do m�todo getLastName

    // configura o CIC
    public void setSocialSecurityNumber ( String ssn ){
        socialSecurityNumber = ssn; // deve validar
    } // fim do m�todo setSocialSecurityNumber

    // retorna o CIC
    public String getSocialSecurityNumber(){
        return socialSecurityNumber; 
    } // fim do m�todo getSocialSecurityNumber

    // retorna a representa��o de String do objeto Employee
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s", 
            getFirstName(), getLastName(), getSocialSecurityNumber() );
    } // fim do m�todo toString

    // m�todo abstract sobrescrito por subclasses concretas
    public abstract double earnings(); // nenhuma implementa��o aqui
} // fim da classe abstrata Employee
