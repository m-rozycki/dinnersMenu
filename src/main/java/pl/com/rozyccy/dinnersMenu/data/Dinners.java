package pl.com.rozyccy.dinnersMenu.data;

import lombok.Data;

@Data
public class Dinners {
  String name;
  String recipe;
  int preparationTime;
  
  public static Dinners of(String name, String recipe, int preparationTime) {
    Dinners dinner = new Dinners();
    dinner.setName(name);
    dinner.setRecipe(recipe);
    dinner.setPreparationTime(preparationTime);
    return dinner;
  }
  
  @Override
  public String toString() {
    return name + " (preparationTime: " + preparationTime + " min, recipe: " + recipe + ")";
  }
}
