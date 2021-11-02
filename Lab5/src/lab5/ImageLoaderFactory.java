package lab5;

public class ImageLoaderFactory {

    public static ImageLoader create(String name){
        if(name.endsWith("jpg")) {
            System.out.println((new JPGImageLoader(name)).load(name));
            return (new JPGImageLoader(name));
        }
        else {
            System.out.println((new BMPImageLoader(name)).load(name));
            return (new BMPImageLoader(name));
        }
    }
}
