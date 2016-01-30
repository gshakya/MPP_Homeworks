package week3.lab9.question1;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
		
		
		TextField nameTxt = new TextField();
		nameTxt.setPrefSize(170,20);
		flow.getChildren().add(nameTxt);
				
		TextField strtTxt = new TextField();
		strtTxt.setPrefSize(170,20);
		flow.getChildren().add(strtTxt);
		
		TextField cityTxt = new TextField();
		cityTxt.setPrefSize(170,20);
		flow.getChildren().add(cityTxt);
		
		Label stateLbl = new Label("State");
		stateLbl.setPrefSize( 180,20);
		flow.getChildren().add(stateLbl);
		
		Label zipLbl = new Label("Zip");
		zipLbl.setPrefSize( 180,20);
		flow.getChildren().add(zipLbl);
		
		TextField stateTxt = new TextField();
		stateTxt.setPrefSize(180,20);
		flow.getChildren().add(stateTxt);
		
		TextField zipTxt = new TextField();
		zipTxt.setPrefSize(180,20);
		flow.getChildren().add(zipTxt);
		
		Button submitBtn = new Button();
		submitBtn.setPrefSize(180, 20);
		submitBtn.setText("Submit");
		flow.getChildren().add(submitBtn);
		
		submitBtn.setOnAction(e->{System.out.println(nameTxt.getText());
								  System.out.println(strtTxt.getText());
								  System.out.printf("%s, %s %s\n",cityTxt.getText(),stateTxt.getText(),zipTxt.getText());
		});
		
		
		
		Scene scene = new Scene(flow,580,230);
		
		
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);		
		primaryStage.show();
	}
}
