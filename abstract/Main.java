<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.sleep();
        d.sound();

        Cat c = new Cat("Kitty");
        c.sleep();
        c.sound();
    }

}
=======

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

>>>>>>> 7174220e1dade00c3e6b42d53214d4b7accdf754
