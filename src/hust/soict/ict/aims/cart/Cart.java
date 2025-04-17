package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int quantityOrdered;

    public Cart() {
        quantityOrdered = 0;
    }

    public int getQuantityOrdered(){
        return quantityOrdered;
    }

    public void addDigitalVideoDiscs(DigitalVideoDisc disc){
        if(disc == null) {
            System.out.println("Item invalid!");
            return;
        }
        if(quantityOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full, you can't add more items!");
            return;
        }
        itemOrdered[quantityOrdered] = disc;
        quantityOrdered++;
        System.out.println("You've added an item.");
        if(quantityOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
        }
    }
    public void addDigitalVideoDiscs(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(quantityOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Your cart is full, you can't add more items!");
        }
        itemOrdered[quantityOrdered] = dvd1;
        quantityOrdered++;
    }
    public void addDigitalVideoDiscs(DigitalVideoDisc[] dvdList) {
        for(int i = 0; i < dvdList.length; i++) {
            if(quantityOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("Your cart is full, you can't add more items!");
                System.out.println("You've added " + i + " items.");
                return;
            }
            itemOrdered[quantityOrdered] = dvdList[i];
            quantityOrdered++;
        }
    }
    public void AddDigitalVideoDiscs(DigitalVideoDisc... dvd) {
        for(int i = 0; i < dvd.length; i++) {
            if(quantityOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("Your cart is full, you can't add more items!");
                System.out.println("You've added " + i + " items.");
                return;
            }
            itemOrdered[quantityOrdered] = dvd[i];
            quantityOrdered++;
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(quantityOrdered == 0) {
            System.out.println("You don't have any item to remove!");
            return;
        }

        for(int i = 0; i <= quantityOrdered; i++) {
            if(itemOrdered[i].getTitle().equals(disc.getTitle())) {
                for(int j = i; j < quantityOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j+1];
                }
                itemOrdered[quantityOrdered-1] = null;
                quantityOrdered--;
                System.out.println("You've removed an item.");
                if(quantityOrdered == 0) {
                    System.out.println("Your cart is emptied.");
                }
                return;
            }
        }
        System.out.println("The item you're looking for is not in the cart!");
    }

    public float totalCost(){
        float total = 0;
        for(int i = 0; i < quantityOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    public void cartDisplay(){
        System.out.println("\nCurrent hust.soict.ict.aims.cart.Cart:");
        for(int i = 0; i < quantityOrdered; i++) {
            itemOrdered[i].itemDisplay();
        }
    }

    public void print() {
        System.out.println("****************************CART******************************");
        int cnt = 1;
        for(DigitalVideoDisc item : itemOrdered) {
            System.out.println(cnt + ". DVD - " + item.getTitle() + " - " + item.getDirector() + " - " + item.getDirector() + " - " + item.getLength()
                                + ": " + item.getCost() + "$");
            cnt++;
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("****************************************************************");
    }

    public void searchByID(int ID) {
        for(DigitalVideoDisc item : itemOrdered) {
            if(item.getId() == ID) item.itemDisplay();
        }
        System.out.println("No item in the cart with ID: " + ID);
    }

    public void searchByTitle(String title) {
        for(DigitalVideoDisc item : itemOrdered) {
            if(title.equals(item.getTitle())) item.itemDisplay();
        }
        System.out.println("No item in the cart with title: " + title);
    }
}
