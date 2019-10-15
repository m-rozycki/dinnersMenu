package pl.com.rozyccy.dinnersMenu.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.com.rozyccy.dinnersMenu.hardCodeDB.DinnersList;

@RestController
public class DinnersMenuController {

  @GetMapping("/")
  public String sayHello() {
    DinnersList dinnersList = new DinnersList();
    dinnersList.setListOfDinners(DinnersList.of());
    
    return "Tygodniowe menu" +
           "<br/> Niedziela: " + dinnersList.getRandomDinner() +
           "<br/> Poniedziałek: " + dinnersList.getRandomDinner() +
           "<br/> Wtorek: " + dinnersList.getRandomDinner() +
           "<br/> Środa: " + dinnersList.getRandomDinner() +
           "<br/> Czwartek: KEBAB" +
           "<br/> Piątek: " + dinnersList.getRandomDinner() +
           "<br/> Sobota: " + dinnersList.getRandomDinner();
  }
}
