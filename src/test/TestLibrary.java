package test;


import library.*;

public class TestLibrary {
    public static void main(String[] args) {
        Author king = new Author("Stiven","King");
        Author pushkin = new Author("Alexandr","Pushkin");
        Name vasya = new Name("Vasya", "Pupkin", "+38050");
        Name petya = new Name("Petya", "Ivanov", "+38063");
        Book book = new Book("Green Mile",2012,king);
        Book book2 = new Book("The Shawshank Redemption",2014,king);
        Book book3 = new Book("Evgeniy Onegin",2016,pushkin);
        Book book4 = new Book("Ruslan & Ludmila",2113,pushkin);
        Reader reader = new Reader(vasya);
        Reader reader2 = new Reader(petya);
        Library library = new Library();
        library.addReader(reader2);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        library.showReaderList();

        System.out.println();

        System.out.println(library.getBookList().toString());

        System.out.println();

        System.out.println("add book = " + library.addBook(book));

        System.out.println();

        System.out.println("add reader = " + library.addReader(reader));

        System.out.println();

        System.out.println("give book reader = " + library.giveBookReader(reader,book));

        System.out.println();

        library.showBookListAllReader();

        System.out.println();

        library.showBookListReader(reader);

        System.out.println();

        System.out.println("black list = " + library.addReaderToBlackList(reader2));

        System.out.println();

        library.showAllBookAuthor(king);

        System.out.println();

        library.showNewBook();








    }
}
