package giuliasilvestrini.S4L2BE.dao;

import giuliasilvestrini.S4L2BE.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkDAO extends JpaRepository<Drink,Long> {
}
