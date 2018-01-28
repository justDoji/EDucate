package be.doji.course.inherritance.model;

/**
 * Created by Doji on 24/06/2017.
 */
public class Plushie extends StorableItem {

    public Plushie(String name) {
        super(name);
    }

    public Plushie(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    @Override protected String getPrefixName() {
        return "PLUSH";
    }
}
