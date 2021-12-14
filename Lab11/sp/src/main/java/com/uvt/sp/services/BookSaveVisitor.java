package com.uvt.sp.services;

import java.io.FileWriter;
import java.io.IOException;

public class BookSaveVisitor implements Visitor {
    FileWriter file;
    String text = "";

    public BookSaveVisitor() {
    }

    public void visitBook(Book b) {
        System.out.println("Book: " + b.getTitle());
    }

    public void visitSection(Section s) {
        try {
            FileWriter file = new FileWriter("/home/denisa/Documents/SP-Lab/Lab6/book.json");
            text += String.format("{\"Section\":{\"Title\":\"" + s.getTitle() + "\", \"Paragraph\":" + "}}");
            for(Element e: s.content){
                System.out.print(e);
            }
            file.write(text);
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void visitTableOfContents(TableOfContents t) {
        System.out.println("TableOfContents: " + t.getBook());
    }

    public void visitParagraph(Paragraph p) {
        System.out.println("Paragraph: " + p.getText());
    }

    public void visitImageProxy(ImageProxy i) {
        System.out.println("ImageProxy: " + i.getRealImage());
    }

    public void visitImage(Image i) {
        System.out.println("Image: " + i.getImageName());
    }

    public void visitTable(Table t) {
        System.out.println("Table: " + t.getTitle());
    }
}
