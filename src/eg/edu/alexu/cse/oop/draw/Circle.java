package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;


public class Circle extends Ellipse{
public Circle(){
    prop = new HashMap<String, Double>();
        prop.put("Diameter1", 0.0);
        prop.put("Diameter2", 0.0);
       
}
    public Circle(Point position, Map<String, Double> prop, Color color, Color fillColor) {
        super(position, prop, color, fillColor);
        p = position;
        this.prop = prop;
        c = color;
        fc = fillColor;
    }
    
    
}