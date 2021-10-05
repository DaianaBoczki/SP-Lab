package lab1;

public class Paragraph {
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println( "Paraghraph{" + "text='" + text + '\'' + '}');
    }
}
