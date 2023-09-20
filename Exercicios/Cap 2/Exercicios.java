//app de exercicios do cap 2 do livro

import java.util.Scanner;

public class Exercicios{
    public static void main(String[] args){
        int num1, num2, num3;
        int som, sub, mut, div;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Aqui estão os aplicativos solicitados no cap do livro Java - Como Programa. 8 edição:");
        System.out.print("Exercício 2.14:");
        System.out.print(" 1 ");
        System.out.printf("%d %d", 2, 3);
        System.out.println(" 4.");

        System.out.println("Exercício 2.15: ");
        System.out.print("Adicione um numero: ");
        num1 = scan.nextInt();
        System.out.print("Adicione um segundo numero: ");
        num2 = scan.nextInt();

        som = num1 + num2;
        sub = num1 - num2;
        mut = num1 * num2;
        div = num1 / num2;

        System.out.printf("A soma desses numeros é: %d\n", som);
        System.out.printf("Subtraindo-os, tem-se o valor: %d\n", sub);
        System.out.printf("Já o resultado da divisão deles é: %d\n", div);
        System.out.printf("Enquanto a multiplicão resulta em: %d\n", mut);

        System.out.println("Exercício 2.16");
        System.out.print("Adicione um numero: ");
        num1 = scan.nextInt();
        System.out.print("Adicione um segundo numero: ");
        num2 = scan.nextInt();

        if(num1 > num2){
            System.out.printf("O numero maior inserido é o: %d\n", num1);
        }else
            if(num2 > num1){
                System.out.printf("O numero maior inserido é o: %d\n", num2);
            }

        if(num1 == num2){
            System.out.println("These number are equal");
        }

        System.out.println("Exercicio 2.17");
    }
}
