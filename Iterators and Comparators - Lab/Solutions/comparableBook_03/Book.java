package comparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    //полета
    private String title; //заглавие
    private int year; //година на издаване
    private List<String> authors; //списък с авторите

    //методи
    //конструктор
    public Book (String title, int year, String... authors) {
        //нова празна книга
        this.title = title;
        this.year = year;
        //[автори] -> {автори}
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }


    //getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public int compareTo(Book otherBook) {
        //1. Title
        //2. Year
        int resultTitle = this.title.compareTo(otherBook.title);
        //compareTo от String
        //0 -> ако двата текста са напълно еднакви
        //> 0 -> ако първия е по-рано по азбучен ред
        //< 0 -> ако втория е по-рано по азбучен ред
        if (resultTitle == 0) {
            //двете книги са с еднакви заглавия
            resultTitle = Integer.compare(this.year, otherBook.year);
            //Integer.compare
            //0 -> ако годините са еднакви
            //1 -> първата > втората
            //-1 -> втората > първата
        }
        return resultTitle;
    }
}
