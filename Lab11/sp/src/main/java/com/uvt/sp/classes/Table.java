package com.uvt.sp.classes;

import java.util.ArrayList;

public class Table implements Element, Visitee {
    protected String title;
    protected ArrayList<Element> content = new ArrayList<>();

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void add(Element e) {
        content.add(e);
    }

    @Override
    public void remove(Element e) {
        content.remove(e);
    }

    public void accept(Visitor v){
        v.visitTable(this);
    }
}