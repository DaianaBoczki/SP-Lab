package lab6.models;

import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee{
    private String title;
    private List<Author> author = new ArrayList<>();
    private List<Paragraph> paragraphs = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private List<Section> sections = new ArrayList<>();

    public Book(String title, List<Author> author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }

    public void addContent(Paragraph p) {
        this.paragraphs.add(p);
    }

    public void addContent(Section s) {
        this.sections.add(s);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors: ");
        for(Author a: author)
            a.print();
    }

    public void accept(Visitor v) {
        v.visitBook(this);
    }
}