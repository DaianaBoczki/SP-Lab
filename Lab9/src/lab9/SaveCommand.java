package lab9;

public class SaveCommand implements Command{
    public DocumentManager doc;

    public void execute() {
        System.out.print("Save command: ");
        doc.print();
    }
}
