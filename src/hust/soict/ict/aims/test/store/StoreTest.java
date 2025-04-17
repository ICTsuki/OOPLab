package hust.soict.ict.aims.test.store;

import hust.soict.ict.aims.disc.DigitalVideoDisc;
import hust.soict.ict.aims.store.Store;

public class StoreTest {
    public static void main(String[] argv) {
        Store store = new Store();

        store.addDVD(new DigitalVideoDisc("Titanic"));
        store.addDVD(new DigitalVideoDisc("Doraemon The Movie"));

        DigitalVideoDisc dvd = new DigitalVideoDisc("Fast and Furious 9");
        store.addDVD(dvd);
        store.removeDVD(dvd);
    }

}
