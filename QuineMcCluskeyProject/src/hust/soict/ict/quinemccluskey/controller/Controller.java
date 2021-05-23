package hust.soict.ict.quinemccluskey.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public abstract class Controller {
	private String threeVarsURL = "/hust/soict/ict/quinemccluskey/view/ThreeVariables.fxml";
	private String fourVarsURL = "/hust/soict/ict/quinemccluskey/view/FourVariables.fxml";
	
	@FXML
	protected Button threeVarsButton, fourVarsButton;
	
	public void switchScene(String URL, ActionEvent event) throws IOException {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(URL));
		stage.setScene(new Scene(root));
		stage.show();
	}
	
    @FXML
    protected void fourVarsButtonPressed(ActionEvent event) throws IOException {
    	this.switchScene(fourVarsURL, event);
    }

    @FXML
    protected void threeVarsButtonPressed(ActionEvent event) throws IOException {
    	this.switchScene(threeVarsURL, event);
    }
}
