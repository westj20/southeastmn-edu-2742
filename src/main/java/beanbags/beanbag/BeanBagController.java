package beanbags.beanbag;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
public class BeanBagController {

    @FXML
    private TextField playerName;



    private List<String> players = new ArrayList<>();
    @FXML
    private Button deleteLast;
    @FXML
    private Button clearAll;
    @FXML
    private ListView<String> playerListView;
    @FXML
    private Label label;

    @FXML
    private void savePlayer() {
        String name = playerName.getText();
        players.add(name);
        playerName.clear();
        updatePlayerListView();
    }
    private void updatePlayerListView() {
        playerListView.getItems().clear();
        playerListView.getItems().addAll(players);

        int numPlayers = players.size();
        String labelText = "#Players: " + numPlayers;
        label.setText(labelText);
    }
    @FXML
    private void onDeleteButtonClick(ActionEvent actionEvent) {
        if (!players.isEmpty()) {
            players.remove(players.size() - 1);
            updatePlayerListView();
            showAlert("Player Deleted", "The last player has been deleted.");
        } else {
            showAlert("No Players", "There are no players to delete.");
        }
    }

    @FXML
    private void onClearButtonClick(ActionEvent actionEvent) {
        if (!players.isEmpty()) {
            players.clear();
            updatePlayerListView();
            showAlert("Players Cleared", "All players have been cleared.");
        } else {
            showAlert("No Players", "There are no players to clear.");
        }
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void OnSingleButtonClick(ActionEvent actionEvent) {
        int playerCount = players.size();

        if (playerCount == 4) {
            openFXMLForm("SingleFour.fxml");
        }
        else if (playerCount == 6){
            openFXMLForm("SingleSix.fxml");
        }
        else if (playerCount == 8){
            openFXMLForm("SingleEight.fxml");
        }
        else if (playerCount == 10){
            openFXMLForm("SingleTen.fxml");
        }
        else if (playerCount == 12){
            openFXMLForm("SingleTwelve.fxml");
        }
        else {
            // Handle other player counts or provide an error message
            showAlert("Invalid Player Count", "The number of players must be exactly four to proceed to SingleFour.fxml.");
        }
    }
    private void openFXMLForm(String fxmlFile) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = fxmlLoader.load();

            // Get the controller instance based on the fxml file
            switch (fxmlFile) {
                case "SingleFour.fxml" -> {
                    SingleFourController controller = fxmlLoader.getController();
                    // Pass the players list to the SingleFourController
                    controller.setPlayers(players);
                }
                case "SingleSix.fxml" -> {
                    SingleSixController controller = fxmlLoader.getController();
                    // Pass the players list to the SingleSixController
                    controller.setPlayers(players);
                }
                case "SingleEight.fxml" -> {
                    SingleEightController controller = fxmlLoader.getController();
                    // Pass the players list to the SingleEightController
                    controller.setPlayers(players);
                }
                case "SingleTen.fxml" -> {
                    SingleTenController controller = fxmlLoader.getController();
                    // Pass the players list to the SingleTenController
                    controller.setPlayers(players);
                }
                case "SingleTwelve.fxml" -> {
                    SingleTwelveController controller = fxmlLoader.getController();
                    // Pass the players list to the  SingleTwelveController
                    controller.setPlayers(players);
                }
                case "DoubleTwenty.fxml" -> {
                    DoubleTwentyController controller = fxmlLoader.getController();
                    // Pass the players list to the DoubleTwentyController
                    controller.setPlayers(players);
                }
                case "DoubleTwentyTwo.fxml" -> {
                    DoubleTwentyTwoController controller = fxmlLoader.getController();
                    // Pass the players list to the DoubleTwentyTwoController
                    controller.setPlayers(players);
                }
                case "DoubleEighteen.fxml" -> {
                    DoubleEighteenController controller = fxmlLoader.getController();
                    // Pass the players list to the DoubleEighteenController
                    controller.setPlayers(players);
                }
                case "DoubleSixteen.fxml" -> {
                    DoubleSixteenController controller = fxmlLoader.getController();
                    // Pass the players list to the DoubleEighteenController
                    controller.setPlayers(players);
                }
            }

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void onPlayerNameKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            savePlayer();
        }
    }

    @FXML
    private void OnDoubleButtonClick(ActionEvent actionEvent) {
        int playerCount = players.size();

        if (playerCount == 20) {
            openFXMLForm("DoubleTwenty.fxml");
        }
        else if (playerCount == 22) {
            openFXMLForm("DoubleTwentyTwo.fxml");
        }
        else if (playerCount == 18) {
            openFXMLForm("DoubleEighteen.fxml");
        }
        else if (playerCount == 16) {
            openFXMLForm("DoubleSixteen.fxml");
        }
        else {
            // Handle other player counts or provide an error message
            showAlert("Invalid Player Count", "The number of players must be exactly four to proceed to DoubleTwenty.fxml.");
        }
    }
}