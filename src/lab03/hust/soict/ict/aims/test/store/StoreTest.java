package lab03.hust.soict.ict.aims.test.store;

import lab03.hust.soict.ict.aims.media.Book;
import lab03.hust.soict.ict.aims.media.CompactDisc;
import lab03.hust.soict.ict.aims.media.DigitalVideoDisc;
import lab03.hust.soict.ict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {
    public static void main(String[] argv) {
        List<Media> mediae = new ArrayList<>();

        CompactDisc cd = new CompactDisc("Titanic");
        DigitalVideoDisc dvd = new DigitalVideoDisc("Lion King");
        Book book = new Book("Harry Potter and the order of Phoenix");

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for(Media m : mediae) {
            System.out.println(m.toString());
        }
    }

}
