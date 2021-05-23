package hust.soict.ict.quinemccluskey.controller.inputcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hust.soict.ict.quinemccluskey.controller.Controller;
import hust.soict.ict.quinemccluskey.model.Variable;
import hust.soict.ict.quinemccluskey.model.minterm.Implicant;
import hust.soict.ict.quinemccluskey.model.minterm.Minterm;
import hust.soict.ict.quinemccluskey.model.output.SOP;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class ThreeVariablesController extends Controller {
	private String homeURL = "/hust/soict/ict/quinemccluskey/view/HomeScreen.fxml";
			
    @FXML
    private GridPane truthTable;
    
    @FXML
    private Button resetButton;
    
    @FXML
    private ToggleGroup outputExpressionToggle;

    @FXML
    private RadioButton SOPButton;
    
    @FXML
    private RadioButton POSButton;

    @FXML
    private Label valueAt0;

    @FXML
    private Label valueAt1;

    @FXML
    private Label valueAt2;

    @FXML
    private Label valueAt3;

    @FXML
    private Label valueAt4;

    @FXML
    private Label valueAt5;

    @FXML
    private Label valueAt6;

    @FXML
    private Label valueAt7;

    @FXML
    private RadioButton radioButton0;

    @FXML
    private RadioButton radioButton1;

    @FXML
    private RadioButton radioButton2;

    @FXML
    private RadioButton radioButton3;

    @FXML
    private RadioButton radioButton4;

    @FXML
    private RadioButton radioButton5;

    @FXML
    private RadioButton radioButton6;

    @FXML
    private RadioButton radioButton7;
    
    @FXML
    private Button submitButton;
    
    @FXML
    void initialize() {
    	this.truthTable.setGridLinesVisible(true);
    	Variable.numberDigits = 3;
    	Variable.maxNumberVariables = 8;
    }
    
    @FXML
    void radioButton0Selected(ActionEvent event) {
    	if (radioButton0.isSelected()) {
    		valueAt0.setText("1");
    	} else {
    		valueAt0.setText("0");
    	}
    }
    
    @FXML
    void radioButton1Selected(ActionEvent event) {
    	if (radioButton1.isSelected()) {
    		valueAt1.setText("1");
    	} else {
    		valueAt1.setText("0");
    	}
    }

    @FXML
    void radioButton2Selected(ActionEvent event) {
    	if (radioButton2.isSelected()) {
    		valueAt2.setText("1");
    	} else {
    		valueAt2.setText("0");
    	}
    }

    @FXML
    void radioButton3Selected(ActionEvent event) {
    	if (radioButton3.isSelected()) {
    		valueAt3.setText("1");
    	} else {
    		valueAt3.setText("0");
    	}
    }

    @FXML
    void radioButton4Selected(ActionEvent event) {
    	if (radioButton4.isSelected()) {
    		valueAt4.setText("1");
    	} else {
    		valueAt4.setText("0");
    	}
    }

    @FXML
    void radioButton5Selected(ActionEvent event) {
    	if (radioButton5.isSelected()) {
    		valueAt5.setText("1");
    	} else {
    		valueAt5.setText("0");
    	}
    }

    @FXML
    void radioButton6Selected(ActionEvent event) {
    	if (radioButton6.isSelected()) {
    		valueAt6.setText("1");
    	} else {
    		valueAt6.setText("0");
    	}
    }


    @FXML
    void radioButton7Selected(ActionEvent event) {
    	if (radioButton7.isSelected()) {
    		valueAt7.setText("1");
    	} else {
    		valueAt7.setText("0");
    	}
    }

    /*
     * 
     */
    @FXML
    void submitButtonPressed(ActionEvent event) {
    	List<Implicant> minterms = new ArrayList<Implicant>();
    	
    	if (SOPButton.isSelected()) {
    		if (radioButton0.isSelected()) {
        		minterms.add(new Minterm("0"));
        	} 
        	
        	if (radioButton1.isSelected()) {
        		minterms.add(new Minterm("1"));
        	} 
        	
        	if (radioButton2.isSelected()) {
        		minterms.add(new Minterm("2"));
        	} 
        	
        	if (radioButton3.isSelected()) {
        		minterms.add(new Minterm("3"));
        	} 
        	
        	if (radioButton4.isSelected()) {
        		minterms.add(new Minterm("4"));
        	} 
        	
        	if (radioButton5.isSelected()) {
        		minterms.add(new Minterm("5"));
        	} 
        	
        	if (radioButton6.isSelected()) {
        		minterms.add(new Minterm("6"));
        	} 
        	
        	if (radioButton7.isSelected()) {
        		minterms.add(new Minterm("7"));
        	} 
    	} else {
       		if (!radioButton0.isSelected()) {
        		minterms.add(new Minterm("0"));
        	} 
        	
        	if (!radioButton1.isSelected()) {
        		minterms.add(new Minterm("1"));
        	} 
        	
        	if (!radioButton2.isSelected()) {
        		minterms.add(new Minterm("2"));
        	} 
        	
        	if (!radioButton3.isSelected()) {
        		minterms.add(new Minterm("3"));
        	} 
        	
        	if (!radioButton4.isSelected()) {
        		minterms.add(new Minterm("4"));
        	} 
        	
        	if (!radioButton5.isSelected()) {
        		minterms.add(new Minterm("5"));
        	} 
        	
        	if (!radioButton6.isSelected()) {
        		minterms.add(new Minterm("6"));
        	} 
        	
        	if (!radioButton7.isSelected()) {
        		minterms.add(new Minterm("7"));
        	} 
    	}
    	
    	for (Implicant m : minterms) {
    		System.out.println(m.getImplicant() + " " + m.getBinaryExpression());
    	}

    }
    
    @FXML
    void backButtonPressed(ActionEvent event) throws IOException {
    	switchScene(homeURL, event);
    }

    @FXML
    void resetPressed(ActionEvent event) {
    	radioButton0.setSelected(false);	
    	radioButton1.setSelected(false);
    	radioButton2.setSelected(false);
    	radioButton3.setSelected(false);
    	radioButton4.setSelected(false);
    	radioButton5.setSelected(false);
    	radioButton6.setSelected(false);
    	radioButton7.setSelected(false);
    	
		valueAt0.setText("0");
		valueAt1.setText("0");
		valueAt2.setText("0");
		valueAt3.setText("0");
		valueAt4.setText("0");
		valueAt5.setText("0");
		valueAt6.setText("0");
		valueAt7.setText("0");
    }
}
