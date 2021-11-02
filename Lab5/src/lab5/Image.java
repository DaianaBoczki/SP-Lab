package lab5;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements  Element, Picture{
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

    @Override
    public Element get(int i) {
        return content.get(i);
    }

    public void print() {
        System.out.println("Image with name: " + imageName);
    }
}