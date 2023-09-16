package ticketReservetionTekrar;

import java.util.Scanner;

public class Ticket {
    public double distance;
    public int age;
    public int type;
    public String seatNo;
    private double price;

    public void getTotalPrice(int age) {
        double total = 0;
        int seat = Integer.parseInt(this.seatNo);
        switch (this.type) {
            case 1:
                if (seat % 3 == 0) {
                    total = this.distance * 1.2;
                } else {
                    total = this.distance * 1;
                }
                break;
            case 2:
                if (seat % 3 == 0) {
                    total = this.distance * 2.4;
                } else {
                    total = this.distance * 2;
                }
                total = total * 0.8;
                break;
        }
        if (age < 12) {
            total = total * 0.5;
        } else if (age > 65) {
            total = total * 0.7;
        }

        this.price=total;
        System.out.println(this.price);
    }

    public void printTicket(Bus bus) {

        System.out.println("/".repeat(25));
        System.out.println("---Biley Detayı---");
        System.out.println("Otobüs Plakası: " + bus.numberPlate);
        System.out.println("Yolculuk Tipi :" + (this.type == 1 ? "Tek Yön." : "Gidiş-Dönüş"));
        System.out.println("Koltuk No :" + this.seatNo);
        System.out.println("Toplam Tutar : " + this.price + " TL");
        System.out.println("Keyifli yolculuklar dileriz...");
        System.out.println("/".repeat(25));
    }


}
