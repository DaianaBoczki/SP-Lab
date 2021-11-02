package lab5;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println(p.text + "+++++");
    }
}
