// Figura 7.15: GradeBookTest.java
// GradeBookTest cria um objeto GradeBOok utilizando um array de notas.
// ent�o invoca um m�todo processGrades para analis�-las

public class GradeBookTest {
    // m�todo main inicia a execu��o de programa
    public static void main (String[] args){
        // array de notas de aluno
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook myGradeBook = new GradeBook( 
            "CS101 introduction to Java Programming", gradesArray );

        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }

}
