package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class ViewStoreScreen extends PopUpScreen {

    public ViewStoreScreen(Store store) {
        cp.setLayout(new GridLayout(store.getNumberOfItemInStore(), 0));

        for(Media item : store.getItemInStore()) {
            cp.add(new Label(item.toString()));
        }

        setTitle("Store");
        setSize(600, 400);
    }
}
