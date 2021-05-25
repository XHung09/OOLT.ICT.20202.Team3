package hust.soict.ict.quinemccluskey.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hust.soict.ict.quinemccluskey.model.minterm.Implicant;
import hust.soict.ict.quinemccluskey.model.minterm.Minterm;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class InputController extends Controller {
	protected String homeURL = "/hust/soict/ict/quinemccluskey/view/HomeScreen.fxml";
	protected RadioButton radioButton[];
	protected Label valueLabel[];
	
	@FXML
	protected Button backButton;
	
    @FXML
    protected Button resetButton;
    
    @FXML
    protected Button submitButton;
    
    @FXML
    private ToggleGroup outputExpressionToggle;
    
    @FXML
    protected RadioButton SOPButton;
    
    @FXML
    protected RadioButton POSButton;
    
    @FXML
    void backButtonPressed(ActionEvent event) throws IOException {
    	switchScene(homeURL, event);
    }
    
    /*
     * 
     */
    @FXML
    void submitButtonPressed(ActionEvent event) {
    	List<Implicant> minterms = new ArrayList<Implicant>();
    	
    	if (SOPButton.isSelected()) {
    		for (int i = 0; i < radioButton.length; i++) {
    			if (radioButton[i].isSelected()) {
    				minterms.add(new Minterm(String.valueOf(i)));
    			}
    		}
    	} else {
    		for (int i = 0; i < radioButton.length; i++) {
    			if (radioButton[i].isSelected() == false) {
    				minterms.add(new Minterm(String.valueOf(i)));
    			}
    		}
    	}
    	
    	for (Implicant m : minterms) {
    		System.out.println(m.getImplicant() + " " + m.getBinaryExpression());
    	}
    }
    
    @FXML
    void resetPressed(ActionEvent event) {
    	for (RadioButton b : radioButton) {
    		b.setSelected(false);
    	}
    	
    	for (Label lb : valueLabel) {
    		lb.setText("0");
    	}
    }
}
