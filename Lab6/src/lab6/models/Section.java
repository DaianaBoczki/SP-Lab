package lab6.models;

import java.util.ArrayList;

public class Section implements Element, Visitee {
    protected String title;
    public ArrayList<Element> content = new ArrayList<>();
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
    }

    @Override
    public void remove(Element e) {
        content.remove(e);
    }

    public void accept(Visitor v){
        v.visitSection(this);
    }
}