package be.doji.course.recipes.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecipeBook {

    private List<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public RecipeBook(List<Recipe> recipes) {
        this();
        this.recipes.addAll(recipes);
    }

    public List<String> getAllCategories() {
        Set<String> categories = new HashSet<>();
        for (Recipe recipe : this.recipes) {
            categories.addAll(recipe.getCategories());
        }

        return new ArrayList<>(categories);
    }

    public List<Recipe> getByCatgory(String category) {
        List<Recipe> matchingRecipes = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.isOfCategory(category)) {
                matchingRecipes.add(recipe);
            }
        }
        return matchingRecipes;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void addRecipe(Recipe recipeToAdd) {
        if (recipeToAdd != null) {
            this.recipes.add(recipeToAdd);
        }
    }
}
