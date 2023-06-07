package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
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
}
