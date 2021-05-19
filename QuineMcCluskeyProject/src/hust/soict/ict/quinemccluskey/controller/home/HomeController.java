package hust.soict.ict.quinemccluskey.controller.home;

import java.io.IOException;

import hust.soict.ict.quinemccluskey.controller.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController extends Controller {
	@FXML
	Label homeLabel = new Label();
	
	private String homeMessage = "The Quine-McCluskey solver "
			+ "can be used for up to 4 variables.\n\n"
			+ "Select the number of variables, then choose SOP (Sum of Products) or POS (Product of Sums)\n"
			+ "or Quine-McCluskey, and try some calculations. SOP is the default.";
	
	
	@FXML
	public void initialize() {
		homeLabel.setText(homeMessage);
	}
}
