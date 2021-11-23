package lab9;

public class StatisticsCommand implements Command{
    public DocumentManager doc;

    public StatisticsCommand() {
        this.doc = new DocumentManager();
    }

    public void execute() {
        System.out.print("Statistics command: ");
        doc.print();
    }
}
