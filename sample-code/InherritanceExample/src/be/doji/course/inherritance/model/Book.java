package be.doji.course.inherritance.model;

/**
 * Created by Doji on 24/06/2017.
 */
public class Book extends StorableItem {

    public Book(String name) {
        super(name);
    }

    public Book(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    @Override protected String getPrefixName() {
        return "BOOK";
    }
}
