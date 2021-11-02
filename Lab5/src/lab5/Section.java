package lab5;

import java.util.ArrayList;

public class Section implements  Element{
    protected String title;
    protected ArrayList<Element> content = new ArrayList<>();
    protected ArrayList<Element> copy = new ArrayList<>();

    public Section(String title) {
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
        //copy.add(e.clone());
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
        System.out.println(title);
        for(Element e: content)
            e.print();
    }
}