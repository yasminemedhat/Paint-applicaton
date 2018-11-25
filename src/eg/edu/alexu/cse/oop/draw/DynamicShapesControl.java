/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG PC
 */
public class DynamicShapesControl  implements ActionListener {
    private PaintUI UI;
    private MyCanvas canvas;
    private Point currentPos;
   private double width,height;
    private String in;
    private HashMap<String, Double> prop;
    private Shape currShape;
    private Color color;
    private Color fillColor;
    
    private HashMap<Integer, Shape> shapeKey = new HashMap<Integer, Shape>();
   // private Point newPoint;
    int noOfParameters;
    String key;
    Double value;
    String buttonName;
    String input;
    
    public DynamicShapesControl(PaintUI UI)
    {
        this.UI=UI;
       canvas=UI.canvas;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

       canvas=UI.canvas;
        
                buttonName = ae.getActionCommand();

             currentPos = new Point();
        prop = new HashMap<String, Double>();

        input = JOptionPane.showInputDialog("What's x position?");
        currentPos.x = Integer.parseInt(input);
        in = JOptionPane.showInputDialog("What's y position?");
        currentPos.y = Integer.parseInt(in);
        
        List<Class<? extends Shape>> shapeTypes = canvas.getSupportedShapes();
        Class kilas;
        int i;
        for ( i = 0; i < shapeTypes.size(); i++) {
            System.out.println(shapeTypes.get(i).getSimpleName());
            if(shapeTypes.get(i).getSimpleName().
                    equalsIgnoreCase(buttonName))
                        break;
               
        }
        
        try {
            currShape=(Shape)shapeTypes.get(i).newInstance();
            // currShape = (shapeTypes.get(i)).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(DynamicShapesControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DynamicShapesControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        noOfParameters = currShape.getProperties().size();
        Object[] names = currShape.getProperties().keySet().toArray();
        
        for (i = 0; i < noOfParameters; i++) {
            key = (String) names[i];
            in = JOptionPane.showInputDialog(key);
            value = new Double(in);
            prop.put(key, value);
        }
        
        color = JColorChooser.showDialog(null, "Out Color", Color.BLACK);
        fillColor = JColorChooser.showDialog(null, "In Color", Color.WHITE);

        currShape.setPosition(currentPos);
        currShape.setColor(color);
        currShape.setFillColor(fillColor);
        currShape.setProperties(prop);
        
        
        canvas.addShape(currShape);
        canvas.repaint();
        UI.shapeKey.put(UI.c, currShape);
                   UI.ComboBox.addItem(UI.c+" -"+buttonName);
                    UI.c++;
              
        }
    }
    



/*import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
/*public class DynamicShapeListener implements ActionListener {
     private PaintUI frame;
     private String buttonText;
     
    String in;
    Point newPos;
    
    
      public DynamicShapeListener(PaintUI frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            buttonText = e.getActionCommand();
            
       }
    
}
*/