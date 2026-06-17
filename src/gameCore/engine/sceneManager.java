package gameCore.engine;

import gameCore.story.sceneData;
import gameCore.story.sceneParser;

public class sceneManager {

    private sceneData currentScene;

    //loads the scene based off the scene's file name
    public void loadScene(String fileName) {
        currentScene = sceneParser.parse(fileName);
    }

    public sceneData getCurrentScene() {
        return currentScene;
    }
}