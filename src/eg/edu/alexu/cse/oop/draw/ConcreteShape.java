/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lenovo
 */
public abstract class ConcreteShape implements Shape{
     
     
    protected Point p;
    protected Map<String, Double> prop;
    protected Color c;
    protected Color fc;
    public ConcreteShape(){};
    public ConcreteShape(Point p ,Map<String, Double> prop,
            Color color,Color fillColor) {
        prop = new HashMap<String, Double>();
        prop.put("side", 0.0);
        this.p = p;
        this.prop = prop;
        this.c = color;
        this.fc = fillColor;
    } 
    
    @Override
    public void setPosition(Point position) {
         p=position;  
       
    }

    @Override
    public Point getPosition() {
    return p;       
    }

   

    @Override
    public void setProperties(Map<String, Double> properties) {
     prop = properties;        
    }

    @Override
    public Map<String, Double> getProperties() {
    return prop;     
    }

    @Override
    public void setColor(Color color) {
     c=color;   
    }

    @Override
    public Color getColor() {
       return c;
    }
    @Override
    public void setFillColor(Color color) {
     fc=color;    
    }

    @Override
    public Color getFillColor() {
    return fc;   
    }

    @Override
    public abstract void draw(Graphics canvas);// {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    @Override
    public abstract Object clone() throws CloneNotSupportedException;
       
}