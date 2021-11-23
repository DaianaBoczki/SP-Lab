package lab9;

public class DocumentManager {
    public static DocumentManager instance = new DocumentManager();
    public static String book;

    public DocumentManager() {
    }

    public DocumentManager(String book) {
        this.book = book;
    }

    public static DocumentManager getInstance(){
        return instance;
    }

    public static DocumentManager getBook(){
        return instance;
    }

    public void setBook(String book){
        this.book = book;
    }

    public void print(){
        System.out.println("Book: " + this.book);
    }
}
