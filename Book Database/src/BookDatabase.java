import java.util.HashMap;
import java.util.Map;

public class BookDatabase {
    private static BookDatabase instance;
    private Map<Integer, String> books;
    private int bookId = 1;

    private BookDatabase() {
        books = new HashMap<>();
    }

    public static BookDatabase getInstance() {
        if(instance == null) {
            instance = new BookDatabase();
        }
        return instance;
    }

    public void addBook(String title) {
        boolean bookExist = books.containsValue(title);
        if (bookExist) {
            System.out.println("\nBook already exist.");
        } else {
            books.put(bookId++, title);
            System.out.println("\nBook Added: " + title);
        }
    }

    public void removeBook(int title) {
        String value = books.remove(title);
        if (value == null) {
            System.out.println("\nInvalid Book ID");
        } else {
            System.out.println("\nBook Removed: " + value);
        }
    }

    public void viewBooks() {
        System.out.println("\n----- Book List -----");
        if(books.isEmpty()){
            System.out.println("No Books Found");
        } else {
            for( Map.Entry<Integer, String> entry : books.entrySet() ){
                System.out.println("Book ID: " + entry.getKey() + " = Book Name: " + entry.getValue());
            }
        }
    }
}
