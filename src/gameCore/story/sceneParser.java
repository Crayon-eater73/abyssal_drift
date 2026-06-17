package gameCore.story;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class sceneParser {

    public static sceneData parse(String fileName) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Error loading scene: " + fileName);
        }

        String sceneName = "";
        StringBuilder text = new StringBuilder();
        List<choice> choices = new ArrayList<>();
        boolean readingText = false;

        for (String line : lines) {
            if (line.startsWith("[SCENE]:")) {
                sceneName = line.substring(8).trim();
            } else if (line.startsWith("[TEXT_START]")) {
                readingText = true;
            } else if (line.startsWith("[TEXT_END]")) {
                readingText = false;
            } else if (readingText) {
                text.append(line).append("\n");
            } else if (line.startsWith("[CHOICE]:")) {
                String[] parts = line.substring(9).split("->");
                choices.add(new choice(parts[0].trim(), parts[1].trim()));
            }
        }

        return new sceneData(sceneName, text.toString(), choices);
    }
}
