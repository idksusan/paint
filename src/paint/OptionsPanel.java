package paint;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class OptionsPanel extends JPanel implements ActionListener{
    private JButton colorRed;
    private JButton colorBlue;
    private JButton colorYellow;
    private JButton colorGreen;
    private JButton shapeSquare;
    private JButton shapeOval;
    private JButton sizeSmall;
    private JButton sizeMed;
    private JButton sizeLarge;
    private GridLayout grid;
    private DrawPanel draw;
    private StatusPanel status;
    OptionsPanel(DrawPanel dr, StatusPanel st){
        super();
        setPreferredSize(new Dimension(700, 50));
        setMaximumSize(new Dimension(Short.MAX_VALUE,50));
        setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        addColors();
        addShapes();
        addSizes();
        this.draw = dr;
        this.status = st;
    }
    void addColors(){
        colorRed = new JButton("Red");
        add(colorRed);
        colorRed.addActionListener(this);
        colorBlue = new JButton("Blue");
        add(colorBlue);
        colorBlue.addActionListener(this);
        colorYellow = new JButton("Yellow");
        add(colorYellow);
        colorYellow.addActionListener(this);
        colorGreen = new JButton("Green");
        add(colorGreen);
        colorGreen.addActionListener(this);
    }
    void addShapes(){
        shapeSquare = new JButton("Square");
        add(shapeSquare);
        shapeSquare.addActionListener(this);
        shapeOval = new JButton("Oval");
        add(shapeOval);
        shapeOval.addActionListener(this);
    }
    void addSizes(){
        sizeSmall = new JButton("Small");
        add(sizeSmall);
        sizeSmall.addActionListener(this);
        sizeMed = new JButton("Medium");
        add(sizeMed);
        sizeMed.addActionListener(this);
        sizeLarge = new JButton("Large");
        add(sizeLarge);
        sizeLarge.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == colorRed){
            draw.setColor(Color.red);
            //draw.getG().setColor(Color.red);
            status.setColor("red");
        }
        if(obj == colorBlue){
            draw.setColor(Color.blue);
            //draw.getG().setColor(Color.blue);
            status.setColor("blue");
        }
        if(obj == colorYellow){
            draw.setColor(Color.yellow);
            //draw.getG().setColor(Color.yellow);
            status.setColor("yellow");
        }
        if(obj == colorGreen){
            draw.setColor(Color.green);
            //draw.getG().setColor(Color.green);
            status.setColor("green");
        }
        if (obj == sizeSmall){
            status.setWeight("small");
            draw.setSizeX(5);
            draw.setSizeY(5);
        }
        if (obj == sizeMed){
            status.setWeight("medium");
            draw.setSizeY(10);
            draw.setSizeX(10);
        }
        if (obj == sizeLarge){
            status.setWeight("large");
            draw.setSizeX(20);
            draw.setSizeY(20);
        }
        if (obj == shapeSquare){
            status.setShape("square");
            draw.setShape("square");
        }
        if (obj == shapeOval){
            status.setShape("oval");
            draw.setShape("oval");
        }
    }
}
