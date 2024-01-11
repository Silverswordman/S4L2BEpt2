package giuliasilvestrini.S4L2BE.dao;

import giuliasilvestrini.S4L2BE.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingDAO extends JpaRepository<Topping, Long> {
}
