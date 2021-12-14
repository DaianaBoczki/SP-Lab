package com.uvt.sp.services;

import com.uvt.sp.classes.Paragraph;

public class AlignRight implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println("+++++" + p.text);
    }
}
