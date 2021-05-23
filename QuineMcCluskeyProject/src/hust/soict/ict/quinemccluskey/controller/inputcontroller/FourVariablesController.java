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

public class FourVariablesController extends Controller {
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
    private Label valueAt8;

    @FXML
    private Label valueAt9;

    @FXML
    private Label valueAt10;

    @FXML
    private Label valueAt11;

    @FXML
    private Label valueAt12;

    @FXML
    private Label valueAt13;

    @FXML
    private Label valueAt14;

    @FXML
    private Label valueAt15;

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
    private RadioButton radioButton8;

    @FXML
    private RadioButton radioButton9;

    @FXML
    private RadioButton radioButton10;

    @FXML
    private RadioButton radioButton11;

    @FXML
    private RadioButton radioButton12;

    @FXML
    private RadioButton radioButton13;

    @FXML
    private RadioButton radioButton14;

    @FXML
    private RadioButton radioButton15;
    
    @FXML
    private Button submitButton;
    
    @FXML
    void initialize() {
    	this.truthTable.setGridLinesVisible(true);
    	Variable.numberDigits = 4;
    	Variable.maxNumberVariables = 16;
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

    @FXML
    void radioButton8Selected(ActionEvent event) {
    	if (radioButton8.isSelected()) {
    		valueAt8.setText("1");
    	} else {
    		valueAt8.setText("0");
    	}
    }

    @FXML
    void radioButton9Selected(ActionEvent event) {
    	if (radioButton9.isSelected()) {
    		valueAt9.setText("1");
    	} else {
    		valueAt9.setText("0");
    	}
    }
    
    @FXML
    void radioButton10Selected(ActionEvent event) {
    	if (radioButton10.isSelected()) {
    		valueAt10.setText("1");
    	} else {
    		valueAt10.setText("0");
    	}
    }

    @FXML
    void radioButton11Selected(ActionEvent event) {
    	if (radioButton11.isSelected()) {
    		valueAt11.setText("1");
    	} else {
    		valueAt11.setText("0");
    	}
    }

    @FXML
    void radioButton12Selected(ActionEvent event) {
    	if (radioButton12.isSelected()) {
    		valueAt12.setText("1");
    	} else {
    		valueAt12.setText("0");
    	}
    }

    @FXML
    void radioButton13Selected(ActionEvent event) {
    	if (radioButton13.isSelected()) {
    		valueAt13.setText("1");
    	} else {
    		valueAt13.setText("0");
    	}
    }

    @FXML
    void radioButton14Selected(ActionEvent event) {
    	if (radioButton14.isSelected()) {
    		valueAt14.setText("1");
    	} else {
    		valueAt14.setText("0");
    	}
    }

    @FXML
    void radioButton15Selected(ActionEvent event) {
    	if (radioButton15.isSelected()) {
    		valueAt15.setText("1");
    	} else {
    		valueAt15.setText("0");
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
        	
        	if (radioButton8.isSelected()) {
        		minterms.add(new Minterm("8"));
        	} 
        	
        	if (radioButton9.isSelected()) {
        		minterms.add(new Minterm("9"));
        	} 
        	
        	if (radioButton10.isSelected()) {
        		minterms.add(new Minterm("10"));
        	} 
        	
        	if (radioButton11.isSelected()) {
        		minterms.add(new Minterm("11"));
        	} 
        	
        	if (radioButton12.isSelected()) {
        		minterms.add(new Minterm("12"));
        	} 
        	
        	if (radioButton13.isSelected()) {
        		minterms.add(new Minterm("13"));
        	}
        	
        	if (radioButton14.isSelected()) {
        		minterms.add(new Minterm("14"));
        	} 
        	
        	if (radioButton15.isSelected()) {
        		minterms.add(new Minterm("15"));
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
        	
        	if (!radioButton8.isSelected()) {
        		minterms.add(new Minterm("8"));
        	} 
        	
        	if (!radioButton9.isSelected()) {
        		minterms.add(new Minterm("9"));
        	} 
        	
        	if (!radioButton10.isSelected()) {
        		minterms.add(new Minterm("10"));
        	} 
        	
        	if (!radioButton11.isSelected()) {
        		minterms.add(new Minterm("11"));
        	} 
        	
        	if (!radioButton12.isSelected()) {
        		minterms.add(new Minterm("12"));
        	} 
        	
        	if (!radioButton13.isSelected()) {
        		minterms.add(new Minterm("13"));
        	}
        	
        	if (!radioButton14.isSelected()) {
        		minterms.add(new Minterm("14"));
        	} 
        	
        	if (!radioButton15.isSelected()) {
        		minterms.add(new Minterm("15"));
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
    	radioButton8.setSelected(false);
    	radioButton9.setSelected(false);
    	radioButton10.setSelected(false);
    	radioButton11.setSelected(false);
    	radioButton12.setSelected(false);
    	radioButton13.setSelected(false);
    	radioButton14.setSelected(false);
    	radioButton15.setSelected(false);
    	
		valueAt0.setText("0");
		valueAt1.setText("0");
		valueAt2.setText("0");
		valueAt3.setText("0");
		valueAt4.setText("0");
		valueAt5.setText("0");
		valueAt6.setText("0");
		valueAt7.setText("0");
		valueAt8.setText("0");
		valueAt9.setText("0");
		valueAt10.setText("0");
		valueAt11.setText("0");
		valueAt12.setText("0");
		valueAt13.setText("0");
		valueAt14.setText("0");
		valueAt15.setText("0");
    }
}
