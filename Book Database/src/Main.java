import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookDatabase database = BookDatabase.getInstance();
        Scanner scan = new Scanner(System.in);

        System.out.println("     BOOK DATABASE     ");

        do {
            try {
                System.out.println("\n----- Choose Action -----");
                System.out.println("1 - Add Book");
                System.out.println("2 - Remove Book");
                System.out.println("3 - View Book");
                System.out.println("0 - End Program");
                System.out.println("-------------------------");
                System.out.print("Input Number: ");
                int choice = Integer.parseInt(scan.nextLine());

                if (choice == 1) {
                    System.out.print("Enter Book Name: ");
                    database.addBook(scan.nextLine());
                } else if ( choice == 2) {
                    System.out.print("Enter Book ID: ");
                    database.removeBook(Integer.parseInt(scan.nextLine()));
                } else if ( choice == 3) {
                    database.viewBooks();
                } else if ( choice == 0) {
                    System.out.println("Ending Program...");
                    break;
                } else {
                    System.out.println("Invalid Number");
                }
            } catch (Exception e) {
                System.out.println("\nInvalid Input");
            }
        } while (true);
    }
}
