package com.uvt.sp.services;

public class BMPImageLoader implements ImageLoader {
    String content;

    public BMPImageLoader(String content) {
        this.content = content;
    }

    public String load(String s) {
        return "bmp image: " + s;
    }
}
