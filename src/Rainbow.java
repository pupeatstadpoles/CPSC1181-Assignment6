package com.example.assign6;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

/**
 * Rainbow class for constructing the stripes in a rainbow in the GUI using Arc objects
 */
public class Rainbow {
    public Arc stripe;

    /**
     * Public Constructor
     * @param centerX Center of the Arc along the X-axis
     * @param centerY Center of the Arc along the Y-axis
     * @param radiusX radius of the Arc along X-axis
     * @param radiusY radius of the Arc along Y-axis
     * @param startAngle starting angle for the Arc
     * @param length ending angle for the Arc
     * @param COLOR Color for the Arc
     * @param root Pane object
     */
    public Rainbow(double centerX, double centerY, double radiusX, double radiusY, double startAngle, double length, Color COLOR, Pane root) {
        stripe = new Arc(centerX, centerY, radiusX, radiusY, startAngle, length);
        stripe.setStroke(COLOR);
        stripe.setStrokeWidth(20);
        stripe.setFill(null);
        stripe.setType(ArcType.OPEN);

        root.getChildren().add(stripe);
    }
}
