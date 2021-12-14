package com.uvt.sp.classes;

import java.awt.*;

public class ImageProxy implements Element, Picture, Visitee {
    protected String url;
    protected Dimension dim;
    protected Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image getRealImage() {
        return realImage;
    }

    public void setRealImage(Image realImage) {
        this.realImage = realImage;
    }

    public Image loadImage(){
        if(realImage == null)
            this.realImage = new Image(url);
        return realImage;
    }

    public void print() {
        this.loadImage();
    }

    public String url() {
        return this.url;
    }

    public Dimension dim() {
        return this.dim;
    }

    public Image content() {
        return this.realImage;
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void accept(Visitor v){
        v.visitImageProxy(this);
    }
}