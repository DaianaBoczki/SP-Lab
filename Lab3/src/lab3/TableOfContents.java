package lab3;

import java.util.ArrayList;

public class TableOfContents implements Element{
    private Book book;
    protected ArrayList<Element> content = new ArrayList<>();

    public TableOfContents(Book book) {
        this.book = book;
    }

    public void print() {
        for(Element i: content)
            i.print();
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

    @Override
    public Element clone() {
        return new TableOfContents(this.book);
    }
}