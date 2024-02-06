package chefport.repository;

import chefport.model.Recipe;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String>{
    public List<Recipe> findAllByRecipeName(String recipeName);
}
