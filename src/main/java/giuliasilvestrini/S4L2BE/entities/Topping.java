package giuliasilvestrini.S4L2BE.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "toppings")
public class Topping extends MenuItem {
    private String name;

    @ManyToOne
    @JoinColumn(name = "pizza_id") // Nome della colonna che collega a Pizza
    private Pizza pizza;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
