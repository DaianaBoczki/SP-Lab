package lab5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> author = new ArrayList<>();
    private List<Paragraph> paragraphs = new ArrayList<>();
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
        for(Paragraph p: paragraphs)
            p.print();
        for(Section s: sections)
            s.print();
    }
}