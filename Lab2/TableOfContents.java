package lab1;

public class TableOfContents {
    private Book book;

    public TableOfContents(Book book) {
        this.book = book;
    }

    public void print() {
        book.print();
    }
}
