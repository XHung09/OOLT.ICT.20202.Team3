package hust.soict.ict.quinemccluskey;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("view/HomeScreen.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
