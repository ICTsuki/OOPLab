package hust.soict.ict.aims.test.store;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.store.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {
    public static void main(String[] argv) {
        List<Media> mediae = new ArrayList<>();
        Store store = new Store();

        CompactDisc cd = new CompactDisc("Titanic");
        DigitalVideoDisc dvd = new DigitalVideoDisc("Lion King");
        Book book = new Book("Harry Potter and the order of Phoenix");


        store.addMedia(cd);
        store.addMedia(dvd);
        store.addMedia(book);

        store.printStore();
        store.removeMedia(cd);
        store.printStore();

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for(Media m : mediae) {
            System.out.println(m.toString());
        }







    }

}
