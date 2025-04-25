package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreManagerScreen extends JFrame{
    private final Store store;

    public StoreManagerScreen(Store store) {
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        MenuItemListener itemListener = new MenuItemListener();
        JMenu menu = new JMenu("Options");

        JMenuItem viewStoreMenuItem = new JMenuItem("View Store");
        menu.add(viewStoreMenuItem);
        viewStoreMenuItem.addActionListener(itemListener);

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBookItem = new JMenuItem("Add Book");
        JMenuItem addDVDItem = new JMenuItem("Add DVD");
        JMenuItem addCDItem = new JMenuItem("Add CD");
        smUpdateStore.add(addBookItem);
        smUpdateStore.add(addDVDItem);
        smUpdateStore.add(addCDItem);

        addBookItem.addActionListener(itemListener);
        addCDItem.addActionListener(itemListener);
        addDVDItem.addActionListener(itemListener);

        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemInStore();
        for(int i = 0; i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addMedia(new Book("Harry Potter"));
        store.addMedia(new DigitalVideoDisc("Titanic"));
        store.addMedia(new CompactDisc("The Matrix"));
        new StoreManagerScreen(store);
    }

    private class MenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String menuAction = e.getActionCommand();
            switch (menuAction) {
                case "View Store":
                    new ViewStoreScreen(store);
                    break;
                case "Add Book":
                    new AddBookScreen(store);
                    break;
                case "Add CD":
                    new AddCDScreen(store);
                    break;
                default:
                    new AddDVDScreen(store);
                    break;
            }
        }
    }
}
