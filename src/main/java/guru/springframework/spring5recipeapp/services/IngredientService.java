package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(String valueOf, String valueOf1);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(String valueOf, String valueOf1);
}
