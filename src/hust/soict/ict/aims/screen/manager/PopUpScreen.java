package hust.soict.ict.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public abstract class PopUpScreen extends JFrame {
    protected Container cp;

    public PopUpScreen() {
        cp = getContentPane();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
