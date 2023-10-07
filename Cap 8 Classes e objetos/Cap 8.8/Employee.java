// Figura 8.9: EmployeeTest.java
// Calsse Emplyee com refer�ncia a outros objetos.

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // construtor para inicializar nome, data de nascimento e data de contrata��o
    public Employee( String first, String last, Date dateOfBirth, Date dateOfHire){
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    } // fim do construtor Employee

    // converte Employee em formato de String
    public String toString(){
        return String.format( "%s, %s Hired: %s Birthday: %s",
            lastName, firstName, hireDate, birthDate);
    } // fim do m�todo toString
} // fim da classe Employee
