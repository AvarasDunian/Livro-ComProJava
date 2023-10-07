// Figura 8.10: Book.java
// Declarando um tipo enum com um construtor e campos de 
// inst�ncia expl�citos e m�todos de acesso para esses campos

public enum Book {
    // declara constantes do tipo enum
    JHTP("Java How to Program", "2010"),
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet & World Wide Web How to Program","2008"),
    CPPHTP("C++ How to Program", "2008"),
    VBHTP("Visual Basic 2008 How to Program", "2009"),
    CSHARPHTP("Visual C# 2008 How to Program", "2009");

    // campos de inst�ncia 
    private final String title; // t�tulo de livro
    private final String copyrightYear; // ano dos direitos autorais

    // construtor enum
    Book ( String bookTitle, String year ){
        title = bookTitle;
        copyrightYear = year;
    } // fim do construtor enum book

    // m�todo de acesso para o t�tulo de campo
    public String getTitle(){
        return title;
    } // fim do m�todo getTitle

    // m�todo de acesso para o campo copyrightYear
    public String getCopyrightYear(){
        return copyrightYear;
    } // fim do m�todo getCopyrightYear
} // fim do enum ebook
