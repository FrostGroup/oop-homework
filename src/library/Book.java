package library;

public class Book {
    private String name;
    private Name author;
    private int year;

    public Book(String name, int year, Name author) {

        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Name getAuthor() {
        return author;
    }

    public void setAuthor(Name author) {
        this.author = author;
    }

    public void showBook (Book book){
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
