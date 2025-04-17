package hust.soict.ict.aims.test.cart;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] argv) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Roger Allers",
                87, 19.95f);
        anOrder.addDigitalVideoDiscs(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas",
                87, 24.95f);
        anOrder.addDigitalVideoDiscs(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Despicable Me");
        anOrder.addDigitalVideoDiscs(dvd3, dvd4);

        anOrder.searchByID(1);
        anOrder.searchByTitle("Star Wars");
        anOrder.print();
    }
}
