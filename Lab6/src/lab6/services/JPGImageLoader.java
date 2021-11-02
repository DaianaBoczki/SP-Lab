package lab6.services;

public class JPGImageLoader implements ImageLoader {
    String content;

    public JPGImageLoader(String content) {
        this.content = content;
    }

    public String load(String s) {
        return "jpg image: " + s;
    }
}
