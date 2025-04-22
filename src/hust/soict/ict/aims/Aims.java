package hust.soict.ict.aims;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.*;
import hust.soict.ict.aims.store.Store;

import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        store.addMedia(new DigitalVideoDisc("Avengers", "Action", 25.5f));
        store.addMedia(new DigitalVideoDisc("Lion King", "Animation"));
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    store.printStore();
                    int storeChoice = -1;
                    while (storeChoice != 0) {
                        storeMenu();
                        storeChoice = sc.nextInt();
                        sc.nextLine();
                        switch (storeChoice) {
                            case 1:
                                System.out.println("Enter media title: ");
                                String title = sc.nextLine();
                                Media media = store.searchByTitle(title);
                                if (media != null) {
                                    System.out.println(media);
                                    int mediaChoice = -1;
                                    while (mediaChoice != 0) {
                                        mediaDetailMenu();
                                        mediaChoice = sc.nextInt();
                                        sc.nextLine();
                                        switch (mediaChoice) {
                                            case 1:
                                                cart.addMedia(media);
                                                break;
                                            case 2:
                                                if (media instanceof Playable) {
                                                    ((Playable) media).play();
                                                } else {
                                                    System.out.println("This media cannot be played.");
                                                }
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.println("Invalid option.");
                                        }
                                    }
                                } else {
                                    System.out.println("Media not found.");
                                }
                                break;
                            case 2:
                                System.out.println("Enter title of media to add to cart: ");
                                title = sc.nextLine();
                                media = store.searchByTitle(title);
                                if (media != null) {
                                    cart.addMedia(media);
                                    System.out.println("Number of items in cart: " + cart.getItemsOrdered().size());
                                } else {
                                    System.out.println("Media not found.");
                                }
                                break;
                            case 3:
                                System.out.println("Enter title of media to play: ");
                                title = sc.nextLine();
                                media = store.searchByTitle(title);
                                if (media instanceof Playable) {
                                    ((Playable) media).play();
                                } else {
                                    System.out.println("Media cannot be played or not found.");
                                }
                                break;
                            case 4:
                                cart.printCart();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    }
                    break;
                case 2: // Update Store
                    System.out.println("1. Add media\n2. Remove media");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();
                    if (updateChoice == 1) {
                        System.out.println("Enter title, category, cost (space-separated): ");
                        String[] info = sc.nextLine().split(" ");
                        Media newMedia = new DigitalVideoDisc(info[0], info[1], Float.parseFloat(info[2]));
                        store.addMedia(newMedia);
                    } else if (updateChoice == 2) {
                        System.out.println("Enter title of media to remove: ");
                        String removeTitle = sc.nextLine();
                        Media toRemove = store.searchByTitle(removeTitle);
                        if (toRemove != null) {
                            store.removeMedia(toRemove);
                        } else {
                            System.out.println("Media not found in store.");
                        }
                    }
                    break;

                case 3:
                    cart.printCart();
                    int cartChoice = -1;
                    while (cartChoice != 0) {
                        cartMenu();
                        cartChoice = sc.nextInt();
                        sc.nextLine();
                        switch (cartChoice) {
                            case 1: // Filter media in cart
                                System.out.println("1. Filter by id\n2. Filter by title");
                                int filterOption = sc.nextInt();
                                sc.nextLine();
                                if (filterOption == 1) {
                                    System.out.println("Enter ID: ");
                                    int id = sc.nextInt();
                                    sc.nextLine();
                                    cart.searchByID(id);
                                } else if (filterOption == 2) {
                                    System.out.println("Enter title: ");
                                    String t = sc.nextLine();
                                    cart.searchByTitle(t);
                                }
                                break;

                            case 2:
                                System.out.println("1. Sort by title\n2. Sort by cost");
                                int sortOption = sc.nextInt();
                                sc.nextLine();
                                if (sortOption == 1) {
                                    cart.sortByTitle();
                                } else if (sortOption == 2) {
                                    cart.sortByCost();
                                }
                                break;

                            case 3:
                                System.out.println("Enter title of media to remove: ");
                                String removeTitle = sc.nextLine();
                                Media media = cart.searchByTitle(removeTitle);
                                if (media != null) {
                                    cart.removeMedia(media);
                                } else {
                                    System.out.println("Media not found in cart.");
                                }
                                break;

                            case 4:
                                System.out.println("Enter title of media to play: ");
                                String playTitle = sc.nextLine();
                                Media mediaToPlay = cart.searchByTitle(playTitle);
                                if (mediaToPlay instanceof Playable) {
                                    ((Playable) mediaToPlay).play();
                                } else {
                                    System.out.println("This media cannot be played or was not found.");
                                }
                                break;

                            case 5:
                                System.out.println("An order has been created.");
                                cart.clear();
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    }
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
}