package com.company.core;

import com.yourname.backrooms.render.GameCanvas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        GameCanvas gameCanvas = new GameCanvas(WINDOW_WIDTH, WINDOW_HEIGHT);

        StackPane root = new StackPane(gameCanvas);
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

        stage.setTitle("Backrooms");
        stage.setScene(scene);
        stage.setMinWidth(800);
        stage.setMinHeight(600);
        stage.show();

        GameLoop gameLoop = new GameLoop(gameCanvas);
        gameLoop.start();
    }
}
