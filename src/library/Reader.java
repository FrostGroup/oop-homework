package library;

public class Reader {
    private Name name;
    private Book[] bookList = new Book[5];

    public Reader(Name name) {
        this.name = name;
    }

    public Book[] takeBook(Book book){
        return bookList;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }
}
