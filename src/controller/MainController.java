package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MainController implements Initializable {

	@FXML
	private Button btn_connexion;

	@FXML
	private Button btn_deconnexion;

	@FXML
	private VBox vbox;

	@FXML
	private Parent root;

	@FXML
	public void connexion(ActionEvent event) {
		
		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), vbox);

		translateTransition.setToX(-21);
		translateTransition.play();

		translateTransition.setOnFinished((e) -> {
			try {
				//root = FXMLLoader.load(getClass().getResource("/vues/Connexion.fxml"));
				root = FXMLLoader.load(getClass().getResource("/vues/Conn.fxml"));
				vbox.getChildren().removeAll();
				vbox.getChildren().setAll(root);

			} catch (IOException e2) {
				System.out.println("Erreur bouton connexion : " + e2.getLocalizedMessage());
				e2.printStackTrace();
			}
		});
		
	}

	@FXML
	public void deconnexion(ActionEvent event) {

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), vbox);

		translateTransition.setToX(vbox.getLayoutX() * 23);
		translateTransition.play();

		translateTransition.setOnFinished((e) -> {
			try {
				//root = FXMLLoader.load(getClass().getResource("/vues/Deconnexion.fxml"));
				root = FXMLLoader.load(getClass().getResource("/vues/Decon.fxml"));
				vbox.getChildren().removeAll();
				vbox.getChildren().setAll(root);

			} catch (IOException e2) {
				System.out.println("Erreur bouton déconnexion : " + e2.getLocalizedMessage());
				e2.printStackTrace();
			}
		});

	}

	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), vbox);

		translateTransition.setToX(vbox.getLayoutX() * 23);
		translateTransition.play();

		translateTransition.setOnFinished((e) -> {
			try {
				//root = FXMLLoader.load(getClass().getResource("/vues/Connexion.fxml"));
				root = FXMLLoader.load(getClass().getResource("/vues/Decon.fxml"));
				vbox.getChildren().removeAll();
				vbox.getChildren().setAll(root);

			} catch (IOException e2) {
				System.out.println("ERREUR : " + e2.getLocalizedMessage());
				e2.printStackTrace();
			}
		});

//		System.out.println(".......*-* VOTRE FENETRE EST LANCÉE *-*.......");

	}

}
