package lab1;

public class Table {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println( "Table{" + "title=" + title + '\'' + '}');
    }
}
