package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngredientServiceImplTest {

    private final RecipeRepository recipeRepository;
    private final IngredientService ingredientService;

    IngredientServiceImplTest(RecipeRepository recipeRepository, IngredientService ingredientService) {
        this.recipeRepository = recipeRepository;
        this.ingredientService = ingredientService;
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void deleteIngredient(){


    }
}