package book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //конструктор: заглавие, година, автори.... (0 или повече)
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        //1. двата класа се зипват -> трябва да се изтрият първите редове и в двата класа: package {packageName};
        //2. зипваме самия package
    }
}
