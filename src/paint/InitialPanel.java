package paint;

import java.awt.*;
import javax.swing.*;
public class InitialPanel extends JPanel{
    public InitialPanel(){
        super();
        DrawPanel draw = new DrawPanel();
        add(draw);
        Options opt = new Options();
        add(opt);
        StatusPanel status = new StatusPanel(draw);
        OptionsPanel options = new OptionsPanel(draw, status);
        add(options);
        add(status);
    }
}
