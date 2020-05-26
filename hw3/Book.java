package teach.homework.hw3;

public class Book {
    String author;
    String bookname;

    public Book(String author, String bookname) {
        this.author = author;
        this.bookname = bookname;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book)obj;
        return author.equals(b.author) && bookname.equals(b.bookname);

    }

    public void print(){
        System.out.println("Author: " + author + " " + "Book: " + bookname);
    }
}
