package guru.springframework.spring5recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
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

}
