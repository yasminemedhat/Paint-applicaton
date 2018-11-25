/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lenovo
 */
public class Square extends Rectangle {
    public Square(){
    
     prop = new HashMap<String, Double>();
        prop.put("width", 0.0);
        prop.put("length", 0.0);}
    public Square(Point position, Map<String, Double> prop, Color color, Color fillColor) {
        super(position, prop, color, fillColor);
         this.p= position;
        this.prop = prop;
        this.c = color;
        this.fc = fillColor;
    }
    
    
}
