package lab3;

public interface Element {
    public void print();
    public void add(Element e);
    public void remove(Element e);
    public Element get(int i);
    public Element clone();
}
