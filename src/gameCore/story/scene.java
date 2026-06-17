package gameCore.story;

import java.util.ArrayList;
import java.util.List;

public class scene {
    private String id;
    private String description;
    private List<choice> choices;

    public scene(String id, String description) {
        this.id = id;
        this.description = description;
        this.choices = new ArrayList<>();
    }

    public void addChoice(choice choice) {
        choices.add(choice);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<choice> getChoices() {
        return choices;
    }
}

/*private String id
private String description
private List<Choice> choices

public void addChoice(Choice choice)*/