// Figura 10.12: Invoice.java
// Classe Invoice que implementa Payable.

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // construtor com quatro argumentos
    public Invoice( String part, String description, int count, double price ){
        partNumber = part;
        partDescription = description;
        setQuantity ( count); // valida e armazena a quantidade
        setPricePerItem ( price ); // valida e armazena o pre�o por item
    } // fim do construtor Invoice de quatro argumentos

    // congiura o n�mero de pe�as
    public void setPartNumber( String part ){
        partNumber = part; // deve validar
    } // fim do m�todo setPartNumber

    // obt�m o n�mero da pe�a
    public String getPartNumber()
    {
        return partNumber;
    } // fim do m�todo getPartNumber

    // configura a descri��o
    public void setPartDescription( String description ){
        partDescription = description; // deve validar
    } // fim do m�todo setPartDescription

    // obt�m a descri��o
    public String getPartDescription(){
        return partDescription;
    } // fim do m�todo getPartDescription

    // configura a quantidade
    public void setQuantity(int count){
        quantity = ( count < 0 ) ? 0 : count; // a quantidade n�o pode ser negativa
    } // fim do m�todo setQuantity

    // obt�m a quantidade
    public int getQuantity(){
        return quantity;
    } // fim do m�todo getQuantity

    // configura pre�o por item
    public void setPricePerItem( double price ){
        pricePerItem = ( price < 0.0 ) ? 0.0 : price;
    } // fim do m�todo setPricePerItem

    // obt�m pre�o por item
    public double getPricePerItem(){
        return pricePerItem;
    } // fim do m�todo getPricePerItem

    // retorno da representa��o de String do objeto Invoice
    @Override
    public String toString()
    {
        return String.format("%s: \n%s: %s (%s) \n%s %d \n%s: $%,.2f",
            "invoice", "part number", getPartNumber(), getPartDescription(), 
            "quantity", getQuantity(), "price per item", getPricePerItem());
    } // fim do m�todo toString

    // m�todo requerido para executar o contrato com a interface Payable
    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem(); // calcula o custo total
    } // fim do m�todo getPaymentAmount
} // fim da classe Invoice
