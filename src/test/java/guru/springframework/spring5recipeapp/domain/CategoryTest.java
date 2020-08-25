package guru.springframework.spring5recipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class CategoryTest {


    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }
    @Test
    void getId() {
        String idValue = "4";
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}