package lab5;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println( "Author: " + name);
    }
}