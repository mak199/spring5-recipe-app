package guru.springframework.spring5recipeapp.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // no cascade since recipe owns this notes
    // if we delete notes we do not want to delete recipe, but inverse should happen
    @OneToOne
    private Recipe recipe;
    // to allow notes to store string of more than 256 characters
    @Lob
    private String recipeNotes;

}
