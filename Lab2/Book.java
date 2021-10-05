package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapter = new ArrayList<>();
    private TableOfContents table;

    public Book(String title, List<Chapter> chapter, TableOfContents table, Author author) {
        this.title = title;
        this.chapter = chapter;
        this.table = table;
        this.author = author;
    }

    public void addAuthor(Author authors) {
        this.author = author;
    }

    public int createChapter(String chapterTitle){
        Chapter c = new Chapter(chapterTitle);
        chapter.add(c);
        return chapter.indexOf(c);
    }

    public Chapter getChapter(int index){
        return chapter.get(index);
    }

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("title: " + title);
        for(Chapter c: chapter){
            c.print();
        }
        table.print();
        author.print();
    }
}
