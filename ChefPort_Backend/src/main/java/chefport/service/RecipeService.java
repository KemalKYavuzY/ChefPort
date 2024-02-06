package chefport.service;

import org.springframework.stereotype.Service;
import chefport.repository.RecipeRepository;
import chefport.model.Recipe;

@Service
public class RecipeService {
    private final RecipeRepository repo;

    public RecipeService(RecipeRepository repo){
        this.repo = repo;
    }

    public Recipe createRecipe(Recipe recipe) {
        return repo.save(recipe);
    }

    public Recipe[] getRecipes(String recipeName) {
        return repo.findAllByRecipeName(recipeName).toArray(new Recipe[0]);
    }
}