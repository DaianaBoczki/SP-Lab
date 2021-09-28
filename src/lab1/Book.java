package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> paragraph;
    private List<String> image;
    private List<String> table;

    public Book(String title) {
        this.title = title;
        this.paragraph = new ArrayList<String>();
        this.image = new ArrayList<String>();
        this.table = new ArrayList<String>();
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraph=" + paragraph +
                ", image=" + image +
                ", table=" + table +
                '}';
    }

    public void print() {
        System.out.println( "Book{" +
                "title='" + title + '\'' +
                ", paragraph=" + paragraph +
                ", image=" + image +
                ", table=" + table +
                '}');
    }

    public void createNewParagraph(String paragraph){
        this.paragraph.add(paragraph);
    }

    public void createNewImage(String image){
        this.image.add(image);
    }

    public void createNewTable(String table){
        this.table.add(table);
    }

}
