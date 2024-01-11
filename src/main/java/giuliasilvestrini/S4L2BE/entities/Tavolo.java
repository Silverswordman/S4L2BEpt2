package giuliasilvestrini.S4L2BE.entities;

import giuliasilvestrini.S4L2BE.entities.Enums.StatoTavolo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Tavolo {

    private int numeroTavolo;
    private int maxCoperti;

    private StatoTavolo statoTavolo;
    private int costoCoperto;


    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", coperti=" + maxCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}