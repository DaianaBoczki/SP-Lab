package lab6.services;

import lab6.models.Paragraph;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println("+++++" + p.text + "+++++");
    }
}
