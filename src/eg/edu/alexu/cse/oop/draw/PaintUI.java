/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Point;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
@SuppressWarnings("InitializerMayBeStatic")
public class PaintUI extends javax.swing.JFrame {

    private Point currentPos;
    private double width, height;
    private String in;
    private HashMap<String, Double> prop;
    private Shape currShape;
    private Color color;
    private Color fillColor;
    public int c = 1;
    public HashMap<Integer, Shape> shapeKey = new HashMap<Integer, Shape>();
    private Point newPoint;
    int noOfParameters;
    String key;
    Double value;
    private HashMap<String, Method> edit = new HashMap<String, Method>();
    public DynamicShapesControl listener;
    MyCanvas canvas;

    public PaintUI() {
        listener = new DynamicShapesControl(this);
        initComponents();
        canvas = (MyCanvas) jPanel1;
        //this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new MyCanvas();
        jPanel2 = new javax.swing.JPanel();
        UndoB = new javax.swing.JButton();
        RedoB = new javax.swing.JButton();
        EditB = new javax.swing.JButton();
        MoveB = new javax.swing.JButton();
        CopyB = new javax.swing.JButton();
        ColorizeB = new javax.swing.JButton();
        DeleteB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        addShape = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CircleB = new javax.swing.JButton();
        LineSegmentB = new javax.swing.JButton();
        SquareB = new javax.swing.JButton();
        EllipseB = new javax.swing.JButton();
        TriangleB = new javax.swing.JButton();
        RectangleB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Paint Application");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        UndoB.setText("Undo");
        UndoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoBActionPerformed(evt);
            }
        });

        RedoB.setText("Redo");
        RedoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoBActionPerformed(evt);
            }
        });

        EditB.setText("Edit");
        EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBActionPerformed(evt);
            }
        });

        MoveB.setText("Move");
        MoveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveBActionPerformed(evt);
            }
        });

        CopyB.setText("Copy");
        CopyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyBActionPerformed(evt);
            }
        });

        ColorizeB.setText("Colorize");
        ColorizeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeBActionPerformed(evt);
            }
        });

        DeleteB.setText("Delete");
        DeleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Select Shape");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        addShape.setBackground(new java.awt.Color(203, 18, 21));
        addShape.setForeground(new java.awt.Color(255, 255, 255));
        addShape.setText("Add Shape");
        addShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addShapeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(UndoB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RedoB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CopyB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MoveB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ColorizeB)
                                    .addComponent(DeleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addShape, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UndoB)
                    .addComponent(RedoB))
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoveB)
                    .addComponent(EditB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CopyB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorizeB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addShape)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        CircleB.setText("Circle");
        CircleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleBActionPerformed(evt);
            }
        });
        jPanel3.add(CircleB);

        LineSegmentB.setText("Line Segment");
        LineSegmentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineSegmentBActionPerformed(evt);
            }
        });
        jPanel3.add(LineSegmentB);

        SquareB.setText("Square");
        SquareB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareBActionPerformed(evt);
            }
        });
        jPanel3.add(SquareB);

        EllipseB.setText("Ellipse");
        EllipseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EllipseBActionPerformed(evt);
            }
        });
        jPanel3.add(EllipseB);

        TriangleB.setText("Triangle");
        TriangleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleBActionPerformed(evt);
            }
        });
        jPanel3.add(TriangleB);

        RectangleB.setText("Rectangle");
        RectangleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleBActionPerformed(evt);
            }
        });
        jPanel3.add(RectangleB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CircleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleBActionPerformed
        MyCanvas canvas = (MyCanvas) jPanel1;
        currentPos = new Point();
        in = JOptionPane.showInputDialog("What's x position?");
        currentPos.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's y position?");
        currentPos.y = Integer.parseInt(in);
        
          currShape = new Circle();
        prop = new HashMap<String, Double>();
        noOfParameters = currShape.getProperties().size();
        Object[] names = currShape.getProperties().keySet().toArray();
        int i;
        
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

        shapeKey.put(c, currShape);
        ComboBox.addItem(c + "-Circle");
        c++;


    }//GEN-LAST:event_CircleBActionPerformed

    private void LineSegmentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineSegmentBActionPerformed
        MyCanvas canvas = (MyCanvas) jPanel1;
        currentPos = new Point();
        in = JOptionPane.showInputDialog("What's 1st x position?");
        currentPos.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's 1st y position?");
        currentPos.y = Integer.parseInt(in);
        
        currShape = new LineS();
        prop = new HashMap<String, Double>();
        noOfParameters = currShape.getProperties().size();
        Object[] names = currShape.getProperties().keySet().toArray();
        int i;
        
        for (i = 0; i < noOfParameters; i++) {
            key = (String) names[i];
            in = JOptionPane.showInputDialog(key);
            value = new Double(in);
            prop.put(key, value);
        }
        
        color = JColorChooser.showDialog(null, "Line color", Color.BLACK);

        currShape.setPosition(currentPos);
        currShape.setColor(color);
        currShape.setFillColor(fillColor);
        currShape.setProperties(prop);
        canvas.addShape(currShape);
        canvas.repaint();

        shapeKey.put(c, currShape);
        ComboBox.addItem(c + "-Line Segement");
        c++;

    }//GEN-LAST:event_LineSegmentBActionPerformed

    private void SquareBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareBActionPerformed

        MyCanvas canvas = (MyCanvas) jPanel1;
        currentPos = new Point();
        in = JOptionPane.showInputDialog("What's x position?");
        currentPos.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's y position?");
        currentPos.y = Integer.parseInt(in);
        currShape = new Square();
        prop = new HashMap<String, Double>();
        noOfParameters = currShape.getProperties().size();
        Object[] names = currShape.getProperties().keySet().toArray();
        int i;
        
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
        shapeKey.put(c, currShape);
        ComboBox.addItem(c + "-Square");
        c++;
    }//GEN-LAST:event_SquareBActionPerformed

    private void EllipseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EllipseBActionPerformed

        MyCanvas canvas = (MyCanvas) jPanel1;
        currentPos = new Point();
        in = JOptionPane.showInputDialog("What's x position?");
        currentPos.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's y position?");
        currentPos.y = Integer.parseInt(in);
        
        currShape = new Ellipse();
        prop = new HashMap<String, Double>();
        noOfParameters = currShape.getProperties().size();
        Object[] names = currShape.getProperties().keySet().toArray();
        int i;
        
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
        shapeKey.put(c, currShape);
        ComboBox.addItem(c + "-Ellipse");
        c++;
        canvas.addShape(currShape);
        canvas.repaint();

    }//GEN-LAST:event_EllipseBActionPerformed

    
    private void TriangleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleBActionPerformed

        MyCanvas canvas = (MyCanvas) jPanel1;
        currentPos = new Point();
        in = JOptionPane.showInputDialog("What's the x position?");
        currentPos.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's the y position?");
        currentPos.y = Integer.parseInt(in);
        currShape = new Triangle();
        prop = new HashMap<String, Double>();
        noOfParameters = currShape.getProperties().size();
        Object[] names = currShape.getProperties().keySet().toArray();
        int i;
        
        for (i = 0; i < noOfParameters; i++) {
            key = (String) names[i];
            in = JOptionPane.showInputDialog(key);
            value = new Double(in);
            prop.put(key, value);
        }
                color = JColorChooser.showDialog(null, "OUTER COLOR", Color.BLACK);
        fillColor = JColorChooser.showDialog(null, "INNER COLOR", Color.WHITE);
        currShape.setPosition(currentPos);
        currShape.setColor(color);
        currShape.setFillColor(fillColor);
        currShape.setProperties(prop);
        canvas.addShape(currShape);
        canvas.repaint();
        shapeKey.put(c, currShape);
        ComboBox.addItem(c + "-Triangle");
        c++;
    }//GEN-LAST:event_TriangleBActionPerformed

    private void RectangleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleBActionPerformed

        MyCanvas canvas = (MyCanvas) jPanel1;
        currentPos = new Point();
        in = JOptionPane.showInputDialog("What's x position?");
        currentPos.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's y position?");
        currentPos.y = Integer.parseInt(in);
         currShape = new Rectangle();
        prop = new HashMap<String, Double>();
        noOfParameters = currShape.getProperties().size();
        Object[] names = currShape.getProperties().keySet().toArray();
        int i;
        
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

        shapeKey.put(c, currShape);
        ComboBox.addItem(c + "-Rectangle");
        c++;
        canvas.repaint();
    }//GEN-LAST:event_RectangleBActionPerformed

    private void UndoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoBActionPerformed
        MyCanvas canvas = (MyCanvas) jPanel1;

        canvas.undo();
        canvas.repaint();
    }//GEN-LAST:event_UndoBActionPerformed

    private void RedoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoBActionPerformed
        MyCanvas canvas = (MyCanvas) jPanel1;
        canvas.redo();
        canvas.repaint();
    }//GEN-LAST:event_RedoBActionPerformed

    private void ColorizeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeBActionPerformed
        MyCanvas canvas = (MyCanvas) jPanel1;
        ComboBox.getSelectedItem();
        String selection = (String) ComboBox.getSelectedItem();
        int index = Integer.parseInt(selection.substring(0, 1));
        color = JColorChooser.showDialog(null, "choose a color", Color.yellow);
        fillColor = JColorChooser.showDialog(null, "choose a color", Color.yellow);
        try {
            canvas.addUndoRec();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PaintUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        (shapeKey.get(index)).setColor(color);
        (shapeKey.get(index)).setFillColor(fillColor);

        canvas.repaint();

    }//GEN-LAST:event_ColorizeBActionPerformed

    private void DeleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBActionPerformed
        MyCanvas canvas = (MyCanvas) jPanel1;
        ComboBox.getSelectedItem();
        String selection = (String) ComboBox.getSelectedItem();
        int index = Integer.parseInt(selection.substring(0, 1));
        try {
            canvas.addUndoRec();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PaintUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        canvas.removeShape(shapeKey.get(index));
        shapeKey.remove(index);
             ComboBox.removeItemAt(index);
                   canvas.repaint();


    }//GEN-LAST:event_DeleteBActionPerformed

    private void CopyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyBActionPerformed

        MyCanvas canvas = (MyCanvas) jPanel1;
        ComboBox.getSelectedItem();
        String selection = (String) ComboBox.getSelectedItem();
        int index = Integer.parseInt(selection.substring(0, 1));
        try {
            currShape = (Shape) (shapeKey.get(index)).clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PaintUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        newPoint = new Point();
        in = JOptionPane.showInputDialog("What's x position?");
        newPoint.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's y position?");
        newPoint.y = Integer.parseInt(in);

        currShape.setPosition(newPoint);
        canvas.addShape(currShape);
        canvas.repaint();

        /* jPanel3.add(new JButton("Hehe"));
            jPanel3.validate();
            jPanel3.repaint();*/

    }//GEN-LAST:event_CopyBActionPerformed

    private void MoveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveBActionPerformed

        MyCanvas canvas = (MyCanvas) jPanel1;
        newPoint = new Point();
        String selection = (String) ComboBox.getSelectedItem();
        int index = Integer.parseInt(selection.substring(0, 1));
        in = JOptionPane.showInputDialog("What's x position?");
        newPoint.x = Integer.parseInt(in);
        in = JOptionPane.showInputDialog("What's y position?");
        newPoint.y = Integer.parseInt(in);
        currShape = (shapeKey.get(index));

        currShape.setPosition(newPoint);
        canvas.repaint();

    }//GEN-LAST:event_MoveBActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void EditBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBActionPerformed
        MyCanvas canvas = (MyCanvas) jPanel1;
        ComboBox.getSelectedItem();
        String selection = (String) ComboBox.getSelectedItem();
        int index = Integer.parseInt(selection.substring(0, 1));
        prop = new HashMap<String, Double>();
        in = JOptionPane.showInputDialog("Enter Number of parametes");
        noOfParameters = Integer.parseInt(in);

        for (int i = 1; i <= noOfParameters; i++) {
            key = JOptionPane.showInputDialog("Parameter " + i + " Key:");
            in = JOptionPane.showInputDialog("Parameter " + i + " Value:");
            value = new Double(in);
            prop.put(key, value);
        }
        currShape = (shapeKey.get(index));

        currShape.setProperties(prop);

        canvas.repaint();

    }//GEN-LAST:event_EditBActionPerformed

    private void addShapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addShapeActionPerformed

        String name = JOptionPane.showInputDialog("esm el class eh ya walad:");
        JFileChooser chooser = new JFileChooser();

        if (chooser.showSaveDialog(canvas) == JFileChooser.APPROVE_OPTION) {

            try {
                URLClassLoader Load = new URLClassLoader(new URL[]{chooser.getSelectedFile().toURI().toURL()}, this.getClass().getClassLoader());
                Class hamada = (Class) Class.forName("eg.edu.alexu.cse.oop.draw." + name, true, Load);
                canvas.installPluginShape(hamada);

            } catch (MalformedURLException ex) {
                Logger.getLogger(PaintUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PaintUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            JButton b = new JButton(name);
            jPanel3.add(b);
            b.addActionListener(listener);
            
            jPanel3.validate();
            jPanel3.repaint();
            canvas.repaint();
        }
    }//GEN-LAST:event_addShapeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaintUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CircleB;
    private javax.swing.JButton ColorizeB;
    public javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton CopyB;
    private javax.swing.JButton DeleteB;
    private javax.swing.JButton EditB;
    private javax.swing.JButton EllipseB;
    private javax.swing.JButton LineSegmentB;
    private javax.swing.JButton MoveB;
    private javax.swing.JButton RectangleB;
    private javax.swing.JButton RedoB;
    private javax.swing.JButton SquareB;
    private javax.swing.JButton TriangleB;
    private javax.swing.JButton UndoB;
    private javax.swing.JButton addShape;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
