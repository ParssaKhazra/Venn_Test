package Venn_Test;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Venn 
{
	public Venn()
	{
		startStage();
		
	}

	private void startStage() {
		// making a basic gui
		Stage s = new Stage();
		GridPane root = new GridPane();
		root.setPadding(new Insets(15,15,15,15));
		
		
		Scene scene = new Scene(root,800,800);
		root.setStyle("-fx-background-color:#faf8ef;");
		
		Button b1 = new Button("temp button 1");
		b1.setPrefSize(100, 100);
		Button b2 = new Button("temp button 2");
		b2.setPrefSize(100, 100);
		Button b3 = new Button("temp button 3");
		b3.setPrefSize(100, 100);
		
		VBox panel = new VBox(20);
		panel.getChildren().addAll(b1,b2,b3);
		panel.setPadding(new Insets(10,10,10,10));
		panel.setStyle("-fx-border-color:black;");
		
		root.add(panel, 0, 0);
		
		s.setTitle("custom venn diagram maker");
		s.getIcons().clear();
		s.getIcons().add(new Image("/Images/VennIcon"+".png"));
		s.setScene(scene);
		s.show();
	
		
		
	}
}
