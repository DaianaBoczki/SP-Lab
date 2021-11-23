package lab9;

public class OpenCommand implements Command{
    public DocumentManager doc;

    public OpenCommand(String book) {
        this.doc = new DocumentManager(book);
    }

    public void execute() {
        System.out.print("Open command: ");
        doc.print();
    }
}
