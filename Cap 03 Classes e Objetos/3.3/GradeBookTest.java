//Figura 3.2: GradeBookTest.java
//Criando um objeto GradeBook e chamando seu método displayMessage


//figura 3.5: GradeBookTest.java
//Cria Objeto GradeBook e passa uma String para seu método displayMessage.


import java.util.Scanner;

public class GradeBookTest {
    //método main inicia a execução de programa
    public static void main(String[] args){

        //cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook();

        //prompt para entrada do nome do curso
        System.out.println("Please enter the course name: ");
        myGradeBook.setCourseName(input.nextLine()); //lê uma linha de texto
        System.out.println();
        
        //chama método displayMessage de myGradeBook
        //e passa nameOfCourse como um argumento
        myGradeBook.displayMessage( myGradeBook.getCourseName() );

    }//fim de main
    
}//fim da classe GradeBookTest
