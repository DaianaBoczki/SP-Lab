package lab5;
import java.util.ArrayList;

public class Table implements Element{
    protected String title;
    protected ArrayList<Element> content = new ArrayList<>();

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        System.out.println("Table: " + title);
    }
}