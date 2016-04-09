package library;

import com.sun.org.apache.regexp.internal.RE;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private Name name;
    private Book[] bookList = new Book[3];

    public Reader(Name name) {
        this.name = name;
    }

    public boolean addBook(Book book) {
        Boolean res = false;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null){
                bookList[i] = book;
                res = true;
                break;
            }
        }
        return res;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(obj == null || obj.getClass() != Reader.class){
            return false;
        }

        Reader temp = (Reader) obj;

        return name.equals(temp.name);
    }
}
