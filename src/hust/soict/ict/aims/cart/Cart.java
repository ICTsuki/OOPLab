package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<>();

    public Cart() {
        super();
    }
    public float totalCost(){
        float total = 0;
        for(Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void addMedia(Media media) {
        if(!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Item added");
        }
        else {
            System.out.println("Failed!\nInvalid item or already added");
        }
    }

    public void addMedia(Media ... medias) {
        for(Media media : medias) {
            addMedia(media);
        }
    }

    public void removeMedia(Media media) {
        if(!itemsOrdered.contains(media)) {
            System.out.println("Failed!\nItem already removed or doesn't exist");
        }
        else {
            itemsOrdered.remove(media);
            System.out.println("Item removed");
        }
    }

    public void sortByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }

    public void printCart() {
        System.out.println("******************************CART******************************");
        System.out.println("Ordered Items:");
        for(Media item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("****************************************************************");
    }

    public void searchByID(int id) {
        for(Media item : itemsOrdered) {
            if(item.getId() == id) {
                item.toString();
            }
            else {
                System.out.println("Item not found!");
            }
        }
    }

    public void searchByTitle(String title) {
        for(Media item : itemsOrdered) {
            if(item.getTitle().equals(title)) {
                item.toString();
            }
            else {
                System.out.println("Item not found!");
            }
        }
    }
}
