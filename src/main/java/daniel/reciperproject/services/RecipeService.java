package daniel.reciperproject.services;

import daniel.reciperproject.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
