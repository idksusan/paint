package paint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
public class DrawPanel extends JPanel implements MouseMotionListener{
    private Graphics g;
    private Point pt;
    private ArrayList<Point> points;
    private ArrayList<Color> colors;
    private Color col;
    private int width;
    private int height;
    private String checkShape;
    public DrawPanel(){
        super();
        setBackground(Color.white);
        setPreferredSize(new Dimension(700, 475)); 
        addMouseMotionListener(this);  
        points = new ArrayList<Point>();
        colors = new ArrayList<Color>();
        col = Color.black;
        width = 5;
        height = 5;
        checkShape = "square";
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < points.size(); i++){
            for(int j = 0; j < colors.size(); j++){
                g.setColor(colors.get(i));
            }
            if (checkShape.equals("oval")){
                g.fillOval(points.get(i).x, points.get(i).y, width, height);
            }
            else if (checkShape.equals("square")){
                g.fillRect(points.get(i).x,points.get(i).y,width,height);
            }
        }
    }
    @Override
    public void mouseDragged(MouseEvent e){
        Graphics gg = getGraphics();
        setPt(e.getPoint());
        setG(gg);
        getG().setColor(col);
        if (checkShape.equals("oval")){
            getG().fillOval(getPt().x,getPt().y,width,height);
        }
        else if (checkShape.equals("square")){
            getG().fillRect(getPt().x,getPt().y,width,height);
        }
        points.add(e.getPoint());
        colors.add(col);
    }
    @Override
    public void mouseMoved(MouseEvent e){}
    public void setColor(Color c){
        col = c;
    }
    public void setSizeX(int x){
        width = x;
    }
    public void setSizeY(int y){
        height = y;
    }
    public int getSizeX(){
        return width;
    }
    public int getSizeY(){
        return height;
    }
    public void setShape(String sh){
        checkShape = sh;
    }
    public String getShape(){
        return checkShape;
    }
    public Graphics getG() {
        return g;
    }
    public void setG(Graphics g) {
        this.g = g;
    }
    public Point getPt() {
        return pt;
    }
    public void setPt(Point pt) {
        this.pt = pt;
    }
}
