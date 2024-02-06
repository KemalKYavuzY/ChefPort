package chefport.model;

import org.springframework.data.annotation.Id;
import java.util.Arrays;

public class Recipe {
    @Id
    public String id;

    private String recipeName;

    private String[] ingredients;

    public Recipe(String recipeName, String[] ingredients) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
    }

    public String getRecipeName(){
        return recipeName;
    }

    public String[] getIngredients(){
        return ingredients;
    }

    @Override
    public String toString() {
        String ingredientsString = String.join(", ", ingredients);

        return String.format("Recipe[id=%s, RecipeName='%s', Ingredients='%s']", id, recipeName, ingredientsString);
    }
}
