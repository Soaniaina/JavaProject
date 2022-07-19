module Login_JavaFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires fontawesomefx;
	requires javafx.graphics;
	
	opens controller to javafx.graphics, javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
	
}
