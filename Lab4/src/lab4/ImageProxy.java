package lab4;

import java.awt.*;

public class ImageProxy implements Element, Picture{
    protected String url;
    protected Dimension dim;
    protected Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage(){
        if(realImage == null)
            this.realImage = new Image(url);
        return realImage;
    }

    @Override
    public void print() {
        this.loadImage();
        realImage.print();
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

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public Element clone() {
        return null;
    }
}
