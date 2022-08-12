package daniel.reciperproject.bootstrap;

import daniel.reciperproject.data.Recipe;
import daniel.reciperproject.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final RecipeService recipeService;

    @Autowired
    public DataLoader(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Override
    public void run(String... args) throws Exception {

        Recipe recipe1 = new Recipe();
        recipe1.setId(1L);
        recipe1.setName("Schabowe");
        recipe1.setTime("40min");
        String products1 = "Jajka, Schab, Bułka tarta";
        recipe1.setProducts(products1);

        recipeService.save(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setId(2L);
        recipe2.setName("Schabowe");
        recipe2.setTime("40min");
        String products2 = "Jajka, Schab, Bułka tarta";
        recipe2.setProducts(products2);

        recipeService.save(recipe2);

    }
}
