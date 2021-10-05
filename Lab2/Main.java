package lab1;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);

        scOneOne.createNewParagraph("P1");
        scOneOne.createNewParagraph("P2");
        scOneOne.createNewParagraph("P3");
        scOneOne.createNewImage("I1");
        scOneOne.createNewParagraph("P4");
        scOneOne.createNewTable("T1");
        scOneOne.createNewParagraph("P5");

        scOneOne.print();

    }
}