package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {
    @Id
    // id generated from db
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    public Ingredient(){

    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure um) {
        this.description = description;
        this.amount = amount;
        this.um = um;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure um,Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.um = um;
        this.recipe = recipe;
    }

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure um;

    @ManyToOne
    private Recipe recipe;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    public UnitOfMeasure getUm() {
        return um;
    }

    public void setUm(UnitOfMeasure um) {
        this.um = um;
    }
}
