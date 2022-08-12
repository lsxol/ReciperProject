package daniel.reciperproject.controller;

import daniel.reciperproject.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/recipe", "recipe/index","/recipe/index.html"})
    public String listOwners(Model model){

        model.addAttribute("recipe", recipeService.findAll());
        return "recipe/index";
    }
}
