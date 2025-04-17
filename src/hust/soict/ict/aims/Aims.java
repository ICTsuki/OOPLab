package hust.soict.ict.aims;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Roger Allers",
                                                     87, 19.95f);
        anOrder.addDigitalVideoDiscs(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas",
                                                     87, 24.95f);
        anOrder.addDigitalVideoDiscs(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDiscs(dvd3);

        anOrder.cartDisplay();
        System.out.print("The total cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.cartDisplay();
        System.out.print("The total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}