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
public class Ellipse extends ConcreteShape {
public Ellipse(){
        prop = new HashMap<String, Double>();

    prop.put("Diameter1", 0.0);
     prop.put("Diameter2", 0.0);
}
    public Ellipse(Point p, Map<String, Double> prop, Color color, Color fillColor) {
        super(p, prop, color, fillColor);
        this.p= p;
        this.prop = prop;
        this.c = color;
        this.fc = fillColor;
    }
    
    

  

  
    @Override
    public void draw(Graphics canvas) {
    ((Graphics2D) canvas).setStroke(new BasicStroke(2));
    ((Graphics2D) canvas).setColor(getColor());
    ((Graphics2D) canvas).drawOval((int) p.getX(),
            (int) p.getY(),
            (int) prop.get("Diameter1").intValue(), 
            (int) prop.get("Diameter2").intValue());
    ((Graphics2D) canvas).setColor(getFillColor());
    ((Graphics2D) canvas).fillOval( (int) p.getX(),
            (int) p.getY(),
            (int) prop.get("Diameter1").intValue(), 
            (int) prop.get("Diameter2").intValue());

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
     Shape c = new Ellipse(getPosition(),
                                 getProperties(),
                                 getColor(),
                                getFillColor());
        
        return c;

    }
    
}
