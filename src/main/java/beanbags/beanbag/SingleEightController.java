package beanbags.beanbag;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SingleEightController {
    private List<String> players;
    @FXML
    private Button team1;
    @FXML
    private Button team2;
    @FXML
    private Button team3;
    @FXML
    private Button team4;
    @FXML
    private Button round2team1;
    @FXML
    private Button round2team2;
    @FXML
    private Label team1lbl;
    @FXML
    private Label team2lbl;
    @FXML
    private Label team3lbl;
    @FXML
    private Label team4lbl;
    @FXML
    private Label WG1R2lbl;
    @FXML
    private Label WG2R2lbl;
    @FXML
    private Label winner;

    void setPlayers(List<String> players) {
        this.players = players;
    }

    @FXML
    private void onTeam1ButtonClick(ActionEvent actionEvent) {
        String winnerText = team1lbl.getText();
        WG1R2lbl.setText(winnerText);

        // Clear the text
        team1lbl.setText("");
    }

    @FXML
    private void onTeam2ButtonClick(ActionEvent actionEvent) {
        String winnerText = team2lbl.getText();
        WG1R2lbl.setText(winnerText);
    }

    @FXML
    private void onTeam3ButtonClick(ActionEvent actionEvent) {
        String winnerText = team3lbl.getText();
        WG2R2lbl.setText(winnerText);
    }

    @FXML
    private void onTeam4ButtonClick(ActionEvent actionEvent) {
        String winnerText = team4lbl.getText();
        WG2R2lbl.setText(winnerText);
    }

    @FXML
    private void onRound2team1ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG1R2lbl.getText();
        winner.setText(winnerText);
    }

    @FXML
    private void onRound2team2ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG2R2lbl.getText();
        winner.setText(winnerText);
    }

    @FXML
    private void onGenerateTeamsButtonClick(ActionEvent actionEvent) {
        if (players.size() >= 8) {
            List<String> randomPlayers = getRandomPlayers(players, 8);

            String team1 = randomPlayers.get(0) + " & " + randomPlayers.get(1);
            String team2 = randomPlayers.get(2) + " & " + randomPlayers.get(3);
            String team3 = randomPlayers.get(4) + " & " + randomPlayers.get(5);
            String team4 = randomPlayers.get(6) + " & " + randomPlayers.get(7);

            team1lbl.setText(team1);
            team2lbl.setText(team2);
            team3lbl.setText(team3);
            team4lbl.setText(team4);
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
}