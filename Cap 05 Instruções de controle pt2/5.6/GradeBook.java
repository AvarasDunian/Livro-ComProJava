// Figura 5.9: GradeBook.java
// A Classe GradeBook utiliza a instrução switch para contar as letras das notas escolares.
import java.util.Scanner;

public class GradeBook {

    private String courseName; // nome do curso que essa GradeBook representa
    // variáveis de instância int são inicializadas em 0 por padrão
    private int total; // soma das notas
    private int gradeCounter; // número de notas inseridas
    private int aCount; // contagem de notas A
    private int bCount; // contagem de notas B
    private int cCount; // contagem de notas C
    private int dCount; // contagem de notas D
    private int fCount; // contagem de notas F

    // construtor inicializa courseName
    public GradeBook(String name){
        courseName = name; // inicializa courseName
    } // fim do construtor

    // método para configura o nome do curso
    public void setCourseName(String name){
        courseName = name; // armazena o nome do curso
    } // fim do método setCOurseName

    // método para recuperar o nome do curso
    public String getCourseName(){
        return courseName; // retorna o nome do curso
    }// fim do método getCourseName

    // exibe uma mensagem de boas-vindas para o usuário GradeBook
    public void displayMessage(){
        // getCourseName obtém o nome do curso
        System.out.printf("Welcome to the grade book for \n%s!\n\n", 
            getCourseName());
    } // fim do método DisplayMessage

    // insere número arbítrário de notas do usuário
    public void inputGrades(){
        Scanner input = new Scanner(System.in);

        int grade; // nota inserida pelo usuário

        System.out.printf("%s\n%s\n  %s\n  %s\n", 
            "Enter the integer grades in the range 0-100.",
            "Type the end-of-file indicator to terminate input:",
            "On UNIX/LINUX/MAC OS X type <Ctrl> d then press Enter",
            "On Windows type <Ctrl> z then press Enter");

        // faz loop até usuário inserir o indicador de fim do arquivo
        while (input.hasNext()){
            grade = input.nextInt(); // lê a nota
            total += grade; // adiciona grade a total
            ++gradeCounter; // incrementa o número de notas
        
            // chama o método para incrementar o contador adequado
            incrementLetterGradeCounter(grade);
        } // fim do while
    }// fim do método inputGrades

    // adiciona 1 ao contador adequado da nota especificada
    private void incrementLetterGradeCounter(int grade)
    {
        // determina a nota que foi inserida
        switch (grade / 10){
            case 9:  // a notava entre 90
            case 10: // e 100.0 inclusivo
                ++aCount; // incrementa aCount
                break; // necessário para sair de switch

            case 8: // a nota estava entre 80 e 89
                ++bCount; // incrementa bCount
                break; // sai de switch

            case 7: // a nota estava entre 70 e 79
                ++cCount; // incrementa cCount
                break; // sai de switch

            case 6: // a nota estava entre 60 e 69
                ++dCount; // incrementa dCount
                break; // sai de switch

                default: // a nota era menor que 60
                ++fCount; // incrementa fCount
                break; // opcional; sairá do switch de qualquer jeito
            } // fim do switch
    } // fim do método incrementLetterGradeCounter

    // exibe um relatório baseado nas notas inseridas pelo usuário
    public void displayGradeReport(){
        System.out.println("\nGrade Report: ");

        // se usuário inseriu pelo menos uma nota...
        if (gradeCounter != 0){
            // calcula a média de toas as notas inseridas
            double average = (double) total  / gradeCounter;

            // Gera a saída de resumo de resultados
            System.out.printf("Total of the %d grades entered is %d\n", 
                gradeCounter, total );

            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
            "Number of students who received each grade: ",
            "A: ", aCount, // exibe número de notas A
            "B: ", bCount, // exibe número de notas B
            "C: ", cCount, // exibe número de notas C
            "D: ", dCount, // exibe número de notas D
            "F: ", fCount ); // exibe número de notas F

        } // fim do if
        else{ // Notas não foram inseridas, portanto imprime mensagem apropriada
            System.out.println("No grades were entered");
        }
    } // fim do método displayGradeREport
} // fim da classe GradeBook