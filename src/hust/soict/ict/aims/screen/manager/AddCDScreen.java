package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddCDScreen extends AddMediaScreen{
    JTextField directorField, artistField;

    public AddCDScreen(Store store) {
        super(store);
        setTitle("Add CD");
    }

    @Override
    protected JPanel createForm() {
        titleField = new JTextField();
        categoryField = new JTextField();
        costField = new JTextField();
        directorField = new JTextField();
        artistField = new JTextField();
        addButton = new JButton("Add");

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        formPanel.add(createInputPanel("Title", titleField));
        formPanel.add(createInputPanel("Category", categoryField));
        formPanel.add(createInputPanel("Cost", costField));
        formPanel.add(createInputPanel("Director", directorField));
        formPanel.add(createInputPanel("Artist", artistField));
        formPanel.add(addButton);

        addButton.addActionListener(e -> {
             CompactDisc CD = new CompactDisc(
                    titleField.getText(),
                    categoryField.getText(),
                    Float.parseFloat(costField.getText()),
                    directorField.getText(),
                    artistField.getText()
            );

            if(store.addMedia(CD)) {
                JOptionPane.showMessageDialog(this,
                        "Added: " + CD.getTitle(),
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(this,
                        CD.getTitle() + " has already in store",
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
