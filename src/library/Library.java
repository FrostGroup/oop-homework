package library;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List <Reader> readerList = new ArrayList();
    private List <Reader> readerBlackList = new ArrayList();
    private List <Book> bookList = new ArrayList();
    private List <Book> bookReaderList = new ArrayList();

    public Library(){
    }

    public Library(Reader reader, Book book) {
        this.readerList.add(reader);
        this.bookList.add(book);
    }

    public boolean addBook (Book book){
        return bookList.add(book);
    }

    public boolean addReader (Reader reader){
        return readerList.add(reader);
    }

    public boolean addReaderToBlackList(Reader reader){
        return readerBlackList.add(reader);
    }

    public boolean giveBookReader (Reader reader, Book book){

        if(!readerCanTakeBook(reader)){
            return false;
        }

        if(presenceBookLibrary(book) && reader.addBook(book)){
            bookReaderList.add(book);
            bookList.remove(book);
            return true;
        }
        return false;
    }

    public void showBookListAllReader(){
        for (Book book : bookReaderList) {
            System.out.println(book.toString());
        }
    }

    public void showBookListReader(Reader reader){
        for (Book book : reader.getBookList()) {
            if (book != null)
            System.out.println(book.toString());
        }
    }

    public void showAllBookAuthor(Author author){
        for (Book book : bookList) {
            if(book.getAuthor().equals(author))
                System.out.println(book.toString());
        }
    }

    public void showNewBook(){
        for (Book book : bookList) {
            if(book.getYear() >= 2013)
                System.out.println(book.toString());
        }
    }

    public void showReaderList(){
        for (Reader reader : readerList) {
            if(reader != null)
                System.out.println(reader.getName().toString());
        }
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public List<Reader> getReaderBlackList() {
        return readerBlackList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> getBookReaderList() {
        return bookReaderList;
    }

    private boolean readerCanTakeBook(Reader reader){
        boolean res = false;
        for (int i = 0; i < reader.getBookList().length; i++) {
            if (reader.getBookList()[i] == null){
                res = true;
                break;
            }
        }
        for (int i = 0; i < readerBlackList.size(); i++) {
            if (readerBlackList.get(i).equals(reader)){
                res = false;
                break;
            }
        }
        return res;
    }

    private boolean presenceBookLibrary(Book book){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).equals(book)) {
                return true;
            }
        }
        return false;
    }

}
