package hust.soict.ict.aims.store;

import hust.soict.ict.aims.media.DigitalVideoDisc;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<DigitalVideoDisc> itemInStore;

    public Store() {
        super();
        itemInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if(!itemInStore.contains(dvd)) {
            itemInStore.add(dvd);
            System.out.println("Added");
        }
        else {
            System.out.println(dvd.getTitle() + "is already in the store!");
        }
    }
    public void removeDVD(DigitalVideoDisc dvd) {
        if(!itemInStore.contains(dvd)) {
            System.out.println("Item not found!");
        }
        else {
            itemInStore.remove(dvd);
            System.out.println("Item deleted!");
        }
    }
}
