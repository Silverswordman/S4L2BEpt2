package giuliasilvestrini.S4L2BE;
import giuliasilvestrini.S4L2BE.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S4L2BeApplication.class);

        Menu m = (Menu) ctx.getBean("menu");
        Tavolo t = (Tavolo) ctx.getBean("tavolo1");
        Tavolo tt = (Tavolo) ctx.getBean("tavolo2");

        m.printMenu();
//        System.out.println(tt.toString() +" "+ t.toString());

        List<MenuItem> prodottiOrdinati1 = new ArrayList<MenuItem>();
        prodottiOrdinati1.add(ctx.getBean("salami_pizza", Pizza.class));
        prodottiOrdinati1.add(ctx.getBean("hawaiian_pizza", Pizza.class));
        prodottiOrdinati1.add(ctx.getBean("wine", Drink.class));
        prodottiOrdinati1.add(ctx.getBean("water", Drink.class));

        Order order1= new Order(4,tt,prodottiOrdinati1);
//        System.out.println(order1);
        System.out.println("Il totale di quest'ordine è "+ order1.getTotale());

        List<MenuItem> prodottiOrdinati2 = new ArrayList<MenuItem>();
        prodottiOrdinati2.add(ctx.getBean("pizza_margherita", Pizza.class));
        prodottiOrdinati2.add(ctx.getBean("water",Drink.class));
        Order order2= new Order(1,tt,prodottiOrdinati2);
        System.out.println("Il totale di quest'ordine è "+ order2.getTotale());
        ctx.close();
    }
}
