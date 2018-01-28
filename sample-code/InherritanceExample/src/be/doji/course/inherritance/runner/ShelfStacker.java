package be.doji.course.inherritance.runner;

import be.doji.course.inherritance.model.Book;
import be.doji.course.inherritance.model.Plushie;
import be.doji.course.inherritance.model.Shelf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Doji on 24/06/2017.
 */
public class ShelfStacker {

    private static List<Shelf> shelves = new ArrayList<>();
    private static final int DEFAULT_SHELF_SIZE = 4;

    public static void main(String[] args) {
        System.out.println("Building some shelves for you...");
        makeShelves(4);
        System.out.println("Shelves built!");
        System.out.println("Putting stuff on the shelves...");
        putStuffOnTheShelves();

        System.out.println("The shelves now look like this: ");
        for(Shelf shelf : shelves) {
            System.out.println(shelf.toString());
        }
    }

    private static void putStuffOnTheShelves() {
        Book javaTutorial = new Book("A Gentle introduction to Java");
        Plushie pikachu = new Plushie("Pikachu wearing a fancy hat");

        Shelf topShelf = shelves.get(0);
        topShelf.addItem(pikachu);
        topShelf.addItem(javaTutorial);
    }

    private static void makeShelves(int amountOfShelves) {
        for(int i = 0; i < amountOfShelves; i++) {
            shelves.add(new Shelf(DEFAULT_SHELF_SIZE));
        }
    }
}
