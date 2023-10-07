// Figura 8.13: EmployeeTest.java
// Demonstração do membro static

public class EmployeeTest {
    public static void main ( String[] args ){
        // mostra que a contagem é 0 antes de criar Employees
        System.out.printf("Employees befores instantiation: %d\n",
            Employee.getCount());

        // cria dois Employees; a contagem deve ser 2
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        // mostra que a contagem é 2 depois de criar dois Employees
        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n", Employee.getCount());

        // obtém nomes de Employees
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",
            e1.getFirstName(), e1.getLastName(),
            e2.getFirstName(), e2.getLastName());

        // nesse exemplo, há somente uma referência a cada Employee,
        // portanto as duas instruções seguintes indicam que
        // esses objetos são elegíveis para a coleta de lixo

        e1 = null;
        e2 = null;
    } // fim de main
} // fim da classe EmployueTest
