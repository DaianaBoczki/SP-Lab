package com.uvt.sp.classes;

import java.util.ArrayList;

public class TableOfContents implements Element, Visitee {
    protected Book book;
    protected ArrayList<Element> content = new ArrayList<>();

    public TableOfContents(Book book) {
        this.book = book;
    }

    @Override
    public void add(Element e) {
        content.add(e);
    }

    @Override
    public void remove(Element e) {
        content.remove(e);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void accept(Visitor v){
        v.visitTableOfContents(this);
    }
}