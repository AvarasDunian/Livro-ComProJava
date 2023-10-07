// Figura 8.2: Time1Test.java
// objeto Time1 utilizando em um aplicativo

public class Time1Test 
{
    public static void main (String[] args)
    {   
        // cria e inicializa um objeto Time1
        Time1 time = new Time1();

        // gera saída de representações de string da hora
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println();

        // altera a hora e gera saída da hora atualiza
        time.setTime(13, 27, 9);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println();

        // configura a hora com valores inválidos; gera saída da hora atualizada
        time.setTime(99, 99, 99);
        System.out.print("After attempting invalid settings: \n");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());
        System.out.println();



    }
}
