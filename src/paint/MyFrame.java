package paint;

import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame {
    public MyFrame(){
        super("Paint");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        InitialPanel inp = new InitialPanel();
        add(inp);
        inp.setLayout(new BoxLayout(inp,BoxLayout.PAGE_AXIS));
        setSize(700, 600);
        setVisible(true);
    }
}
