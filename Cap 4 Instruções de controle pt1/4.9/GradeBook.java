// Figura 4.9: GradeBook.Java
// Classe GradeBook que resolve o problema da média da classe
// utilizando repetição controlada por contador.

import java.util.Scanner;

public class GradeBook {
    private String courseName; // nome do curso que esse GradeBook representa

    // o construtor inicializa courseName
    public GradeBook(String name){
        courseName = name; // inicializa courseName
    } // fim do construtor

    // método para configurar o nome do curso
    public void setCourseName (String name){
        courseName = name; // armazena o nome do curso
    } // fim do método setCourseName

    // método para recuperar o nome do curso
    public String getCourseName(){
        return courseName; 
    } // fim do método getCourseName

    // exibe uma mensagem de boas-vindas ao usuário GradeBook
    public void displayMessage(){
        // getCourseName obtém o nome do curso
        System.out.printf("Welcome to the GradeBook for \n%s\n\n", 
            getCourseName());
    }// fim do método displayMessage

    // determina a média da classe com base em 10 notas inseridas
    public void determineClassAverage(){
        // cria Scanner para obter  entrada da janela de comando
        Scanner input = new Scanner(System.in);

        int total; // soma das notas inseridas pelo usuário
        int gradeCounter; // número da nota a ser inserida a seguir
        int grade; // valor da nota inserida pelo usuário
        double average; // média das notas

        // fase de inicialização
        total = 0; // inicializa o total
        gradeCounter = 0; // inicializa o contador de loops

        // fase de processamento
        // solicita entrada e lê a nota do usuário
        System.out.print("Enter Grade or -1 to quit: ");
        grade = input.nextInt();

        // faz o loop até ler o valor de sentinela inserido pelo usuário
        while (grade != -1){

            total = total + grade; // adiciona grade a total
            gradeCounter = gradeCounter + 1; // incrementa o contador por 1

            // solicita entrada e lê a próxima nota fornecida pelo usuário
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt(); // insere a próxima nota
        }// fim do while

        // fase de término
        // se usuário inseriu pelo menos uma nota...
        if(gradeCounter != 0){
            // calcula a média de todas as notas inseridas
            average = (double) total / gradeCounter; // divisão de ints produz um int

            // exibe o total e a média (com 2 digitos de precisão)
            System.out.printf("\nTotal of all %d grades is %d\n", gradeCounter, total);    
            System.out.printf("Class average is %.2f\n", average);
        }
        else{ // nenhuma nota foi inserida, então gera mensagem apropriada 
            System.out.printf("No grades were entered");
        }
    } // fim do método determineClassAverage
}// fim da classe GradeBook