class Book {
    private int bookID;
    public String title;
    public String author;
    public double price;

    public Book(int a, String b, String c, double d ) {
        bookID = a;
        title = b;
        author = c;
        price = d;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int x) {
        this.bookID = x;
    }

    public void display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public double displayTax(double tax) {ssss
    price =price+tax;
    return price;
    }
    public void displayTax()
    {
        System.out.println("Price with Tax: " + price);
    }

}

