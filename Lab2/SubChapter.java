package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String name;
    private List<Paragraph> paragraph = new ArrayList<>();
    private List<Image> image = new ArrayList<>();
    private List<Table> table = new ArrayList<>();

    public void print() {
        System.out.println( "SubChapter " + "name='" + this.name);
        for(Paragraph p: paragraph){
            p.print();
        }
        for(Image i: image){
            i.print();
        }
        for(Table t: table){
            t.print();
        }
    }

    public SubChapter(String name, List<Paragraph> paragraph, List<Image> image, List<Table> table) {
        this.name = name;
        this.paragraph = paragraph;
        this.image = image;
        this.table = table;
    }

    public void createNewParagraph(String paragraph){
        this.paragraph.add(new Paragraph(paragraph));
    }

    public void createNewImage(String image){
        this.image.add(new Image(image));
    }

    public void createNewTable(String table){
        this.table.add(new Table(table));
    }

    public SubChapter(String name) {
        this.name = name;
    }

}
