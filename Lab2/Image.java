package lab1;

public class Image {
    String imageName;

    public void print() {
        System.out.println( "Image{" + "name='" + imageName + '\'' + '}');
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Image(String imageName) {
        this.imageName = imageName;
    }
}
