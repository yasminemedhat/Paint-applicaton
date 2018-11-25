/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lenovo
 */
public class Triangle  extends ConcreteShape{
public Triangle(){
     prop = new HashMap<String, Double>();
        prop.put("width", 0.0);
        prop.put("height", 0.0);
}
    public Triangle(Point position, Map<String, Double> prop, Color color, Color fillColor) {
        super(position, prop, color, fillColor);
        p=position;
        this.prop=prop;
        c=color;
        fc=fillColor;
    }

  
    
    @Override
    public void draw(Graphics canvas) {
     ((Graphics2D) canvas).setStroke(new BasicStroke(2));
    ((Graphics2D) canvas).setColor(getColor());
               double p2 = p.x+prop.get("width");
                double p3 = p.x+((prop.get("width"))/2);
                double p4 = p.y - prop.get("height");
                ((Graphics2D) canvas).drawLine((int)p.x, (int)p.y, (int)p2,(int) p.y);
                 ((Graphics2D) canvas).drawLine((int)p.x, (int)p.y, (int)p3,(int) p4);
                 ((Graphics2D) canvas).drawLine((int)p2,(int) p.y, (int)p3,(int) p4);
               ((Graphics2D) canvas).setColor(getFillColor());
             ((Graphics2D) canvas).fillPolygon(new int[] {(int) p.x ,(int)p2,(int)p3}, new int[] {(int)p.y,(int)p.y,  (int)p4} , (int)3);
   // ((Graphics2D) canvas).drawPolyline(new int[] {(int) p.x ,(int)p2,(int)p3}, new int[] {(int)p.y,(int)p.y,  (int)p4} , (int)3);
    
   
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
     Shape t = new Triangle(getPosition(),
                                 getProperties(),
                                 getColor(),
                                getFillColor());
        
        return t;   
    }
    
}
