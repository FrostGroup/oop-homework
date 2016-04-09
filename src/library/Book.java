package library;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String showBook() {
        return this.toString();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    @Override
    public String toString(){
        return "Book" + '\n' +
                "name = " + name + '\n' +
                author.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || obj.getClass() != Book.class){
            return false;
        }

        Book temp = (Book) obj;

        return name.equals(temp.name )&&
                author.equals(temp.author) &&
                year == temp.year;
    }
}
