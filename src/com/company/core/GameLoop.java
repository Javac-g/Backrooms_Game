package com.company.core;

import com.yourname.backrooms.render.GameCanvas;
import javafx.animation.AnimationTimer;

public class GameLoop extends AnimationTimer {

    private final GameCanvas gameCanvas;

    public GameLoop(GameCanvas gameCanvas) {
        this.gameCanvas = gameCanvas;
    }

    @Override
    public void handle(long now) {
        update();
        render();
    }

    private void update() {
        // Game state updates will go here later.
    }

    private void render() {
        gameCanvas.clear();
    }
}
