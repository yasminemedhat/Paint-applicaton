/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPanel;


/**
 *
 * @author lenovo
 */
public class MyCanvas extends JPanel implements DrawingEngine {
  
    
    private ArrayList<Shape> shapes;
   Stack<ArrayList<Shape>> undoStack;
    Stack<ArrayList<Shape>> redoStack;
     List<Class<? extends Shape>> supportedShapes;
   Object o;
   // public JComboBox<String> comboShapes;
    public MyCanvas(){
        this.shapes = new ArrayList<>();
       undoStack = new Stack<ArrayList<Shape>>();
        redoStack = new Stack<ArrayList<Shape>>();
      supportedShapes = new ArrayList<Class<? extends Shape>>();
   
    }
    
     public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Shape s: shapes){
            s.draw(g);
        }
    }
    @Override
    public void addShape(Shape shape) {

         try {
            addUndoRec();
        } catch (CloneNotSupportedException ex) {
        }
        shapes.add(shape);
        
    }

    @Override
    public void removeShape(Shape shape) {
     try {
            addUndoRec();
        } catch (CloneNotSupportedException ex) {
        }
        shapes.remove(shape);
    }

    @Override
    public Shape[] getShapes() {
    return (Shape[])shapes.toArray();
       
    }

    @Override
    public void refresh(Graphics canvas) {
      for (int i = 0 ; i < shapes.size() ; i++)
        {
            shapes.get(i).draw(canvas);
        }   
    }

    @Override
    public List<Class<? extends Shape>> getSupportedShapes() {
       return supportedShapes;   
    }

    @Override
    public void installPluginShape(Class<? extends Shape> shapeClass) {
      supportedShapes.add(shapeClass);
              //shapes.add((Shape) shapeClass);
      /* try {
           Object o = shapeClass.newInstance();
           this.addShape((Shape)o);
         
        } catch (InstantiationException ex) {
            Logger.getLogger(MyCanvas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MyCanvas.class.getName()).log(Level.SEVERE, null, ex);
        }
     */
    }

    @Override
    public void undo() {
      
       
        if (!undoStack.isEmpty()) {
                    redoStack.push(shapes);
                    shapes = (undoStack.pop());
                }
    }

    @Override
    public void redo() {
         if (!redoStack.isEmpty()) {
                    undoStack.push(shapes);
                    shapes = (redoStack.pop());
                }
    }

    public void addUndoRec() throws CloneNotSupportedException {
      ArrayList<Shape> copyList = new ArrayList<Shape>();
      if(undoStack.size()==20){
          int r=0;
      undoStack.removeElementAt(r);
      r++;
       }
        for (int i = 0; i < shapes.size(); i++) {
            copyList.add((Shape)shapes.get(i).clone());
        }

        undoStack.push(copyList);
        redoStack.clear();
    }

}
