package lab5;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println("+++++" + p.text + "+++++");
    }
}
