package paint;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
public class StatusPanel extends JPanel{
    private String color;
    private String weight;
    private String shape;
    private String s;
    private JLabel l1;
    private JLabel l2;
    StatusPanel(DrawPanel dr){
        super();
        setPreferredSize(new Dimension(700,50));
        setMaximumSize(new Dimension(Short.MAX_VALUE,50));
        setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        color = "black";
        weight = "small";
        shape = "square";
        l1 = new JLabel("Status:");
        add(l1);
        s = "Your pen is ";
        l2 = new JLabel(s);
        updateStatus();
        add(l2);
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
        updateStatus();
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
        updateStatus();
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        updateStatus();
        this.shape = shape;
    }
    private void updateStatus(){
        l2.setText(s + color + " " + weight + " " + shape);
    }
}
