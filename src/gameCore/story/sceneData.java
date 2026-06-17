package gameCore.story;

import java.util.List;

public class sceneData {
    private String name;
    private String text;
    private List<choice> choices;

    public sceneData(String name, String text, List<choice> choices) {
        this.name = name;
        this.text = text;
        this.choices = choices;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public List<choice> getChoices() {
        return choices;
    }
}