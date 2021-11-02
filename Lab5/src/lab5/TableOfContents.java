package lab5;
import java.util.ArrayList;

public class TableOfContents implements Element{
    protected  Book book;
    protected ArrayList<Element> content = new ArrayList<>();

    public TableOfContents(Book book) {
        this.book = book;
    }

    @Override
    public void add(Element e) {
        content.add(e);
    }

    @Override
    public void remove(Element e) {
        content.remove(e);
    }

    @Override
    public Element get(int i) {
        return content.get(i);
    }

    public void print() {
        System.out.println("TableOfContents: " + book);
    }
}