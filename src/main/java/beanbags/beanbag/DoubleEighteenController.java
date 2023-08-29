package beanbags.beanbag;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.Stack;
public class DoubleEighteenController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Label team1lbl;
    @FXML
    private Label team2lbl;
    @FXML
    private Label team3lbl;
    @FXML
    private Label team4lbl;
    @FXML
    private Label team5lbl;
    @FXML
    private Label WG1lbl;
    @FXML
    private Label team6lbl;
    @FXML
    private Label team9lbl;
    @FXML
    private Label WG2lbl;
    @FXML
    private Label LG1lbl;
    @FXML
    private Label LG2lbl;
    @FXML
    private Label LG3lbl;
    @FXML
    private Label LG4lbl;
    @FXML
    private Label WG5lbl;
    @FXML
    private Label WG3lbl;
    @FXML
    private Label WG6lbl;
    @FXML
    private Label WG4lbl;
    @FXML
    private Label LG5lbl;
    @FXML
    private Label WG7lbl;
    @FXML
    private Label WG8lbl;
    @FXML
    private Label LG9lbl;
    @FXML
    private Label LG13lbl;
    @FXML
    private Label WG9lbl;
    @FXML
    private Label WG10lbl;
    @FXML
    private Label WG11lbl;
    @FXML
    private Label WG12lbl;
    @FXML
    private Button generateTeams;
    @FXML
    private Label WG14lbl;
    @FXML
    private Label WG13lbl;
    @FXML
    private Label WG16lbl;
    @FXML
    private Label LG16lbl;
    @FXML
    private Label LG18lbl;
    @FXML
    private Label LG10lbl;
    @FXML
    private Label WG15lbl;
    @FXML
    private Label team7lbl;
    @FXML
    private Label team8lbl;
    private List<String> players;
    @FXML
    private Label winner;
    @FXML
    private Button undo;


    public void setPlayers(List<String> players) {
        this.players = players;
    }

    //Game1
    @FXML
    private void onTeam1ButtonClick(ActionEvent actionEvent) {
        String winnerText = team1lbl.getText();
        WG1lbl.setText(winnerText);

        String loserText = team2lbl.getText();
        LG1lbl.setText(loserText);

        // Clear the text
        team1lbl.setText("");
        team2lbl.setText("");
    }

    @FXML
    private void onTeam2ButtonClick(ActionEvent actionEvent) {
        String winnerText = team2lbl.getText();
        WG1lbl.setText(winnerText);

        String loserText = team1lbl.getText();
        LG1lbl.setText(loserText);

        // Clear the text
        team1lbl.setText("");
        team2lbl.setText("");
    }
    //Game2
    @FXML
    private void onTeam3ButtonClick(ActionEvent actionEvent) {
        String winnerText = team3lbl.getText();
        WG2lbl.setText(winnerText);

        String loserText = team4lbl.getText();
        LG2lbl.setText(loserText);

        // Clear the text
        team3lbl.setText("");
        team4lbl.setText("");
    }

    @FXML
    private void onTeam4ButtonClick(ActionEvent actionEvent) {
        String winnerText = team4lbl.getText();
        WG2lbl.setText(winnerText);

        String loserText = team3lbl.getText();
        LG2lbl.setText(loserText);

        // Clear the text
        team3lbl.setText("");
        team4lbl.setText("");
    }
    //Game3
    @FXML
    private void onTeam5ButtonClick(ActionEvent actionEvent) {
        String winnerText = team5lbl.getText();
        WG3lbl.setText(winnerText);

        String loserText = team6lbl.getText();
        LG3lbl.setText(loserText);

        // Clear the text
        team5lbl.setText("");
        team6lbl.setText("");
    }

    @FXML
    private void onTeam6ButtonClick(ActionEvent actionEvent) {
        String winnerText = team6lbl.getText();
        WG3lbl.setText(winnerText);

        String loserText = team5lbl.getText();
        LG3lbl.setText(loserText);

        // Clear the text
        team5lbl.setText("");
        team6lbl.setText("");
    }
    //Game4
    @FXML
    private void onTeam9ButtonClick(ActionEvent actionEvent) {
        String winnerText = team9lbl.getText();
        WG4lbl.setText(winnerText);

        String loserText = team8lbl.getText();
        LG4lbl.setText(loserText);

        // Clear the text
        team9lbl.setText("");
        team8lbl.setText("");
    }

    @FXML
    private void onTeam8ButtonClick(ActionEvent actionEvent) {
        String winnerText = team8lbl.getText();
        WG4lbl.setText(winnerText);

        String loserText = team9lbl.getText();
        LG4lbl.setText(loserText);

        // Clear the text
        team9lbl.setText("");
        team8lbl.setText("");
    }
    //Game5
    @FXML
    private void onTeam7ButtonClick(ActionEvent actionEvent) {
        String winnerText = team7lbl.getText();
        WG5lbl.setText(winnerText);

        String loserText = WG1lbl.getText();
        LG5lbl.setText(loserText);

        // Clear the text
        team7lbl.setText("");
        WG1lbl.setText("");
    }

    @FXML
    private void onWG1ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG1lbl.getText();
        WG5lbl.setText(winnerText);

        String loserText = team7lbl.getText();
        LG5lbl.setText(loserText);

        // Clear the text
        team7lbl.setText("");
        WG1lbl.setText("");
    }
    //Game6
    @FXML
    private void onLG1ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG1lbl.getText();
        WG6lbl.setText(winnerText);

        // Clear the text
        LG1lbl.setText("");

    }

    @FXML
    private void onLG2ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG2lbl.getText();
        WG6lbl.setText(winnerText);

        // Clear the text
        LG2lbl.setText("");
    }
    //Game7
    @FXML
    private void onLG4ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG4lbl.getText();
        WG7lbl.setText(winnerText);

        // Clear the text
        LG4lbl.setText("");
    }

    @FXML
    private void onLG5ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG5lbl.getText();
        WG7lbl.setText(winnerText);

        // Clear the text
        LG5lbl.setText("");
    }
    //Game8
    @FXML
    private void onLG3ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG3lbl.getText();
        WG8lbl.setText(winnerText);

        // Clear the text
        WG6lbl.setText("");
    }

    @FXML
    private void onWG6ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG6lbl.getText();
        WG7lbl.setText(winnerText);

        // Clear the text
        LG4lbl.setText("");
    }
    //Game9
    @FXML
    private void onWG2ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG2lbl.getText();
        WG9lbl.setText(winnerText);

        String loserText = WG3lbl.getText();
        LG9lbl.setText(loserText);

        // Clear the text
        WG2lbl.setText("");
        WG3lbl.setText("");
    }

    @FXML
    private void onWG3ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG3lbl.getText();
        WG9lbl.setText(winnerText);

        String loserText = WG2lbl.getText();
        LG9lbl.setText(loserText);

        // Clear the text
        WG2lbl.setText("");
        WG3lbl.setText("");
    }
    //Game10
    @FXML
    private void onWG5ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG5lbl.getText();
        WG10lbl.setText(winnerText);

        String loserText = WG4lbl.getText();
        LG10lbl.setText(loserText);

        // Clear the text
        WG5lbl.setText("");
        WG4lbl.setText("");
    }

    @FXML
    private void onWG4ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG4lbl.getText();
        WG10lbl.setText(winnerText);

        String loserText = WG5lbl.getText();
        LG10lbl.setText(loserText);

        // Clear the text
        WG5lbl.setText("");
        WG4lbl.setText("");
    }
    //Game11
    @FXML
    private void onWG7ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG7lbl.getText();
        WG11lbl.setText(winnerText);

        // Clear the text
        WG7lbl.setText("");

    }

    @FXML
    private void onLG9ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG9lbl.getText();
        WG11lbl.setText(winnerText);

        // Clear the text
        LG9lbl.setText("");
    }
    //Game12
    @FXML
    private void onWG8ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG8lbl.getText();
        WG12lbl.setText(winnerText);

        // Clear the text
        WG8lbl.setText("");
    }

    @FXML
    private void onLG10ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG10lbl.getText();
        WG12lbl.setText(winnerText);

        // Clear the text
        LG10lbl.setText("");
    }
    //Game13
    @FXML
    private void onWG9ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG9lbl.getText();
        WG13lbl.setText(winnerText);

        String loserText = WG10lbl.getText();
        LG13lbl.setText(loserText);

        // Clear the text
        WG9lbl.setText("");
        WG10lbl.setText("");
    }

    @FXML
    private void onWG10ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG10lbl.getText();
        WG13lbl.setText(winnerText);

        String loserText = WG9lbl.getText();
        LG13lbl.setText(loserText);

        // Clear the text
        WG9lbl.setText("");
        WG10lbl.setText("");
    }
    //Game14
    @FXML
    private void onWG11ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG11lbl.getText();
        WG14lbl.setText(winnerText);


        // Clear the text
        WG11lbl.setText("");

    }

    @FXML
    private void onWG12ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG12lbl.getText();
        WG14lbl.setText(winnerText);


        // Clear the text
        WG12lbl.setText("");
    }
    //Game15
    @FXML
    private void onLG13ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG13lbl.getText();
        WG15lbl.setText(winnerText);


        // Clear the text
        LG13lbl.setText("");
    }

    @FXML
    private void onWG14ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG14lbl.getText();
        WG15lbl.setText(winnerText);


        // Clear the text
        WG14lbl.setText("");
    }
    //Game16
    @FXML
    private void onWG15ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG15lbl.getText();
        WG16lbl.setText(winnerText);

        String loserText = WG13lbl.getText();
        LG16lbl.setText(loserText);


        // Clear the text
        WG15lbl.setText("");
    }

    @FXML
    private void onWG13ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG13lbl.getText();
        winner.setText(winnerText);


        // Clear the text
        WG13lbl.setText("");
    }
    //Game17
    @FXML
    private void onWG16ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG16lbl.getText();
        winner.setText(winnerText);


        // Clear the text
        WG16lbl.setText("");
    }

    @FXML
    private void onLG16ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG13lbl.getText();
        winner.setText(winnerText);


        // Clear the text
        LG16lbl.setText("");
    }


    @FXML
    private void onGenerateButtonClick(ActionEvent actionEvent) {
        if (players.size() >= 18) {
            Task<List<String>> generateTask = new Task<>() {
                @Override
                protected List<String> call() {
                    return getRandomPlayers(players, 18);
                }
            };
            generateTask.setOnSucceeded(event -> {
                List<String> randomPlayers = generateTask.getValue();
                updateUIWithRandomPlayers(randomPlayers);
            });

            Thread generateThread = new Thread(generateTask);
            generateThread.start();
        }
    }
    private void updateUIWithRandomPlayers(List<String> randomPlayers) {
        Platform.runLater(() -> {
            String team1 = randomPlayers.get(0) + " & " + randomPlayers.get(1);
            String team2 = randomPlayers.get(2) + " & " + randomPlayers.get(3);
            String team3 = randomPlayers.get(4) + " & " + randomPlayers.get(5);
            String team4 = randomPlayers.get(6) + " & " + randomPlayers.get(7);
            String team5 = randomPlayers.get(8) + " & " + randomPlayers.get(9);
            String team6 = randomPlayers.get(10) + " & " + randomPlayers.get(11);
            String team7 = randomPlayers.get(12) + " & " + randomPlayers.get(13);
            String team8 = randomPlayers.get(14) + " & " + randomPlayers.get(15);
            String team9 = randomPlayers.get(16) + " & " + randomPlayers.get(17);


            team1lbl.setText(team1);
            team2lbl.setText(team2);
            team3lbl.setText(team3);
            team4lbl.setText(team4);
            team5lbl.setText(team5);
            team6lbl.setText(team6);
            team7lbl.setText(team7);
            team8lbl.setText(team8);
            team9lbl.setText(team9);

        });
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
    private void onUndoButtonClick(ActionEvent actionEvent) {
    }
}
