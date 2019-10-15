package pl.com.rozyccy.dinnersMenu.hardCodeDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.Data;
import pl.com.rozyccy.dinnersMenu.data.Dinners;

@Data
public class DinnersList {
  List<Dinners> listOfDinners;
  
  public static List<Dinners> of() {
    List<Dinners> dinnersList = new ArrayList<Dinners>();
    dinnersList.add(Dinners.of("Lasagna", null, 60));
    dinnersList.add(Dinners.of("Schabowe", null, 60));
    dinnersList.add(Dinners.of("Żeberka1", null, 60));
    dinnersList.add(Dinners.of("Potrawka z kurczaka", null, 60));
    dinnersList.add(Dinners.of("Spaghetti", null, 60));
    dinnersList.add(Dinners.of("Carbonara", null, 60));
    return dinnersList;
  }
  
  public Dinners getRandomDinner() { 
      Random rand = new Random(); 
      return listOfDinners.get(rand.nextInt(listOfDinners.size())); 
  } 

}
