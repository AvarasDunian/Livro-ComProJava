// Figura 10.4: Employee.java
// Superclasse abstrata Employee

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // construtor com três argumentos
    public Employee ( String first, String last, String ssn ){
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    } // fim do construtor Employee com três argumentos

    // configura o nome
    public void setFirstName ( String first ){
        firstName = first; // deve validar
    } // fim do método getFirstName

    // retorna o nome
    public String getFirstName(){
        return firstName; 
    } // fim do método setFirstName

    // configura o sobrenome
    public void setLastName( String last ){
        lastName = last; // deve validar
    } // fim do método setLastName

    // retorna o sobrenome
    public String getLastName () {
        return lastName;
    } // fim do método getLastName

    // configura o CIC
    public void setSocialSecurityNumber ( String ssn ){
        socialSecurityNumber = ssn; // deve validar
    } // fim do método setSocialSecurityNumber

    // retorna o CIC
    public String getSocialSecurityNumber(){
        return socialSecurityNumber; 
    } // fim do método getSocialSecurityNumber

    // retorna a representação de String do objeto Employee
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s", 
            getFirstName(), getLastName(), getSocialSecurityNumber() );
    } // fim do método toString

    // método abstract sobrescrito por subclasses concretas
    public abstract double earnings(); // nenhuma implementação aqui
} // fim da classe abstrata Employee
