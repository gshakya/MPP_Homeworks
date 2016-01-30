package week3.lab9.question2;

import java.util.Arrays;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StringUtility extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("String Utility");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(20);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Button countBtn = new Button("Count Letters");
		Button reverseBtn = new Button("Reverse Letters");
		Button removeBtn = new Button("Remove Duplicates");

		countBtn.setPrefSize(150, 15);
		reverseBtn.setPrefSize(150, 15);
		removeBtn.setPrefSize(150, 15);

		grid.add(countBtn, 0, 0);
		grid.add(reverseBtn, 0, 2);
		grid.add(removeBtn, 0, 4);

		Label inputLbl = new Label("Input");
		Label outputLbl = new Label("Output");
		inputLbl.setPrefSize(150, 15);
		outputLbl.setPrefSize(150, 15);

		grid.add(inputLbl, 1, 0);
		grid.add(outputLbl, 1, 2);

		TextField ipTxt = new TextField();
		ipTxt.setPrefSize(150, 15);
		TextField opTxt = new TextField();
		opTxt.setPrefSize(150, 15);
		opTxt.setEditable(false);

		grid.add(ipTxt, 1, 1);
		grid.add(opTxt, 1, 3);

		Scene scene = new Scene(grid, 350, 200);
		primaryStage.setScene(scene);
		primaryStage.show();

		countBtn.setOnAction(e -> opTxt.setText(Integer.toString(ipTxt.getText().trim().length())));
		removeBtn.setOnAction(e -> opTxt.setText(removeDup(ipTxt.getText().trim())));
		reverseBtn.setOnAction(e -> opTxt.setText(reverseStr(ipTxt.getText().trim())));

	}

	private String reverseStr(String input) {
		String opStr = "";
		while (input.length() != 0) {
			opStr = opStr + input.substring(input.length() - 1);
			input = input.substring(0, input.length() - 1);
		}
		return opStr;
	}

	private String removeDup(String input) {
		// TODO Auto-generated method stub
		return Arrays.asList(input.split("")).stream().distinct().collect(Collectors.joining());
	}

}
