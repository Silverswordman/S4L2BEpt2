package giuliasilvestrini.S4L2BE.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;
    protected int calories;
    protected double price;

    public MenuItem(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

}