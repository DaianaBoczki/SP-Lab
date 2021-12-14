package com.uvt.sp.services;

import com.uvt.sp.classes.*;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println(p.text + "+++++");
    }
}
