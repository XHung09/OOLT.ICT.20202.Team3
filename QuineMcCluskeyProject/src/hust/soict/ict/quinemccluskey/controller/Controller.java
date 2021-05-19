package hust.soict.ict.quinemccluskey.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public abstract class Controller {
	private String threeVarsURL = "/hust/soict/ict/quinemccluskey/view/HomeScreen.fxml";
	private String fourVarsURL = "/hust/soict/ict/quinemccluskey/view/HomeScreen.fxml";
	
	@FXML
	protected Button threeVarsButton, fourVarsButton;
	
	public void switchScene(String URL) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(URL));
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
	}
	
    @FXML
    protected void fourVarsButtonPressed(ActionEvent event) throws IOException {
    	this.switchScene(fourVarsURL);
    }

    @FXML
    protected void threeVarsButtonPressed(ActionEvent event) throws IOException {
    	this.switchScene(threeVarsURL);
    }
}
