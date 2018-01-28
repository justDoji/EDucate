package be.doji.course.inherritance.model;

/**
 * Created by Doji on 24/06/2017.
 */
public abstract class StorableItem {

    private String name;
    private int weightInGrams;
    private static final int DEFAULT_WEIGHT_IN_GRAMS = 250;

    public StorableItem(String name) {
        this(name, DEFAULT_WEIGHT_IN_GRAMS);
    }

    public StorableItem(String name, int weightInGrams) {
        this.name = name;
        this.weightInGrams = weightInGrams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weightInGrams;
    }

    public void setWeight(int weight) {
        this.weightInGrams = weight;
    }

    protected abstract String getPrefixName();

    public String toString() {
        return "item [" + getName() + "] { " + getPrefixName() + " } with weight: " + getWeight();
    }
}
