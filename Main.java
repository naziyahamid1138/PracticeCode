
    public class Main {
    public static void main(String[] args) {
        Book b = new Book(101, "Java Basics", "John", 500);
 // b.setBookID(102);
        b.display();
        b.displayTax(1000);
        b.displayTax();
        b.setBookID(102);

        System.out.println("Updated Book ID: " + b.getBookID());
    }
}

