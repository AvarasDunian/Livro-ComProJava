// Figura 7.14: GradeBook.java
// classe GradeBook usando um array para armazenar notas de teste.

public class GradeBook {
    private String courseName;
    private int[] grades;

    // construtor de dois argumentos inicializa courseName e o array de notas
    public GradeBook (String name, int[] gradesArray){
        courseName = name; // inicializa courseName
        grades = gradesArray; // niveis de armazenamento
    }

    // método para configurar o nome do curso
    public void setCourseName (String name){
        courseName = name;
    }
    // fim do método setCourseName 

    // método para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    } // fim do método getCourseName

    // exibe uma mensagem de boas-vindas para o usuário GradeBook
    public void displayMessage(){
        //getCourseName obtém o nome do curso
        System.out.printf("Welcome to the grade book for\n%s!\n\n", 
            getCourseName());
    } // fim do método displayMessage

    // realiza várias operações nos dados
    public void processGrades(){
        // gera saída de array de notas
        outputGrades();

        // chama método getAverage para calcular a nota média
        System.out.printf("\nClass average is %.2f\n", getAverage());

        // chama método getMinimum e getMaximum
        System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n", 
            getMinimum(), getMaximum());

        // chama outputBarChart para imprimir gráfico de distribuição de notas
        outputBarChart();
    } // fim do método processGrades

    // localiza nota minima
    public int getMinimum(){
        int lowGrade = grades[0]; // assume que grades[0] é a menor nota

        // faz um looop pelo array de notas
        for (int grade : grades){
            // se nota for mais baixa que lowGrade, essa nota é atribuida a lowGrade
            if(grade < lowGrade)
                lowGrade = grade;
        } // fim do for

        return lowGrade; // retorna nota mais baixa
    } // fim do método getMinimum
    
    // localiza nota máxima
    public int getMaximum(){
        int highGrade = grades[0]; // assume que grades[0] é a mair nota

        // faz o loop pelo array de notas
        for ( int grade : grades ){
            // se a nota for maior que highGrade, atribui essa nota a highGrade
            if (grade > highGrade)
                highGrade = grade; // nova nota mais alta
        } // fim do for

        return highGrade;
    } // fim do método getMaximum

    // determina média para o teste
    public double getAverage(){
        int total = 0; // inicializa o total

        // soma notas de um aluno
        for ( int grade : grades)
            total += grade;

        // retorna média de notas
        return (double) total / grades.length;
    } // fim do método getAverage

    // gera a saída do gráfico de barras exibindo distribuição de notas
    public void outputBarChart(){
        System.out.println("Grade distribution: ");

        // armazena frequência de notas em cada intervalo de 10 notas
        int [] frequency = new int [11];

        // para cada nota, incrementa a frequência apropriada
        for( int grade : grades )
            ++frequency[grade/10];

        // para cada frequência de nota, imprime barra no gráfico
        for (int count = 0 ; count < frequency.length ; count++){
            // imprime rótulo de barra ("00-09: ", ..., "90-99-09: ", "100: ")
            if ( count == 10)
                System.out.printf("%5d: ", 100);
            else 
                System.out.printf("%02d-%02d: ", 
                    count * 10, count * 10 + 9);

            // imprime a barra de asteriscos
            for ( int stars = 0 ; stars < frequency[count] ; stars++){
                System.out.printf("*");
            }

            System.out.println(); // inicia uma nova linha de saída
        } // fim do for externo
    } // fim do método outputBarChart

    // gera saída do conteúdo do array de notas
    public void outputGrades(){
        System.out.println("The grades are:\n");

        // gera a saída da nota de cada aluno
        for (int student = 0 ; student < grades.length ; student++)
            System.out.printf("Student %2d: %3d\n",
                student + 1, grades[student]);
    } // fim do método outputGrades
}// fim da classe GradeBook
