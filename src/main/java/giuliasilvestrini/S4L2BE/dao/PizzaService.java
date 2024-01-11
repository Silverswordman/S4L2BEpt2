package giuliasilvestrini.S4L2BE.dao;

import giuliasilvestrini.S4L2BE.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PizzaService {
private PizzaDAO pizzaDAO;

public void savePizza (Pizza pizza) {
    pizzaDAO.save(pizza);
    log.info("Pizza salvata");
}
}
