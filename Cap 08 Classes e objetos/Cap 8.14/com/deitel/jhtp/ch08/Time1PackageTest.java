// Figura 8.19: TimePackageTest.java
// objeto Time1 utilizado em um aplicativo
import com.deitel.jhtp.ch08.Time1;


public class Time1PackageTest{
    public static void main ( String[] args ){
        // cria e inicializa um objeto Time1
        Time1 time = new Time1(); // chama o construtor Time1

        // gera saída de representações de string da hora
        System.out.print("The initial universal time is: ");
        System.out.println( time.toUniversalString());
        System.out.print("The inital standard time is: ")    ;
        System.out.println( time.toString() );
        System.out.println();

        //altera a hora e gera saída da hora atualizada
        time.setTime( 13, 27, 6 );
        System.out.print("Universal time after setTime is: ");
        System.out.println( time.toUniversalString());
        System.out.print("Standard time after setTime is: ")    ;
        System.out.println( time.toString() );
        System.out.println();

        // configura hora com valores inválidos; gera saída da hora atualizada
        time.setTime( 99, 99, 99 );
        System.out.print("After attempting invalid settings: ");
        System.out.print("Universal time: ");
        System.out.println( time.toUniversalString());
        System.out.print("Standard time: ")    ;
        System.out.println( time.toString() );
        System.out.println();


    }
    
}
