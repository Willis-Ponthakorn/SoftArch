public class BookToScreen implements IBookToScreen {
    private BookPrinter adaptee;
    
    public BookToScreen(BookPrinter adaptee) {
        super();
        this.adaptee = adaptee;
    }
    
    @Override
    public void printToScreen() {
        adaptee.printToScreen();
    }
}