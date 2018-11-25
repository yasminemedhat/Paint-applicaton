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
public class Rectangle extends ConcreteShape{
public Rectangle(){
        prop = new HashMap<String, Double>();
        prop.put("width", 0.0);
        prop.put("length", 0.0);
}
    public Rectangle(Point position, Map<String, Double> prop, Color color, Color fillColor) {
        super(position, prop, color, fillColor);
         this.p= position;
        this.prop = prop;
        this.c = color;
        this.fc = fillColor;
    }
    @Override
    public void draw(Graphics canvas) {
        ((Graphics2D) canvas).setStroke(new BasicStroke(2));
        ((Graphics2D) canvas).setColor(getColor());
        ((Graphics2D) canvas).drawRect((int) p.getX(),
            (int) p.getY(),
          (int)prop.get("width").intValue(), 
            (int)prop.get("length").intValue());
    ((Graphics2D) canvas).setColor(getFillColor());
    ((Graphics2D) canvas).fillRect( (int) p.getX(),
            (int) p.getY(),
           (int)prop.get("width").intValue(), 
            (int)prop.get("length").intValue() );
   
}

    @Override
    public Object clone() throws CloneNotSupportedException {
        Shape r = new Rectangle(getPosition(),
                                 getProperties(),
                                 getColor(),
                                getFillColor());
        
        return r; 
    }
    }
