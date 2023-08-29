package beanbags.beanbag;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.concurrent.Task;
import javafx.application.Platform;

public class DoubleTwentyTwoController {
    @FXML
    private Button generateTeams;
    @FXML
    private Button team1;
    @FXML
    private Button team2;
    @FXML
    private Button team5;
    @FXML
    private Button team6;
    @FXML
    private Button team3;
    @FXML
    private Button team4;
    @FXML
    private Button team7;
    @FXML
    private Button team8;
    @FXML
    private Button team9;
    @FXML
    private Button team10;
    @FXML
    private Label winner;
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
    private Label team7lbl;
    @FXML
    private Label team8lbl;
    @FXML
    private Label team9lbl;
    @FXML
    private Label team10lbl;
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
    private Label LG6lbl;
    @FXML
    private Label LG13lbl;
    @FXML
    private Label WG9lbl;
    @FXML
    private Label LG11lbl;
    @FXML
    private Label WG10lbl;
    @FXML
    private Label WG11lbl;
    @FXML
    private Label WG12lbl;
    @FXML
    private Label WG15lbl;
    @FXML
    private Label WG14lbl;
    @FXML
    private Label WG13lbl;
    @FXML
    private Label WG16lbl;
    @FXML
    private Label LG17lbl;
    @FXML
    private Label WG17lbl;
    @FXML
    private Label LG18lbl;
    @FXML
    private Button team11;
    @FXML
    private Label Team11lbl;
    @FXML
    private Label LG7lbl;
    @FXML
    private Label WG18lbl;
    @FXML
    private Label WG19lbl;
    @FXML
    private Label LG20lbl;
    @FXML
    private Label WG20lbl;
    private List<String> players;
    @FXML
    private Label LG14lbl;


    public void setPlayers(List<String> players) {
        this.players = players;
    }
    //Game 1
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

    //Game 2
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
    //Game 3
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
    //Game 4
    @FXML
    private void onTeam7ButtonClicked(ActionEvent actionEvent) {
        String winnerText = team7lbl.getText();
        WG4lbl.setText(winnerText);

        String loserText = team8lbl.getText();
        LG4lbl.setText(loserText);

        // Clear the text
        team7lbl.setText("");
        team8lbl.setText("");
    }

    @FXML
    private void onTeam8ButtonClick(ActionEvent actionEvent) {
        String winnerText = team8lbl.getText();
        WG4lbl.setText(winnerText);

        String loserText = team7lbl.getText();
        LG4lbl.setText(loserText);

        // Clear the text
        team7lbl.setText("");
        team8lbl.setText("");
    }
    //Game 5
    @FXML
    private void onWG1ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG1lbl.getText();
        WG5lbl.setText(winnerText);

        String loserText = team9lbl.getText();
        LG5lbl.setText(loserText);

