package ba.unsa.etf.rs.tut5;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txt1;
    public TextField txt2;
    public TextField txt3;
    public TextField txt4;
    public PasswordField passwdfield;
    public Button btnadd;
    public Button btnend;
    public ListView Korisnici;

    private KorisniciModel model;

    public Controller (KorisniciModel model){
        this.model=model;
    }

    public void btnaddaction(ActionEvent actionEvent) {
    }

    public void btnendaction(ActionEvent actionEvent) {
        Stage myStage = (Stage)btnadd.getScene().getWindow();
        myStage.close();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bind();
    }

    private void bind() {
        txt1.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        txt2.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        txt3.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailProperty());
        txt4.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
        passwdfield.textProperty().bindBidirectional(model.getTrenutniKorisnik().passwordProperty());
    }
}
