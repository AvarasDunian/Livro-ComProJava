// Figura 8.12: Employee.java
// Variável estática utilizada para manter uma contagem do número 
// de objeto Employee na memória.

public class Employee {
    private String firstName;
    private String lastName;
    private static int count = 0; // o número de Employees criados

    // inicializa Employee, adiciona 1 a static count e 
    // gera a saída de String indicando que o construtor foi chamado
    public Employee( String first, String last ) {
        firstName = first;
        lastName = last;

        ++count; // incrementa contagem stática de empregados
        System.out.printf("Employee constructor: %s %s; count = %d\n",
            firstName, lastName, count);
    }

    // obtém o primeiro nome
    public String getFirstName(){
        return firstName;
    } // fim do método getFirstName

    // obtém o último nome
    public String getLastName(){
        return lastName;
    } // fim do método getLastName

    // método estático para obter valor de contagem estática
    public static int getCount(){
        return count;
    } // fim do método getCount
}// fim da classe Employee
