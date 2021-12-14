package com.uvt.sp.classes;

public interface Visitor {
    void visitBook(Book b);
    void visitSection(Section s);
    void visitTableOfContents(TableOfContents t);
    void visitParagraph(Paragraph p);
    void visitImageProxy(ImageProxy i);
    void visitImage(Image i);
    void visitTable(Table t);
}
