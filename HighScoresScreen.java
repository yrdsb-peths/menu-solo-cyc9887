import greenfoot.*;
import java.util.HashMap;
import java.util.Map;

public class HighScoresScreen extends World {
    private Map<String, Integer> scoresMap = new HashMap<>();
    private String[] playerNames;
    private SimpleTimer timer = new SimpleTimer();
    private int currentIndex = 0;

    public HighScoresScreen() {    
        super(600, 400, 1); 
        prepare();
    }

    private void prepare() {
        Label titleLabel = new Label("High Scores", 50);
        addObject(titleLabel, 300, 50);

        scoresMap.put("Curious George", 40);
        scoresMap.put("Pacman", 76);
        scoresMap.put("John Wick", 88);

        playerNames = new String[scoresMap.size()];
        int index = 0;
        for (String name : scoresMap.keySet()) {
            playerNames[index++] = name;
        }

        timer.mark();
        updateScoreDisplay();
    }

    public void act() {
        if (timer.millisElapsed() > 2000) {
            currentIndex = (currentIndex + 1) % playerNames.length;
            updateScoreDisplay();
            timer.mark();
        }
    }

    private void updateScoreDisplay() {
        if (getObjects(Label.class).size() > 1) {
            removeObject(getObjects(Label.class).get(1));
        }

        String currentPlayer = playerNames[currentIndex];
        Integer currentScore = scoresMap.get(currentPlayer);
        
        Label scoreLabel = new Label(currentPlayer + ": " + currentScore, 40);
        addObject(scoreLabel, 300, 200);
    }
}