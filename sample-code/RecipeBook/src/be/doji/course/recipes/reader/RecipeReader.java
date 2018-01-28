package be.doji.course.recipes.reader;

import be.doji.course.recipes.model.Recipe;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeReader {

    private Path recipeLocation;
    private List<Recipe> recipes;

    public RecipeReader(String recepipeLocation) throws IOException {
        recipes = new ArrayList<>();
        this.recipeLocation = Paths.get(recepipeLocation);
        readRecipesFromFile();
    }

    private void readRecipesFromFile() throws IOException {
        Files.walkFileTree(recipeLocation, new SimpleFileVisitor<Path>() {
            @Override public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                List<String> fileLines = Files.readAllLines(file);
                Recipe recipeFromFile = createRecipeFromFileLines(fileLines);
                RecipeReader.this.recipes.add(recipeFromFile);

                return FileVisitResult.CONTINUE;
            }
        });

    }

    private Recipe createRecipeFromFileLines(List<String> fileLines) {
        String nameOfRecipe = "Default";
        String categoriesCommaSeparated = "Blabla";
        List<String> instructions = new ArrayList<>();

        for (String fileLine : fileLines) {
            if (fileLine.startsWith("Name:")) {
                nameOfRecipe = fileLine.replace("Name:", "").trim();
            } else if (fileLine.startsWith("Categories:")) {
                categoriesCommaSeparated = fileLine.replace("Categories:", "").trim();
            } else {
                instructions.add(fileLine);
            }

        }

        Recipe recipeFromFile = new Recipe(nameOfRecipe);

        String[] splitCategories = categoriesCommaSeparated.split(",");
        List<String> categories = Arrays.asList(splitCategories);
        recipeFromFile.setCategories(categories);
        recipeFromFile.setInstructions(instructions);
        return recipeFromFile;
    }

    public List<Recipe> getRecipes() {
        return this.recipes;
    }
}
