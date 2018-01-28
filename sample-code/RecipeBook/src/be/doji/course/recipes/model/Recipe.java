package be.doji.course.recipes.model;

import java.util.List;

public class Recipe {

    private String name;
    private List<String> categories;
    private List<String> instructions;

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public boolean isOfCategory(String categoryToMatch) {
        for (String category : this.getCategories()) {
            if (category.equalsIgnoreCase(categoryToMatch)) {
                return true;
            }
        }
        return false;
    }
}
