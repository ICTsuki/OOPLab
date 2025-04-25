package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class ViewStoreScreen extends JFrame {

    public ViewStoreScreen(Store store) {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(store.getNumberOfItemInStore(), 0));

        for(Media item : store.getItemInStore()) {
            cp.add(new Label(item.toString()));
        }

        setTitle("Store");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
