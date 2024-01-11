package giuliasilvestrini.S4L2BE.dao;

import giuliasilvestrini.S4L2BE.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaDAO extends JpaRepository<Pizza, Long> {
}
