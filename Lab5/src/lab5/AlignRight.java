package lab5;

public class AlignRight implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println("+++++" + p.text);
    }
}
