package lab3;

import java.util.ArrayList;

public class Section implements  Element{
    String title;
    protected ArrayList<Element> content = new ArrayList<>();
    protected ArrayList<Element> copy = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        /*for(Element e: content){
            e.print();
            e.printClones();}*/
        for(int i = 0; i < content.size(); i++){
            content.get(i).print();
            if(copy.get(i) instanceof Paragraph || copy.get(i) instanceof Image) {
                System.out.print("Clone: ");
                copy.get(i).print();
            }
        }
    }

    @Override
    public void add(Element e) {
        content.add(e);
        copy.add(e.clone());
    }

    @Override
    public void remove(Element e) {
        content.remove(e);
    }

    @Override
    public Element get(int i) {
        return content.get(i);
    }

    public Element clone() {
        return new Section(this.title);
    }
}
