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

    public void print() {
        System.out.println("title: " + title);
        System.out.print("paragraphs: ");
        for(String p: paragraph){
            System.out.print(p + " ");
        }
        System.out.print("\nimages: ");
        for(String i: image){
            System.out.print(i + " ");
        }
        System.out.print("\ntables: ");
        for(String t: table){
            System.out.print(t + " ");
        }
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
