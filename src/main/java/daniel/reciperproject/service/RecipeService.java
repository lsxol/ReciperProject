package daniel.reciperproject.service;

import daniel.reciperproject.data.Recipe;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeService {

    protected Map<Long, Recipe> map = new HashMap<>();

    public Set<Recipe> findAll(){
        return new HashSet<>(map.values());
    }

    public Recipe findById(Long id){
        return map.get(id);
    }

    public Recipe save (Recipe object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    public Recipe getByName(String name){

        for(int i = 0; i < map.size(); i++){
            Recipe recipe = map.get(i);
            if(recipe.getName().equals(name)){
                return recipe;
            }
        }
        return null;

    }

    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet())+1;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }



}
