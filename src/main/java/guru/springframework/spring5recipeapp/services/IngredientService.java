package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long valueOf, Long valueOf1);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long valueOf, Long valueOf1);
}
