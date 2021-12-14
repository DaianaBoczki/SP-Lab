package com.uvt.sp.classes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book implements Visitee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;

    @Column(name = "Title")
    private String title;

    @OneToMany(targetEntity = Author.class)
    private List<Author> author = new ArrayList<>();

    @Transient
    private List<Paragraph> paragraphs = new ArrayList<>();

    @Transient
    private List<Section> sections = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
