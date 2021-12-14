package com.uvt.sp.classes;

import com.uvt.sp.services.AlignStrategy;

import java.util.ArrayList;

public class Paragraph implements Element, Visitee {
    public String text;
    protected ArrayList<Element> content = new ArrayList<>();

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void add(Element e) {
        content.add(e);
    }

    @Override
    public void remove(Element e) {
        content.remove(e);
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }

    public void setAlignStrategy(AlignStrategy strategy){
        strategy.render(this);
    }

    public void accept(Visitor v){
        v.visitParagraph(this);
    }
}