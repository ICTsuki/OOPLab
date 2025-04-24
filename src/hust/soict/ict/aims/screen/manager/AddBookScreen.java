package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddBookScreen extends AddMediaScreen{
    JTextField inputTF = new JTextField(10);
    CombinedListener listener = new CombinedListener();
    JButton addAuthorButton = new JButton("Add Author");
    Book book = new Book();

    public AddBookScreen(Store store) {
        super(store);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel[] subPanel = new JPanel[3];
        JLabel title = new JLabel("Title"), category = new JLabel("Category"), cost = new JLabel("Cost");



        for(int i = 0; i < 3; i++) {
            subPanel[i] = new JPanel();
            subPanel[i].setLayout(new GridLayout(1, 2));
            if(i == 0) {
                fillSubPanel(subPanel[i], title);
            }
            else if (i == 1) {
                fillSubPanel(subPanel[i], category);
            }
            else {
                fillSubPanel(subPanel[i], cost);
            }
        }


    }

    private void fillSubPanel(JPanel panel, JLabel label) {
        panel.add(label);
        panel.add(inputTF);
        listener.setType(label.getText());
        inputTF.addActionListener(listener);
    }

    private class CombinedListener implements ActionListener {
        private String type;

        public void setType(String type) {
            this.type = type;
        }

        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source == inputTF) {
                String info = inputTF.getText();
                switch (type) {
                    case "Title":
                        book.setTitle(info);
                        break;
                    case "Category":
                        book.setCategory(info);
                        break;
                    case "Cost":
                        float cost = Float.parseFloat(info);
                        book.setCost(cost);
                        break;
                    default:
                        book.addAuthor(info);
                        break;
                }
            } else if (source == addAuthorButton) { // <-- replace with actual button variable
                JPanel addAuthorPanel = new JPanel(new GridLayout(1, 1));
                mainPanel.add(addAuthorPanel);
                JLabel authorLabel = new JLabel("Author Name");
                fillSubPanel(addAuthorPanel, authorLabel);
            }
        }
    }

}
