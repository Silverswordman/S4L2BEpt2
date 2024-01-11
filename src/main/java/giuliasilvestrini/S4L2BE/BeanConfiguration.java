package giuliasilvestrini.S4L2BE;

import giuliasilvestrini.S4L2BE.entities.*;
import giuliasilvestrini.S4L2BE.entities.Enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeanConfiguration {
    @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 0, 1);
    }

    @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 92, 2);
    }

    @Bean(name = "toppings_ham")
    public Topping toppingHamBean() {
        return new Topping("Ham", 35, 1.20);
    }

    @Bean(name = "toppings_pineapple")
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 24, 2);
    }

    @Bean(name = "toppings_salami")
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 86, 1.50);
    }


    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita", tList, false);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza("Hawaiian Pizza", tList, false);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza", tList, false);
    }

    @Bean(name = "salami_pizza_xl")
    public Pizza pizzaSalamiXlBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza XL", tList, true);
    }

    @Bean(name = "lemonade")
    public Drink lemonadeBean() {
        return new Drink("Lemonade", 128, 1.50);
    }

    @Bean(name = "water")
    public Drink waterBean() {
        return new Drink("Water", 0, 1);
    }

    @Bean(name = "wine")
    public Drink wineBean() {
        return new Drink("Wine", 607, 8);
    }

    @Bean(name = "tavolo1")
    public Tavolo tavolo1Bean(@Value("${coperto}")int costoCoperto) {
        return new Tavolo(1, 5, StatoTavolo.Libero, costoCoperto);
    }

    @Bean(name = "tavolo2")
    public Tavolo tavolo2Bean(@Value("${coperto}")int costoCoperto) {
        return new Tavolo(2, 2, StatoTavolo.Occupato, costoCoperto);
    }


    @Bean(name = "menu")
    public Menu menuBean() {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(pizzaMargheritaBean());
        pizzaList.add(pizzaHawaiianBean());
        pizzaList.add(pizzaSalamiBean());
        pizzaList.add(pizzaSalamiXlBean());

        drinkList.add(lemonadeBean());
        drinkList.add(waterBean());
        drinkList.add(wineBean());

        toppingsList.add(toppingTomatoBean());
        toppingsList.add(toppingCheeseBean());
        toppingsList.add(toppingSalamiBean());
        toppingsList.add(toppingHamBean());
        toppingsList.add(toppingPineappleBean());

        return new Menu(pizzaList, drinkList, toppingsList);
    }
}