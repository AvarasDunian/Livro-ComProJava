// Figura 8.10: Book.java
// Declarando um tipo enum com um construtor e campos de 
// instância explícitos e métodos de acesso para esses campos

public enum Book {
    // declara constantes do tipo enum
    JHTP("Java How to Program", "2010"),
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet & World Wide Web How to Program","2008"),
    CPPHTP("C++ How to Program", "2008"),
    VBHTP("Visual Basic 2008 How to Program", "2009"),
    CSHARPHTP("Visual C# 2008 How to Program", "2009");

    // campos de instância 
    private final String title; // título de livro
    private final String copyrightYear; // ano dos direitos autorais

    // construtor enum
    Book ( String bookTitle, String year ){
        title = bookTitle;
        copyrightYear = year;
    } // fim do construtor enum book

    // método de acesso para o título de campo
    public String getTitle(){
        return title;
    } // fim do método getTitle

    // método de acesso para o campo copyrightYear
    public String getCopyrightYear(){
        return copyrightYear;
    } // fim do método getCopyrightYear
} // fim do enum ebook
