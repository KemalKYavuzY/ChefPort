package chefport.controller;

import chefport.model.Recipe;
import chefport.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService service; // Creates an instance of the UserService class

    public RecipeController(RecipeService service) {
        this.service = service;
    }


    @GetMapping("/{recipeName}")
    public @ResponseBody ResponseEntity<Recipe[]> findbyId(@PathVariable String recipeName) {
        return new ResponseEntity<>(service.getRecipes(recipeName), HttpStatus.OK);
    }

    @PostMapping("/newRecipe")
    public @ResponseBody ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return new ResponseEntity<>(service.createRecipe(recipe), HttpStatus.OK); // Creates a user in the userService class
    }
}