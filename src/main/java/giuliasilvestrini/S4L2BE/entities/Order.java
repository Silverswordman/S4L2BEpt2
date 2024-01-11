package giuliasilvestrini.S4L2BE.entities;

import giuliasilvestrini.S4L2BE.entities.Enums.StatoOrdine;
import giuliasilvestrini.S4L2BE.entities.Enums.StatoTavolo;
import lombok.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter

@ToString


public class Order {
    private int orderNumber;

    private StatoOrdine statoOrdine;
    private int numCoperti;
    private LocalTime oraOrdine;

    private Tavolo tavolo;

    private List<MenuItem> itemOrdinati;


    public Order(int numCoperti, Tavolo tavolo, List<MenuItem> itemOrdinati) {
        Random random = new Random();
        this.numCoperti = numCoperti;
        this.tavolo = tavolo;
        this.itemOrdinati = itemOrdinati;
        this.oraOrdine = LocalTime.now();
        this.statoOrdine = StatoOrdine.InCorso;
        this.orderNumber = random.nextInt(1, 100);
    }

    // metodo per  calcolare totale

    public double getTotale() {
        return this.itemOrdinati.stream().mapToDouble(MenuItem::getPrice).sum() + this.numCoperti * this.tavolo.getCostoCoperto();

    }
}
