package ticketReservetionTekrar;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    public String numberPlate;

    List<String> seats = new ArrayList<>();

    public Bus(String plaka) {

        this.numberPlate = plaka;

        for (int i = 1; i < 33; i++) {

            this.seats.add(i + "");
        }


    }


}
