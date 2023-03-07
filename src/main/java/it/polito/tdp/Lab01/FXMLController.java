package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole par = new Parole();
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnInserisci;
    
    @FXML
    private TextArea txtVelocità;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;

    @FXML
    void doCancel(ActionEvent event) {
    	par.cancel(txtParola.getText());
    	printElenco();
    }
    
    public void printElenco() {
    	
    	String elencoParole = "";
    	for (String s : par.getElenco()) {
    		elencoParole += s+"\n" ;
    		txtResult.setText(elencoParole);
    	}
        double tempo = 0;
        tempo = System.nanoTime();
        txtVelocità.setText(String.valueOf(tempo));
        
    }

    @FXML
    void doInsert(ActionEvent event) {
    	String parola = txtParola.getText();
    	par.addParola(parola);
    	printElenco();
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	par.reset();
    	txtResult.setText("");;
    }

    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
    }

}
