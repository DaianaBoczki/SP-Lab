package com.uvt.sp.classes;

import com.uvt.sp.services.ImageLoader;
import com.uvt.sp.services.ImageLoaderFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture, Visitee {
    protected String imageName;
    protected String url;
    protected ArrayList<Element> content = new ArrayList<>();
    protected ImageLoader loader;

    public Image(String imageName) {
        this.imageName = imageName;
        this.loader = ImageLoaderFactory.create(imageName);
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String url() {
        return this.url;
    }

    public Dimension dim() {
        return this.dim();
    }

    public Image content() {
        return new Image(this.imageName);
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void add(Element e) {
        content.add(e);
    }

    @Override
    public void remove(Element e) {
        content.remove(e);
    }

    public void accept(Visitor v){
        v.visitImage(this);
    }
}