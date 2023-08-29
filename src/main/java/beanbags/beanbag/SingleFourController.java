package beanbags.beanbag;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class SingleFourController implements Initializable {

    @FXML
    private Label Player1Label;

    @FXML
    private Label Player2Label;

    private List<String> players;
    @FXML
    private Label Winner;

    public void setPlayers(List<String> players) {
        this.players = players;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        players = new ArrayList<>();
    }

    @FXML
    private void onGenerateButtonClick(ActionEvent actionEvent) {
        if (players.size() >= 4) {
            List<String> randomPlayers = getRandomPlayers(players, 4);

            String team1 = randomPlayers.get(0) + " & " + randomPlayers.get(1);
            String team2 = randomPlayers.get(2) + " & " + randomPlayers.get(3);

            Player1Label.setText(team1);
            Player2Label.setText(team2);
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
    private void onWinner1ButtonClick(ActionEvent actionEvent) {
        String winnerText = Player1Label.getText();
        Winner.setText(winnerText);

        // Clear the Player1Label text
        Player1Label.setText("");
    }

    @FXML
    private void onWinner2ButtonClick(ActionEvent actionEvent) {
        String winnerText = Player2Label.getText();
        Winner.setText(winnerText);

        // Clear the Player2Label text
        Player2Label.setText("");
    }
}
