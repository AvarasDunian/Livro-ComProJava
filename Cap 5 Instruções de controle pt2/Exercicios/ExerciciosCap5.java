//Exercicios de autorevis�o do Cap 5 

public class ExerciciosCap5{
    public static void main(String[] args){
        //Exercicio 1
        //Some os inteiros impares entre 1 e 9 utilizando uma istru��o for. Assuma que as vari�veis de inteiro sum e count foram declaradas:
        
        int sum = 0; // Declara a vari�vel sum
        System.out.printf("Exericio 1:\n");
        for( int i = 0 ; i < 10 ; i++){ // inicia o for
            if( !(i%2 == 0) ){ // usando o operando mod, calcula-se o resto de uma divis�o, caso o resto da divis�o por dois � 0 o numero � par, caso contrario, �mpar.
                System.out.printf("%d ", i); // exibe o n�mero �mpar
                sum += i; //adiciona o n�mero impar a vari�vel sum
            }
        }

        System.out.printf("\n\nThe sum of odd numbers from 1 to 10 is: %d", sum); // exibe a vari�vel sum, 

        // Exercicio 2 
        // Calcule o valor de 2.5 elevado � pot�ncia de 3, utilizando o m�todo pow.
        System.out.printf("\n\nExericio 2:\n");

        Double pot = Math.pow(2.5, 3); // m�todo static.pow da classe Math, utilizado para calcular pot�ncias
        System.out.printf("\nA pot�ncia de 2.5 elevado a 3 �: %f", pot);

        // Exercicio 3
        // Imprima os inteiros de 1 a 20 utilizando um loop while e a vari�vel contadora i. Assuma que a vari�vel i foi declarada mas n�o foi inicializada.
        // Imprima apenas cinco inteiros por linha. [Dica: Utilize o c�lculo i % 5. Quando o valor dessa express�o for 0, imprima um caractere de nova linha;
        // caso contr�riom imprima um caractere de tabula��o. Assuma que esse c�digo � um aplicativo. Utilize o m�todo System.out.println() para imprimir
        // o caractere de nova linha, e utilize o m�todo System.out.print('\t') para imprimir o caractere de tabula��o].

        System.out.printf("\n\nExericio 3:\n");
        int i = 0;

        while(i < 20){// inicio do loop
            if( (i%5 == 0)){ // verifica se o n�mero � multiplo de 5
                System.out.printf("\n"); // se for multiplo de 5, imprime uma nova linha
            }else{
                System.out.printf("\t"); // caso n�o seja, imprime uma tabula��o
            }

            System.out.printf("%d", i++); // exibe o n�mero e incrementa a vari�vel i
        }// fim do while

        // Repita o exercicio 3, utilizando uma instru��o for
        System.out.printf("\n\nExericio 4:\n");

        for( i = 0 ; i < 20 ; i ++){ // inicio do loop
            if( (i%5 == 0)){ // verifica se o n�mero � multiplo de 5
                System.out.printf("\n"); // se for multiplo de 5, imprime uma nova linha
            }else{
                System.out.printf("\t"); // caso n�o seja, imprime uma tabula��o
            }

            System.out.printf("%d", i); // exibe o n�mero e incrementa a vari�vel i
        }// fim do while

        //Localize o erro em cada um dos seguintes segmentos de c�digo e explique como corrigi-los:
        System.out.printf("\n\nExericio 5:\n");
        
        System.out.printf("\nLocalize o erro em cada um dos seguintes segmentos de c�digo e explique como corrigi-los: ");

        System.out.printf("\n\na)\n"+ 
            "\ti = 1;\n" + 
            "\twhile( i <= 10);\n" + // Aqui se encontra o erro
            "\t\ti++;\n" + 
            "\t}\n");

        System.out.printf("O erro se encontra na linha:\n" +
            "while( i <= 10);\n" +
            "falta a abertura de colchetes para a estrutura do while e o ponto e virgula criaria um loop infinito pois sua strutura estaria vazia." +
            "\n\n"); // Mensagem explicando o erro.
            
        System.out.printf("\n\nb)\n"+ 
            "\tfor ( k = 0.1 ; k != 1.0 ; k += 0.1 )\n" + 
            "\tSystem.out.println(k);\n\n"); // Aqui se encontra o erro

        
        System.out.printf("O erro se encontra na instru��o for:\n" +
            "utiliza um n�mero de ponto flutuante como vari�vel de controle pode n�o funcionar, j� que s�o representados aproximadamente peal maioria dos computadores \n" +
            "Utilizar um inteiro seria mais viavel " + 
            "\n\n"); // Mensagem explicando o erro.

        System.out.printf("\n\nc)\n"+ 
            "\tswitch(n)\n\t{\n" + 
            "\t\tcase 1:\n" +
            "\t\t\tSystem.out.println(\"The number is 1\");\n" + 
            "\t\tcase 2:\n" +
            "\t\t\tSystem.out.println(\"The number is 2\");\n" + 
            "\t\t\tBreak;\n" + 
            "\t\tdefault:\n" +
            "\t\t\tSystem.out.println(\"The number is not 1 or 2\");\n" + 
            "\t\t\tbreak;\n\t}\n" );

        
        System.out.printf("A instru��o break n�o foi inserida ap�s o primeiro case.\n" +
            "N�o � necessariamente um erro, caso queira que a instru��o do case 2 execute sempre que a instru��o case 1 executar." +
            "Adicionar o break no primeiro case corrigiria o c�digo." + 
            "\n\n"); // Mensagem explicando o erro.

            
        System.out.printf("\n\nd)\n"+ 
            "O seguinte c�digo deve imprimir os valores 1 a 10: \n" + 
            "\twhile ( n < 10 )\n" + // Aqui se encontra o erro
            "\tSystem.out.println(n++);\n\n"); 

        
        System.out.printf("O erro se encontra na instru��o while:\n" +
            "O operador usado est� errado, a condi��o se torna falsa antes de exibir o valor de 10." +
            "Utilizar o operador <= (Menor\\Igual) ou alterar o limite de 10 para 11 " + 
            "\n\n"); // Mensagem explicando o erro.

        


    }
}