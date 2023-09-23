//Exercicios de autorevisão do Cap 5 

public class ExerciciosCap5{
    public static void main(String[] args){
        //Exercicio 1
        //Some os inteiros impares entre 1 e 9 utilizando uma istrução for. Assuma que as variáveis de inteiro sum e count foram declaradas:
        
        int sum = 0; // Declara a variável sum
        System.out.printf("Exericio 1:\n");
        for( int i = 0 ; i < 10 ; i++){ // inicia o for
            if( !(i%2 == 0) ){ // usando o operando mod, calcula-se o resto de uma divisão, caso o resto da divisão por dois é 0 o numero é par, caso contrario, ímpar.
                System.out.printf("%d ", i); // exibe o número ímpar
                sum += i; //adiciona o número impar a variável sum
            }
        }

        System.out.printf("\n\nThe sum of odd numbers from 1 to 10 is: %d", sum); // exibe a variável sum, 

        // Exercicio 2 
        // Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
        System.out.printf("\n\nExericio 2:\n");

        Double pot = Math.pow(2.5, 3); // método static.pow da classe Math, utilizado para calcular potências
        System.out.printf("\nA potência de 2.5 elevado a 3 é: %f", pot);

        // Exercicio 3
        // Imprima os inteiros de 1 a 20 utilizando um loop while e a variável contadora i. Assuma que a variável i foi declarada mas não foi inicializada.
        // Imprima apenas cinco inteiros por linha. [Dica: Utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima um caractere de nova linha;
        // caso contráriom imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize o método System.out.println() para imprimir
        // o caractere de nova linha, e utilize o método System.out.print('\t') para imprimir o caractere de tabulação].

        System.out.printf("\n\nExericio 3:\n");
        int i = 0;

        while(i < 20){// inicio do loop
            if( (i%5 == 0)){ // verifica se o número é multiplo de 5
                System.out.printf("\n"); // se for multiplo de 5, imprime uma nova linha
            }else{
                System.out.printf("\t"); // caso não seja, imprime uma tabulação
            }

            System.out.printf("%d", i++); // exibe o número e incrementa a variável i
        }// fim do while

        // Repita o exercicio 3, utilizando uma instrução for
        System.out.printf("\n\nExericio 4:\n");

        for( i = 0 ; i < 20 ; i ++){ // inicio do loop
            if( (i%5 == 0)){ // verifica se o número é multiplo de 5
                System.out.printf("\n"); // se for multiplo de 5, imprime uma nova linha
            }else{
                System.out.printf("\t"); // caso não seja, imprime uma tabulação
            }

            System.out.printf("%d", i); // exibe o número e incrementa a variável i
        }// fim do while

        //Localize o erro em cada um dos seguintes segmentos de código e explique como corrigi-los:
        System.out.printf("\n\nExericio 5:\n");
        
        System.out.printf("\nLocalize o erro em cada um dos seguintes segmentos de código e explique como corrigi-los: ");

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

        
        System.out.printf("O erro se encontra na instrução for:\n" +
            "utiliza um número de ponto flutuante como variável de controle pode não funcionar, já que são representados aproximadamente peal maioria dos computadores \n" +
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

        
        System.out.printf("A instrução break não foi inserida após o primeiro case.\n" +
            "Não é necessariamente um erro, caso queira que a instrução do case 2 execute sempre que a instrução case 1 executar." +
            "Adicionar o break no primeiro case corrigiria o código." + 
            "\n\n"); // Mensagem explicando o erro.

            
        System.out.printf("\n\nd)\n"+ 
            "O seguinte código deve imprimir os valores 1 a 10: \n" + 
            "\twhile ( n < 10 )\n" + // Aqui se encontra o erro
            "\tSystem.out.println(n++);\n\n"); 

        
        System.out.printf("O erro se encontra na instrução while:\n" +
            "O operador usado está errado, a condição se torna falsa antes de exibir o valor de 10." +
            "Utilizar o operador <= (Menor\\Igual) ou alterar o limite de 10 para 11 " + 
            "\n\n"); // Mensagem explicando o erro.

        


    }
}