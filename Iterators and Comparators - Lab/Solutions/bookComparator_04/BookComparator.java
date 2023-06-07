package bookComparison;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    //comparator -> инструмент за сравнение
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int result = firstBook.getTitle().compareTo(secondBook.getTitle());
        //< 0
        // == 0
        // > 0
        if (result == 0) {
            //двете книги имат еднакво заглавие
            return Integer.compare(firstBook.getYear(), secondBook.getYear());
            //< 0 -> first < second
            //== 0 -> first == second
            // > 0 -> first > second
        }
        return result;
    }


}
