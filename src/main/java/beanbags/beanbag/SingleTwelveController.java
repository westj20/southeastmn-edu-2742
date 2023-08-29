package beanbags.beanbag;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SingleTwelveController {


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
    private Label team1lbl;
    @FXML
    private Label team2lbl;
    @FXML
    private Label team3lbl;
    @FXML
    private Label team4lbl;
    @FXML
    private Label R2WG1lbl;
    @FXML
    private Label winner;
    @FXML
    private Button generateTeam;
    @FXML
    private Button team5;
    @FXML
    private Label team5lbl;
    @FXML
    private Label R3WG3lbl;
    @FXML
    private Label R3WG4lbl;
    @FXML
    private Button team6;
    @FXML
    private Label team6lbl;
    @FXML
    private Label R2WG2lbl;

    void setPlayers(List<String> players) {
        this.players = players;
    }
    @FXML
    private void onTeam1ButtonClick(ActionEvent actionEvent) {
        String winnerText = team1lbl.getText();
        R2WG1lbl.setText(winnerText);

        // Clear the text
        team1lbl.setText("");
    }

    @FXML
    private void onTeam2ButtonClick(ActionEvent actionEvent) {
        String winnerText = team2lbl.getText();
        R2WG1lbl.setText(winnerText);

        // Clear the text
        team2lbl.setText("");
    }

    @FXML
    private void onTeam3ButtonClick(ActionEvent actionEvent) {
        String winnerText = team3lbl.getText();
        R2WG2lbl.setText(winnerText);

        // Clear the text
        team3lbl.setText("");
    }

    @FXML
    private void onTeam4ButtonClick(ActionEvent actionEvent) {
        String winnerText = team4lbl.getText();
        R2WG2lbl.setText(winnerText);

        team4lbl.setText("");
    }

    @FXML
    private void onR2WG1ButtonClick(ActionEvent actionEvent) {
        String winnerText = R2WG1lbl.getText();
        R3WG3lbl.setText(winnerText);

        R2WG1lbl.setText("");
    }

    @FXML
    private void onGenerateTeamsButtonClick(ActionEvent actionEvent) {
        if (players.size() >= 12) {
            List<String> randomPlayers = getRandomPlayers(players, 12);

            String team1 = randomPlayers.get(0) + " & " + randomPlayers.get(1);
            String team2 = randomPlayers.get(2) + " & " + randomPlayers.get(3);
            String team3 = randomPlayers.get(4) + " & " + randomPlayers.get(5);
            String team4 = randomPlayers.get(6) + " & " + randomPlayers.get(7);
            String team5 = randomPlayers.get(8) + " & " + randomPlayers.get(9);
            String team6 = randomPlayers.get(10) + " & " + randomPlayers.get(11);

            team1lbl.setText(team1);
            team2lbl.setText(team2);
            team3lbl.setText(team3);
            team4lbl.setText(team4);
            team5lbl.setText(team5);
            team6lbl.setText(team6);
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
    @FXML
    private void onTeam5ButtonClick(ActionEvent actionEvent) {
        String winnerText = team5lbl.getText();
        R3WG3lbl.setText(winnerText);

        // Clear the text
        team5lbl.setText("");
    }

    @FXML
    private void onR3WG3ButtonClick(ActionEvent actionEvent) {
        String winnerText = R3WG3lbl.getText();
        winner.setText(winnerText);

        R3WG3lbl.setText("");
    }

    @FXML
    private void onR3WG4ButtonClick(ActionEvent actionEvent) {
        String winnerText = R3WG4lbl.getText();
        winner.setText(winnerText);

        R3WG4lbl.setText("");
    }

    @FXML
    private void onR2WG2ButtonClick(ActionEvent actionEvent) {
        String winnerText = R2WG2lbl.getText();
        R3WG4lbl.setText(winnerText);

        R2WG2lbl.setText("");
    }

    @FXML
    private void onTeam6ButtonClick(ActionEvent actionEvent) {
        String winnerText = team6lbl.getText();
        R3WG4lbl.setText(winnerText);

        // Clear the text
        team6lbl.setText("");
    }
}
