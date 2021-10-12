package lab3;

import java.util.ArrayList;

public class Table implements Element{
    String title;
    protected ArrayList<Element> content = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Table(String title) {
        this.title = title;
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
}