package be.doji.course.recipes;

import be.doji.course.recipes.model.Recipe;
import be.doji.course.recipes.model.RecipeBook;
import be.doji.course.recipes.reader.RecipeReader;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RecipeBookApplication {

    public static void main(String[] args) throws IOException {

        RecipeReader recipeReader = new RecipeReader(
                "E:\\Documents\\_development\\git\\EDucate\\sample-code\\RecipeBook\\resources\\recipes");
        List<Recipe> recipes = recipeReader.getRecipes();
        RecipeBook book = new RecipeBook(recipes);

        System.out.println("Kies een categorie: ");
        String chosenCategory = chooseCategory(book.getAllCategories());

        System.out.println("Kies een recept uit de categorie " + chosenCategory);
        Recipe chosenRecipe = chooseRecipe(book.getByCatgory(chosenCategory));

        System.out.println("Stappen voor recept [" + chosenRecipe.getName() + "]");
        printInstructionsForRecipe(chosenRecipe);
    }

    private static String chooseCategory(List<String> allCategories) {
        for (int i = 0; i < allCategories.size(); i++) {
            System.out.println((i + 1) + ": " + allCategories.get(i));
        }
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice < 0) {
            if (input.hasNextInt()) {
                choice = input.nextInt() - 1;
            }
        }
        return allCategories.get(choice);
    }

    private static Recipe chooseRecipe(List<Recipe> allRecipes) {
        for (int i = 0; i < allRecipes.size(); i++) {
            Recipe recipe = allRecipes.get(i);
            System.out.println((i + 1) + ": " + recipe.getName());
        }
        Scanner inputRecipe = new Scanner(System.in);
        int recipeChoice = -1;
        while (recipeChoice < 0) {
            if (inputRecipe.hasNextInt()) {
                recipeChoice = inputRecipe.nextInt() - 1;
            }
        }
        return allRecipes.get(recipeChoice);
    }

    private static void printInstructionsForRecipe(Recipe chosenRecipe) {
        for (String instructionLine : chosenRecipe.getInstructions()) {
            System.out.println(instructionLine);
        }
    }

}
