package factory;

import books.Book;
import books.ComicBook;
import books.HistoryBook;

public class CoolBookFactory implements BookFactory {

    public String bookType;
    
    public CoolBookFactory(String bookType){
        this.bookType = bookType;
    }

    @Override
    public Book createBook() {
        if(this.bookType.equals( "Comic")){
            return new ComicBook();
        }
        else if(this.bookType.equals("History")){
            return new HistoryBook();
        }
        return null;
    }
}
