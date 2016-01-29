package week3.lab9.question1;

import java.awt.Dimension;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AddressForm extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Address Form");

		// Flow Layout Setup
		FlowPane flow = new FlowPane();
		flow.setAlignment(Pos.TOP_CENTER);
		flow.setVgap(10);
		flow.setHgap(10);
		flow.setPadding(new Insets(25,25,25,25));
		// ----------------
		
		Label namelbl = new Label("Name");
		namelbl.setPrefSize( 170,20);
		flow.getChildren().add(namelbl);
		
		Label streetLbl = new Label("Street");
		streetLbl.setPrefSize( 170,20);
		flow.getChildren().add(streetLbl);
		
		Label cityLbl = new Label("City");
		cityLbl.setPrefSize( 170,20);
		flow.getChildren().add(cityLbl);
		
		Scene scene = new Scene(flow,580,150);
		
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
}
