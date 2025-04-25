package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public abstract class AddMediaScreen extends JFrame {
    protected Store store;
    protected JTextField titleField;
    protected JTextField categoryField;
    protected JTextField costField;
    protected JButton addButton;

    public AddMediaScreen(Store store) {
        this.store = store;
        setLayout(new BorderLayout());

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 300);
        setJMenuBar(createMenuBar());

        add(createForm(), BorderLayout.CENTER);
        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenu smUpdate = new JMenu("Update Store");

        JMenuItem mAddBook = new JMenuItem("Add Book");
        mAddBook.addActionListener(e -> {
            new AddBookScreen(store);
            this.dispose();
        });
        smUpdate.add(mAddBook);

        JMenuItem mAddCD = new JMenuItem("Add CD");
        mAddCD.addActionListener(e -> { new AddCDScreen(store); this.dispose(); });
        smUpdate.add(mAddCD);

        JMenuItem mAddDVD = new JMenuItem("Add DVD");
        mAddDVD.addActionListener(e -> { new AddDVDScreen(store); this.dispose(); });
        smUpdate.add(mAddDVD);

        menu.add(smUpdate);

        JMenuItem mView = new JMenuItem("View Store");
        mView.addActionListener(e -> { new StoreManagerScreen(store); this.dispose(); });
        menu.add(mView);

        mb.setLayout(new FlowLayout(FlowLayout.LEFT));
        mb.add(menu);
        return mb;
    }

    protected abstract JPanel createForm();
}
