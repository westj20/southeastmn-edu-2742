package beanbags.beanbag;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SingleSixController {
    private List<String> players;
    @FXML
    private AnchorPane generateTeams;
    @FXML
    private Button team2game1;
    @FXML
    private Button team1game1;
    @FXML
    private Label team1lbl;
    @FXML
    private Label team2lbl;
    @FXML
    private Label Gamelbl;
    @FXML
    private Button team3game2;
    @FXML
    private Button winnerGame1;
    @FXML
    private Label team3lbl;
    @FXML
    private Label winnergame1;
    @FXML
    private Label Winners;

    @FXML
    private void onGenerateButtonClick(ActionEvent actionEvent) {
        if (players.size() >= 6) {
            List<String> randomPlayers = getRandomPlayers(players, 6);

            String team1 = randomPlayers.get(0) + " & " + randomPlayers.get(1);
            String team2 = randomPlayers.get(2) + " & " + randomPlayers.get(3);
            String team3 = randomPlayers.get(4) + " & " + randomPlayers.get(5);

            team1lbl.setText(team1);
            team2lbl.setText(team2);
            team3lbl.setText(team3);
        }
    }

    private List<String> getRandomPlayers(List<String> players, int count) {
        List<String> randomPlayers = new ArrayList<>();
        Random random = new Random();

        while (randomPlayers.size() < count) {
            int index = random.nextInt(players.size());
            String player = players.get(index);
            if (!randomPlayers.contains(player)) {
                randomPlayers.add(player);
            }
        }
        return randomPlayers;
    }
    public void setPlayers(List<String> players) {
        this.players = players;
    }



    @FXML
    private void onTeam1ButtonClick(ActionEvent actionEvent) {
        String winnerText = team1lbl.getText();
        winnergame1.setText(winnerText);

        // Clear the text
        team1lbl.setText("");
    }

    @FXML
    private void onTeam2ButtonClick(ActionEvent actionEvent) {
        String winnerText = team2lbl.getText();
        winnergame1.setText(winnerText);

        // Clear the Player1Label text
        team2lbl.setText("");
    }

    @FXML
    private void onTeam3ButtonClick(ActionEvent actionEvent) {
        String winnerText = team3lbl.getText();
        Winners.setText(winnerText);

        // Clear the Player1Label text
        team3lbl.setText("");
    }

    @FXML
    private void onWinnerGame2ButtonClick(ActionEvent actionEvent) {
        String winnerText = winnergame1.getText();
        Winners.setText(winnerText);

        // Clear the Player1Label text
        winnergame1.setText("");
    }
}
