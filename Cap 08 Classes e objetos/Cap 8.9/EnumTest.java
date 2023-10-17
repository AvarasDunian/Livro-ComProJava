// Figura 8.11: EnumTest.java
// testando o tipo enum Book
import java.util.EnumSet;

public class EnumTest {
    public static void main ( String[] args ){ 
        System.out.println("All books: \n");

        // imprime todos os livros em enum Book
        for(Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n", book,
                book.getTitle(), book.getCopyrightYear());

        System.out.println("\nDisplay a range of enum constants:\n");

        // imprime os primeiros quatro livros
        for ( Book book : EnumSet.range( Book.JHTP, Book.CPPHTP ))
            System.out.printf("%-10s%-45s%s\n", book,
                book.getTitle(),  book.getCopyrightYear());

    } // fim de main
}// fim da classe EnumTest
