package paint;

import java.awt.*;
import javax.swing.*;
public class Options extends JPanel{
    Options(){
        JLabel l1 = new JLabel("Options");
        add(l1);
        setPreferredSize(new Dimension(700,25));
        setMaximumSize(new Dimension(Short.MAX_VALUE,25));
    }
}
