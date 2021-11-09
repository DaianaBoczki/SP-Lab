package lab6.services;

import lab6.models.*;

public class RenderContentVisitor implements Visitor {
    public void visitBook(Book b) {
        System.out.println("Book: " + b.getTitle());
    }

    public void visitSection(Section s) {
        for(Element e: s.content){
            if(e instanceof Image){
                System.out.println("Image: " + ((Image) e).getImageName());
            }
            if(e instanceof ImageProxy){
                System.out.println("ImageProxy: " + ((ImageProxy) e).content());
            }
            if(e instanceof Table){
                System.out.println("Table: " + ((Table) e).getTitle());
            }
            if(e instanceof Paragraph){
                System.out.println("Paragraph: " + ((Paragraph) e).getText());
            }
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
