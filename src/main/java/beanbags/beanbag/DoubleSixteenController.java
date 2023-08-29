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


public class DoubleSixteenController {






    private List<String> players;
    @FXML
    private Label winner;
    @FXML
    private Label LG18lbl;
    @FXML
    private Label LG11lbl;
    @FXML
    private Label team7lbl;
    @FXML
    private Label team8lbl;
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
    private Label WG9lbl;
    @FXML
    private Label LG14lbl;
    @FXML
    private Label WG10lbl;
    @FXML
    private Label WG11lbl;
    @FXML
    private Label WG12lbl;
    @FXML
    private Label WG14lbl;
    @FXML
    private Label WG13lbl;
    @FXML
    private Label LG6lbl;
    @FXML
    private Button generateTeams;


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

        team1lbl.setText("");
        team2lbl.setText("");
    }

    @FXML
    private void onTeam2ButtonClick(ActionEvent actionEvent) {
        String winnerText = team2lbl.getText();
        WG1lbl.setText(winnerText);

        String loserText = team1lbl.getText();
        LG1lbl.setText(loserText);

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

        team3lbl.setText("");
        team4lbl.setText("");
    }
    @FXML
    private void onTeam4ButtonClick(ActionEvent actionEvent) {
        String winnerText = team4lbl.getText();
        WG2lbl.setText(winnerText);

        String loserText = team3lbl.getText();
        LG2lbl.setText(loserText);

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

        team5lbl.setText("");
        team6lbl.setText("");
    }

    @FXML
    private void onTeam6ButtonClick(ActionEvent actionEvent) {
        String winnerText = team6lbl.getText();
        WG3lbl.setText(winnerText);

        String loserText = team5lbl.getText();
        LG3lbl.setText(loserText);

        team5lbl.setText("");
        team6lbl.setText("");
    }


    //Game 4
    @FXML
    private void onTeam7ButtonClick(ActionEvent actionEvent) {
        String winnerText = team7lbl.getText();
        WG4lbl.setText(winnerText);

        String loserText = team8lbl.getText();
        LG4lbl.setText(loserText);

        team7lbl.setText("");
        team8lbl.setText("");
    }

    @FXML
    private void onTeam8ButtonClick(ActionEvent actionEvent) {
        String winnerText = team8lbl.getText();
        WG4lbl.setText(winnerText);

        String loserText = team7lbl.getText();
        LG4lbl.setText(loserText);

        team7lbl.setText("");
        team8lbl.setText("");
    }
    //Game 5
    @FXML
    private void onWG1ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG1lbl.getText();
        WG5lbl.setText(winnerText);

        String loserText = WG2lbl.getText();
        LG5lbl.setText(loserText);

        WG1lbl.setText("");
        WG2lbl.setText("");
    }
    @FXML
    private void onWG2ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG2lbl.getText();
        WG5lbl.setText(winnerText);

        String loserText = WG1lbl.getText();
        LG5lbl.setText(loserText);

        WG1lbl.setText("");
        WG2lbl.setText("");
    }

    //Game 6
    @FXML
    private void onWG3ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG3lbl.getText();
        WG6lbl.setText(winnerText);

        String loserText = WG4lbl.getText();
        LG6lbl.setText(loserText);

        WG3lbl.setText("");
        WG4lbl.setText("");
    }
    @FXML
    private void onWG4ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG4lbl.getText();
        WG6lbl.setText(winnerText);

        String loserText = WG3lbl.getText();
        LG6lbl.setText(loserText);

        WG3lbl.setText("");
        WG4lbl.setText("");
    }
    //Game 7
    @FXML
    private void onLG1ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG1lbl.getText();
        WG7lbl.setText(winnerText);


        LG1lbl.setText("");

    }
    @FXML
    private void onLG2ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG2lbl.getText();
        WG7lbl.setText(winnerText);


        LG2lbl.setText("");
    }
    //Game 8
    @FXML
    private void onLG3ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG3lbl.getText();
        WG8lbl.setText(winnerText);


        LG3lbl.setText("");
    }


    @FXML
    private void onLG4ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG4lbl.getText();
        WG8lbl.setText(winnerText);


        LG4lbl.setText("");
    }
//Game9
    @FXML
    private void onLG6ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG6lbl.getText();
        WG9lbl.setText(winnerText);


        LG6lbl.setText("");
}
    @FXML
    private void onWG7ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG7lbl.getText();
        WG9lbl.setText(winnerText);


        WG7lbl.setText("");
    }
    //Game 10
    @FXML
    private void onLG5ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG5lbl.getText();
        WG10lbl.setText(winnerText);


        LG5lbl.setText("");
    }
    @FXML
    private void onWG8ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG8lbl.getText();
        WG10lbl.setText(winnerText);


        WG8lbl.setText("");
    }
    //Game11
    @FXML
    private void onWG5ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG5lbl.getText();
        WG11lbl.setText(winnerText);

        String loserText = WG6lbl.getText();
        LG11lbl.setText(loserText);

        WG5lbl.setText("");
        WG6lbl.setText("");
    }


    @FXML
    private void onWG6ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG6lbl.getText();
        WG11lbl.setText(winnerText);

        String loserText = WG5lbl.getText();
        LG11lbl.setText(loserText);

        WG5lbl.setText("");
        WG6lbl.setText("");
    }


//Game 12
    @FXML
    private void onWG9ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG9lbl.getText();
        WG12lbl.setText(winnerText);


        WG9lbl.setText("");

    }
    @FXML
    private void onWG10ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG10lbl.getText();
        WG12lbl.setText(winnerText);


        WG10lbl.setText("");
    }
    //Game13
    @FXML
    private void onLG11ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG11lbl.getText();
        WG13lbl.setText(winnerText);


        LG11lbl.setText("");
    }
    @FXML
    private void onWG12ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG12lbl.getText();
        WG13lbl.setText(winnerText);


        WG12lbl.setText("");
    }

//Game14



    @FXML
    private void onWG11ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG11lbl.getText();
        winner.setText(winnerText);

        WG11lbl.setText("");
    }


    @FXML
    private void onWG13ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG13lbl.getText();
        WG14lbl.setText(winnerText);

        String loserText = WG11lbl.getText();
        LG14lbl.setText(loserText);

        WG13lbl.setText("");
        WG11lbl.setText("");
    }

//Game15
    @FXML
    private void onLG14ButtonClick(ActionEvent actionEvent) {
        String winnerText = LG14lbl.getText();
        winner.setText(winnerText);

        LG14lbl.setText("");
    }



    @FXML
    private void onWG14ButtonClick(ActionEvent actionEvent) {
        String winnerText = WG14lbl.getText();
        winner.setText(winnerText);

        WG14lbl.setText("");
    }






    @FXML
    private void onGenerateButtonClick(ActionEvent actionEvent) {
        if (players.size() >= 16) {
            Task<List<String>> generateTask = new Task<>() {
                @Override
                protected List<String> call() {
                    return getRandomPlayers(players, 16);
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



            team1lbl.setText(team1);
            team2lbl.setText(team2);
            team3lbl.setText(team3);
            team4lbl.setText(team4);
            team5lbl.setText(team5);
            team6lbl.setText(team6);
            team7lbl.setText(team7);
            team8lbl.setText(team8);


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
