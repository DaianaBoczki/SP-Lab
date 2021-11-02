package lab5;

import javax.naming.Context;
import java.util.ArrayList;

public class Paragraph implements Element{
    protected String text;
    protected ArrayList<Element> content = new ArrayList<>();

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        System.out.println("Paragraph: " + text);
    }

    public void setAlignStrategy(AlignStrategy strategy){
        strategy.render(this);
    }
}