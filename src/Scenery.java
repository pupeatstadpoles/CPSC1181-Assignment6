package com.example.assign6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Name: Pup Abdulgapul
 * Professor: Hengameh Hamavand
 * Course: CPSC 1181
 * Date: Feb 21, 2023
 * Purpose: Program for using JavaFX to create a Scenery with Trees, a Sheep, and several Rainbow stripes
 */
public class Scenery extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Overrides start() from Application
     * @param primaryStage the Stage for adding Nodes
     */
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Rectangle ground = new Rectangle(0, 400, 600, 100);
        ground.setFill(Color.DARKGREEN);
        root.getChildren().add(ground);

        Tree t1 = new Tree (100, 420);
        root.getChildren().addAll(t1.getAllNodes());

        Tree t2 = new Tree(200, 440, 100, 100, Color.rgb(100, 100, 80));
        root.getChildren().addAll(t2.getAllNodes());

        Tree t3 = new Tree(250, 440, 100, 250, Color.rgb(120, 120, 10));
        root.getChildren().addAll(t3.getAllNodes());
        makeRainbow(root);
        Sheep squart = new Sheep(220, 430);
        root.getChildren().addAll(squart.getAllNodes());

        Scene scene = new Scene(root, 430, 500);
        primaryStage.setTitle("JavaFX Trees");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);


    }


    /**
     * Creates Rainbow objects, where each Rainbow is a stripe in a rainbow
     * @param root a Pane being passed through
     */
    public void makeRainbow(Pane root) {
        Rainbow red = new Rainbow(200, 250, 250, 90, 0, 180, Color.RED, root);
        Rainbow orange =  new Rainbow(200, 260, 250, 90, 0, 180, Color.ORANGE, root);
        Rainbow green  = new Rainbow(200, 270, 250, 90, 0, 180, Color.GREEN, root);
        Rainbow blue = new Rainbow(200, 280, 250, 90, 0, 180, Color.BLUE, root);
        Rainbow indigo = new Rainbow(200, 290, 250, 90, 0, 180, Color.INDIGO, root);
        Rainbow violet = new Rainbow(200, 300, 250, 90, 0, 180, Color.VIOLET, root);
    }


}
