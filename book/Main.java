import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        
        BookPrinter printerr = new BookPrinter(book);

        BookToFile publisher = new BookToFile(printerr);
        publisher.printToFile();

        BookToScreen reader = new BookToScreen(printerr);
        reader.printToScreen();
    }
}
