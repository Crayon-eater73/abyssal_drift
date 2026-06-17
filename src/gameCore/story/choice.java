package gameCore.story;

public class choice {
    private String text;
    private String nextScenePath;

    public choice(String text, String nextScenePath) {
        this.text = text;
        this.nextScenePath = nextScenePath;
    }

    public String getText() {
        return text;
    }

    public String getNextScenePath() {
        return nextScenePath;
    }
}
/*private String text
private String nextSceneId

execute() that extends consequenses to Ace*/