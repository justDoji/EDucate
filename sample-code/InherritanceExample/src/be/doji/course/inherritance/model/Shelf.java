package be.doji.course.inherritance.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Doji on 24/06/2017.
 */
public class Shelf {
    private List<StorableItem> itemsOnShelf;
    private int maximumAmountOfItemsOnShelf;

    public Shelf(int shelfSize) {
        this.itemsOnShelf = new ArrayList<>();
        this.maximumAmountOfItemsOnShelf = shelfSize;
    }

    public void addItem(StorableItem itemToStore) {
        itemsOnShelf.add(itemToStore);
    }

    public List<StorableItem> getItemsOnShelf() {
        return new ArrayList<>(itemsOnShelf);
    }

    public String toString() {
        String description = "This is a shelf containing: \n";
        description += getShelvesDescription();
        return description;

    }

    private String getShelvesDescription() {
        if (this.getItemsOnShelf().isEmpty()) {
            return "nothing at all \n";
        } else {
            String description = "";
            for (StorableItem item : itemsOnShelf) {
                description += item.toString() + "\n";
            }
            return description;
        }
    }
}
