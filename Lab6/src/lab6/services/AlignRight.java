package lab6.services;

import lab6.models.Paragraph;

public class AlignRight implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println("+++++" + p.text);
    }
}
