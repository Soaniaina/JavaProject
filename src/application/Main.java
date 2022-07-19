package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	
//	private double x;
//	private double y;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/vues/Main.fxml"));
			
			Scene scene = new Scene(root);
			scene.setFill(Color.TRANSPARENT);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
//			root.setOnMousePressed(e->{
//				x = e.getSceneX();
//				y = e.getSceneY();
//			});
			
//			root.setOnMouseDragged(e->{
//				primaryStage.setY(e.getScreenX() - x);
//				primaryStage.setY(e.getScreenY() - y);
//			});
			
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
		} catch(Exception e) {
			System.out.println("ERREUR : " + e.getLocalizedMessage());
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
