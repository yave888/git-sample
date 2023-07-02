package Sisan;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("My Book", 500, "Red", "978-1234567890");
        String name = book.getName();
        String isbn = book.getIsbn();
        System.out.println(name + " ISBN: " + isbn);
    }
}
