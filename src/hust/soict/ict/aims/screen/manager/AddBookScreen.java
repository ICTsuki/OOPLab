package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddBookScreen extends AddMediaScreen {
    private JTextField authorField;

    public AddBookScreen(Store store) {
        super(store);
        setTitle("Add Book");
    }

    @Override
    protected JPanel createForm() {
        titleField = new JTextField();
        categoryField = new JTextField();
        costField = new JTextField();
        authorField = new JTextField();
        addButton = new JButton("Add");

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        formPanel.add(createInputPanel("Title", titleField));
        formPanel.add(createInputPanel("Category", categoryField));
        formPanel.add(createInputPanel("Cost", costField));
        formPanel.add(createInputPanel("Authors", authorField));
        formPanel.add(addButton);

        addButton.addActionListener(e -> {
            Book book = new Book(
                    titleField.getText(),
                    categoryField.getText(),
                    Float.parseFloat(costField.getText())
            );
            for (String a : authorField.getText().split(",")) {
                book.addAuthor(a.trim());
            }
            if(store.addMedia(book)) {
                JOptionPane.showMessageDialog(this,
                        "Added: " + book.getTitle(),
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(this,
                        book.getTitle() + " has already in store",
                        "Failed", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        return formPanel;
    }

    private JPanel createInputPanel(String label, JTextField field) {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new JLabel(label));
        panel.add(field);
        return panel;
    }
}
