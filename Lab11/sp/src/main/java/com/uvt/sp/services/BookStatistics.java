package com.uvt.sp.services;

public class BookStatistics implements Visitor {
    public int paragraphs;
    public int images;
    public int tables;

    public BookStatistics() {
        this.paragraphs = 0;
        this.images = 0;
        this.tables = 0;
    }

    public void setTables() {
        this.tables++;
    }

    public void setParagraphs() {
        this.paragraphs++;
    }

    public void setImages() {
        this.images++;
    }

    public void printStatistics(){
        System.out.println("Book statistics: ");
        System.out.println("*** Number of images: " + images);
        System.out.println("*** Number of tables: " + tables);
        System.out.println("*** Number of paragraphs: " + paragraphs);
    }

    public void visitBook(Book b) {
        System.out.println("Book: " + b.getTitle());
    }

    public void visitSection(Section s) {
        for(Element e: s.content){
            if(e instanceof Image || e instanceof ImageProxy){
                this.setImages();
            }
            if(e instanceof Table){
                this.setTables();
            }
            if(e instanceof Paragraph){
                this.setParagraphs();
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

