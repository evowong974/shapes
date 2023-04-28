package edu.guilford;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

// ShapePane will extend Pane beause we want exact control over where we place the
// graphic objects
public class ShapePane extends Pane{
    // ShapePane does everythng Pane does


    // constructor: this constructor essentially overrides the Pane default constructor 
    public ShapePane() {
        // When a class extends another class, the first line should be asking the superclass
        // to rub its constructor
        super(); // *this* refers to the current object, *super* refers to the superclass
        // could do other stuff as well
    }
        
    // add a Shape to the Pane
    public void addShape(Shape shape) {
        // add the shape to the Pane
        this.getChildren().add(shape);
    }

    // remove a Shape from the Pane
    public void removeShape(Shape shape) {
        // remove the shape from the Pane
        this.getChildren().remove(shape);
    }

    // clear the Pane of all Shapes
    public void clear() {
        // clear the Pane of all Shapes
        this.getChildren().clear();
    }
}
