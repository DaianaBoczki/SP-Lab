package com.uvt.sp.services;

import com.uvt.sp.classes.Paragraph;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println("+++++" + p.text + "+++++");
    }
}
