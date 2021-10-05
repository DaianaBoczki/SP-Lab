package lab1;



public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("P1");
        discoTitanic.createNewParagraph("P2");
        discoTitanic.createNewParagraph("P3");
        discoTitanic.createNewImage("I1");
        discoTitanic.createNewParagraph("P4");
        discoTitanic.createNewTable("T1");
        discoTitanic.createNewParagraph("P5");
        discoTitanic.print();

    }
}