        // Clear the text
        WG1lbl.setText("");
        team9lbl.setText("");
    }

    @FXML
    private void onTeam9ButtonClick(ActionEvent actionEvent) {
        String winnerText = team9lbl.getText();
        WG5lbl.setText(winnerText);

        String loserText = WG1lbl.getText();
        LG5lbl.setText(loserText);

        // Clear the text
        WG1lbl.setText("");
        team9lbl.setText("");
    }
    //Game 6
    @FXML
    private void onWG2ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG2lbl.getText();
        WG6lbl.setText(winnerText);

        String loserText = team10lbl.getText();
        LG6lbl.setText(loserText);

        // Clear the text
        WG2lbl.setText("");
        team10lbl.setText("");
    }
    @FXML
    private void onTeam10ButtonClick(ActionEvent actionEvent) {
        String winnerText = team10lbl.getText();
        WG6lbl.setText(winnerText);

        String loserText = WG2lbl.getText();
        LG6lbl.setText(loserText);

        // Clear the text
        WG2lbl.setText("");
        team10lbl.setText("");
    }
    //Game 7
    @FXML
    private void onTeam11ButtonClick(ActionEvent actionEvent) {
        String winnerText = Team11lbl.getText();
        WG7lbl.setText(winnerText);

        String loserText = WG3lbl.getText();
        LG7lbl.setText(loserText);

        // Clear the text
        WG3lbl.setText("");
        Team11lbl.setText("");
    }
    @FXML
    private void onWG3ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG3lbl.getText();
        WG7lbl.setText(winnerText);

        String loserText = Team11lbl.getText();
        LG7lbl.setText(loserText);

        // Clear the text
        WG3lbl.setText("");
        Team11lbl.setText("");
    }
    //Game 8
    @FXML
    private void onLG2ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG2lbl.getText();
        WG8lbl.setText(winnerText);

        // Clear the text
        LG2lbl.setText("");

    }

    @FXML
    private void onLG4ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG4lbl.getText();
        WG8lbl.setText(winnerText);

        // Clear the text
        LG4lbl.setText("");
    }

    //Game 9
    @FXML
    private void onLG3ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG3lbl.getText();
        WG9lbl.setText(winnerText);

        // Clear the text
        LG3lbl.setText("");
    }

    @FXML
    private void onLG5ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG5lbl.getText();
        WG9lbl.setText(winnerText);

        // Clear the text
        LG5lbl.setText("");
    }

    //Game 10
    @FXML
    private void onLG7ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG7lbl.getText();
        WG10lbl.setText(winnerText);

        // Clear the text
        LG7lbl.setText("");
    }

    @FXML
    private void onLG1ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG1lbl.getText();
        WG10lbl.setText(winnerText);

        // Clear the text
        LG1lbl.setText("");
    }

    //Game 11
    @FXML
    private void onWG8ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG8lbl.getText();
        WG11lbl.setText(winnerText);

        // Clear the text
        WG8lbl.setText("");
    }

    @FXML
    private void onWG9ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG9lbl.getText();
        WG11lbl.setText(winnerText);

        // Clear the text
        WG9lbl.setText("");
    }

    //Game 12
    @FXML
    private void onLG6ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG6lbl.getText();
        WG12lbl.setText(winnerText);

        // Clear the text
        LG6lbl.setText("");
    }

    @FXML
    private void onWG10ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG10lbl.getText();
        WG12lbl.setText(winnerText);

        // Clear the text
        WG10lbl.setText("");
    }

    //Game 13
    @FXML
    private void onWG4ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG4lbl.getText();
        WG13lbl.setText(winnerText);

        String loserText = WG5lbl.getText();
        LG13lbl.setText(loserText);

        // Clear the text
        WG5lbl.setText("");
        WG4lbl.setText("");
    }

    @FXML
    private void onWG5ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG5lbl.getText();
        WG13lbl.setText(winnerText);

        String loserText = WG4lbl.getText();
        LG13lbl.setText(loserText);

        // Clear the text
        WG5lbl.setText("");
        WG4lbl.setText("");
    }
    //Game 14
    @FXML
    private void onWG6ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG6lbl.getText();
        WG14lbl.setText(winnerText);

        String loserText = WG7lbl.getText();
        LG14lbl.setText(loserText);

        // Clear the text
        WG6lbl.setText("");
        WG7lbl.setText("");
    }

    @FXML
    private void onWG7ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG7lbl.getText();
        WG14lbl.setText(winnerText);

        String loserText = WG6lbl.getText();
        LG14lbl.setText(loserText);

        // Clear the text
        WG6lbl.setText("");
        WG7lbl.setText("");
    }
    //Game 15
    @FXML
    private void onWG12ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG12lbl.getText();
        WG15lbl.setText(winnerText);

        // Clear the text
        WG12lbl.setText("");
    }
    @FXML
    private void onLG13ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG13lbl.getText();
        WG15lbl.setText(winnerText);

        // Clear the text
        LG13lbl.setText("");
    }
    //Game 16
    @FXML
    private void onLG14ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG14lbl.getText();
        WG16lbl.setText(winnerText);

        // Clear the text
        LG14lbl.setText("");
    }

    @FXML
    private void onWG11ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG11lbl.getText();
        WG16lbl.setText(winnerText);

        // Clear the text
        WG11lbl.setText("");
    }
    //Game 17
    @FXML
    private void onWG13ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG13lbl.getText();
        WG17lbl.setText(winnerText);

        String loserText = WG14lbl.getText();
        LG17lbl.setText(loserText);

        // Clear the text
        WG13lbl.setText("");
        WG14lbl.setText("");
    }

    @FXML
    private void onWG14ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG14lbl.getText();
        WG17lbl.setText(winnerText);

        String loserText = WG13lbl.getText();
        LG17lbl.setText(loserText);

        // Clear the text
        WG13lbl.setText("");
        WG14lbl.setText("");
    }
    //Game 18
    @FXML
    private void onWG15ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG15lbl.getText();
        WG18lbl.setText(winnerText);

        // Clear the text
        WG15lbl.setText("");

    }

    @FXML
    private void onWG16ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG16lbl.getText();
        WG18lbl.setText(winnerText);

        // Clear the text
        WG16lbl.setText("");
    }
    //Game 19
    @FXML
    private void onLG17ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG17lbl.getText();
        WG19lbl.setText(winnerText);

        // Clear the text
       LG17lbl.setText("");
    }

    @FXML
    private void onWG18ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG18lbl.getText();
        WG19lbl.setText(winnerText);

        // Clear the text
        WG18lbl.setText("");
    }
    //Game 20
    @FXML
    private void onWG17ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG17lbl.getText();
        winner.setText(winnerText);

        // Clear the text
        WG17lbl.setText("");
    }

    @FXML
    private void onWG19ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG19lbl.getText();
        WG20lbl.setText(winnerText);

        String loserText = WG17lbl.getText();
        LG20lbl.setText(loserText);

        // Clear the text
        WG19lbl.setText("");
        WG17lbl.setText("");
    }
// Game 21 if needed
    @FXML
    private void onLG20ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG20lbl.getText();
        winner.setText(winnerText);

        // Clear the text
        LG20lbl.setText("");

    }

    @FXML
    private void onWG20ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG20lbl.getText();
        winner.setText(winnerText);


        // Clear the text
        WG20lbl.setText("");

    }



    @FXML
    private void onGenerateButtonClick(ActionEvent actionEvent) {
        if (players.size() >= 22) {
            Task<List<String>> generateTask = new Task<>() {
                @Override
                protected List<String> call() {
                    return getRandomPlayers(players, 22);
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
            String team10 = randomPlayers.get(18) + " & " + randomPlayers.get(19);
            String team11 = randomPlayers.get(20) + " & " + randomPlayers.get(21);

            team1lbl.setText(team1);
            team2lbl.setText(team2);
            team3lbl.setText(team3);
            team4lbl.setText(team4);
            team5lbl.setText(team5);
            team6lbl.setText(team6);
            team7lbl.setText(team7);
            team8lbl.setText(team8);
            team9lbl.setText(team9);
            team10lbl.setText(team10);
            Team11lbl.setText(team11);
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
}
