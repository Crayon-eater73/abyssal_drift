package gameCore.engine;

import gameCore.entities.ace;
import gameCore.story.sceneData;

public class gameEngine {

    private ace player;
    private sceneManager sceneManager;

    public gameEngine() {
        //Creates Ace and it makes a new sceneManager
        this.player = new ace("Ace");
        this.sceneManager = new sceneManager();
    }

    //starts the game from a certian file
    public sceneData startGame() {
        System.out.println("GAME START");
        sceneManager.loadScene("src/gameCore/resources/scene_mae_screams.txt");
        return sceneManager.getCurrentScene();
    }

    //contiunes on from the file before and after
    public sceneData loadScene(String path) {
        sceneManager.loadScene(path);
        return sceneManager.getCurrentScene();
    }
}
