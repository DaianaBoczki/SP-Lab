package lab1;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String name;
    List<SubChapter> subChapter = new ArrayList<>();

    public Chapter(String name, List<SubChapter> subChapter) {
        this.name = name;
        this.subChapter = subChapter;
    }

    public Chapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print( "Chapter " + "name='" + name);
        for(SubChapter s: subChapter){
            s.print();
        }
    }

    public int createSubChapter(String subchapterTitle){
        SubChapter s = new SubChapter(subchapterTitle);
        subChapter.add(s);
        return subChapter.indexOf(s);
    }

    public SubChapter getSubChapter(int index){
        return subChapter.get(index);
    }
}
