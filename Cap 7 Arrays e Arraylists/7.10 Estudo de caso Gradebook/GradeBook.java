// Figura 7.18: GradeBook.java
// classe GradeBook com um array bidimensional para armazenar notas

public class GradeBook {
    private String courseName; // nome do curso que este livro de nota representa
    private int[][] grades;

    // construtor de dois argumentos inicializa courseName e array de notas
    public GradeBook (String name, int[][] gradesArray){
        courseName = name; // inicializa courseName
        grades = gradesArray; // níveis de armazenamento
    } // fim do construtor GradeBook de dois argumentos

    // método para configura o nome do curso
    public void setCourseNanem(String name){
        courseName = name; // armazena o nome do curso
    } // fim do método setCourseName

    // método para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    } // fim do método getCourseName
    
    // exibe uma mensagem de boas-vindas para o usuário do GradeBook
    public void displayMessage(){
        // getCourseName obtém o nome do curso
        System.out.printf("Welcome to the grade book for\n%s!\n\n", 
            getCourseName());
    } // fim do método displayMessage

    // realiza várias operações de dados
    public void processGrades(){
        // gera saída de array de notas
        outputGrades();

        // chama métodos getMinimum e get Maximum
        System.out.printf("\n%s %d\n%s %d\n\n",
            "Lowest grade in the grade book is", getMinimum(), 
            "Highest grade in the grade book is", getMaximum());

        // gera saída de gráfico de distribuição de notas de todas as notas de em todos os testes
        outputBarChart();
    } // fim do método processGrades

    // localiza nota mínima
    public int getMinimum(){
        // assume que o primeiro elemento de array de notas é o menor
        int lowGrade = grades[0][0];

        // faz um loop pelas linhas do array de notas
        for (int [] studentGrades: grades){
            // faz um loop pelas colunas da linha atual
            for (int grade : studentGrades){
                // se a nota for menor que lowGrade, atribui a nota a lowGrade
                if(grade < lowGrade)
                    lowGrade = grade;
            } // fim do for interno
        } // fim do for externo

        return lowGrade; // retorna nota mais baixa
    } // fim do método getMinimum

    // localiza nota máxima
    public int getMaximum(){
        // assume que o primeiro elemento de array de notas é o maior
        int highGrade = grades[0][0];

        // faz um loop pelas linhas do array de notas
        for (int [] studentGrades: grades){
            // faz um loop pelas colunas da linha atual
            for (int grade : studentGrades){
                // se a nota for maior que highGrade, atribui a nota a highGrade
                if(grade > highGrade)
                    highGrade = grade;
            } // fim do for interno
        } // fim do for externo

        return highGrade; // retorna nota mais alta
    }// fim do método getMaximum

    // determina a média do conjunto particular de notas
    public double getAverage(int[] setOfGrades){
        int total = 0; // inicializa o total

        // soma de notas de um aluno
        for ( int grade : setOfGrades)
            total += grade;

        // retorna média de notas
        return (double) total / setOfGrades.length;
    } // fim do método getAverage

    // gera saída do gráfico de barras para exibir distribuição total de notas
    public void outputBarChart(){
        System.out.println("Overall grade distribution: ");

        // armazena frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        // para cada nota em GradeBook, incrementa a frequência certa
        for (int [] studentGrades : grades){
            for (int grade : studentGrades)
                ++frequency[grade/10];
        } // fim do for externo

        // para cada frequência de nota, imprime barra no gráfico
        for ( int count = 0 ; count < frequency.length ; count++ ) {
            // imprime rótulo de barra ("00-09: ", ..., "99-99: ", "100: ")
            if( count == 10){
                System.out.printf("%5d: ", 100 );
            }  
            else{
                System.out.printf("%02d-%02d: ", 
                    count * 10, count * 10 + 9);
            }   
        

            for (int stars = 0 ; stars < frequency[count] ; stars++){
                System.out.printf("*");
            }

            System.out.println(); // inicia uma nova linha de saída
        } // fim do for externo
    } // fim do método outputBarChart

    // gera a saída do conteúdo do array de notas
    public void outputGrades(){
        System.out.println("The grades are:\n");
        System.out.print("            "); // alinha títulos da coluna

        // cria um título de coluna para cada um dos testes
        for ( int test = 0 ; test < grades[0].length ; test++)
            System.out.printf("Test %d  ", test + 1);

        System.out.println("Average"); // títutlo da coluna de média do aluno

        // cria linha/colunas de texto que representam notas de array
        for ( int student = 0 ; student < grades.length ; student++){
            System.out.printf("Student %2d", student + 1);

            for( int test : grades[student])
                System.out.printf("%8d", test); // gera saída de notas do aluno
            
                // chama método getAverage para calcular a média do aluno:
                // passa linha de notas como argumento para getAverage
                double average = getAverage(grades[student]);
                System.out.printf("%9.2f\n", average);
        }// fim do for externo
    } // fim do método outputGrades
} // fim da classe GradeBook
