package hust.soict.ict.aims.store;

import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Media> itemInStore = new ArrayList<>();

    public Store() {
        super();
    }

    public void addMedia(Media media) {
        if(!itemInStore.contains(media)) {
            itemInStore.add(media);
            System.out.println("Added: " + media.toString());
        }
        else {
            System.out.println(media.getTitle() + "is already in the store!");
        }
    }
    public void addMedia(Media ... medias) {
        for(Media media : medias) {
            addMedia(media);
        }
    }
    public void removeMedia(Media media) {
        if(!itemInStore.contains(media)) {
            System.out.println("Item not found!");
        }
        else {
            itemInStore.remove(media);
            System.out.println("Item deleted: " + media.toString());
            int i = 1;
            for(Media item : itemInStore) {
                item.setId(i);
                i++;
            }
        }
    }

    public void printStore() {
        System.out.println("******************************CART******************************");
        System.out.println("Items:");
        for(Media item : itemInStore) {
            System.out.println(item.toString());
        }
        System.out.println("****************************************************************");
    }
}
