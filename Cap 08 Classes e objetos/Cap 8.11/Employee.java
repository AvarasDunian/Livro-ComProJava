// Figura 8.12: Employee.java
// Vari�vel est�tica utilizada para manter uma contagem do n�mero 
// de objeto Employee na mem�ria.

public class Employee {
    private String firstName;
    private String lastName;
    private static int count = 0; // o n�mero de Employees criados

    // inicializa Employee, adiciona 1 a static count e 
    // gera a sa�da de String indicando que o construtor foi chamado
    public Employee( String first, String last ) {
        firstName = first;
        lastName = last;

        ++count; // incrementa contagem st�tica de empregados
        System.out.printf("Employee constructor: %s %s; count = %d\n",
            firstName, lastName, count);
    }

    // obt�m o primeiro nome
    public String getFirstName(){
        return firstName;
    } // fim do m�todo getFirstName

    // obt�m o �ltimo nome
    public String getLastName(){
        return lastName;
    } // fim do m�todo getLastName

    // m�todo est�tico para obter valor de contagem est�tica
    public static int getCount(){
        return count;
    } // fim do m�todo getCount
}// fim da classe Employee
