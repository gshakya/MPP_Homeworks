package week3.lab9.question3;

import java.io.*; // for I/O

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * This is a skeleton class that you can use for guidance in starting the lab.
 *
 * You should update any comments, variable names, etc to follow the class
 * coding conventions.
 */

public class DepartmentApplication extends Application {
	private Department dept;

	private Faculty frankMoore;
	private Faculty samHoward;
	private Faculty johnDoodle;

	private Student johnDoe;
	private Student maryJones;
	private Student leeJohnson;

	private Staff frankGore;
	private Staff adamDavis;
	private Staff davidHeck;

	private StaffStudent adamJames;
	private StaffStudent rickBush;
	private StaffStudent jamesHogg;

	private Course cs201;
	private Course cs360;
	private Course cs404;
	private Course cs240;
	private Course cs301;
	private Course cs450;

	private void populateData() {

		dept = new Department("Computer Science");

		// The following commented out code will help you
		// create the objects that you need.

		// Create faculty objects

		frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
		samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
		johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);
		dept.addPerson(frankMoore);
		dept.addPerson(samHoward);
		dept.addPerson(johnDoodle);

		// Create student objects

		johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
		maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
		leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);
		dept.addPerson(johnDoe);
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);

		// Create staff objects

		frankGore = new Staff("Frank Gore", "472-3321", 33, 4050);
		adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500);
		davidHeck = new Staff("David Heck", "472-8890", 29, 3600);
		dept.addPerson(frankGore);
		dept.addPerson(adamDavis);
		dept.addPerson(davidHeck);

		// Create Student staff objects

		adamJames = new StaffStudent("Adam James", "472-3321", 33, 4000, 3.6);
		rickBush = new StaffStudent("Rick Bush", "472-2088", 33, 2050, 3.9);
		jamesHogg = new StaffStudent("James Hogg", "472-4577", 33, 3500, 3.6);
		dept.addPerson(adamJames);
		dept.addPerson(rickBush);
		dept.addPerson(jamesHogg);

		// Create course objects

		cs201 = new Course("cs201", "programming", 4, johnDoodle);
		cs360 = new Course("cs360", "database", 3, samHoward);
		cs404 = new Course("cs404", "compiler", 4, johnDoodle);
		cs240 = new Course("cs240", "datastructure", 2, johnDoodle);
		cs301 = new Course("cs301", "Software engg", 3, samHoward);
		cs450 = new Course("cs450", "Advanced architecture", 5, frankMoore);

		johnDoe.addCourse(cs201);
		johnDoe.addCourse(cs360);
		johnDoe.addCourse(cs404);
		johnDoe.addCourse(cs301);

		maryJones.addCourse(cs201);
		maryJones.addCourse(cs404);
		maryJones.addCourse(cs450);

		leeJohnson.addCourse(cs201);
		leeJohnson.addCourse(cs360);
		leeJohnson.addCourse(cs240);
		leeJohnson.addCourse(cs450);

	}

	public static void main(String[] args) throws IOException {
		launch(args);
	} // end main()
		// -------------------------------------------------------------

	// -------------------------------------------------------------
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Employee Application");

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(20);
		grid.setVgap(20);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Button totalSal = new Button("Get Total Salary");
		Button showAll = new Button("Show All Members");
		Button unitPFaculty = new Button("Units Per Faculty");
		Button stdOfFaculty = new Button("Student of Faculty");

		totalSal.setPrefSize(150, 15);
		showAll.setPrefSize(150, 15);
		unitPFaculty.setPrefSize(150, 15);
		stdOfFaculty.setPrefSize(150, 15);

		grid.add(totalSal, 0, 1);
		grid.add(showAll, 1, 1);
		grid.add(unitPFaculty, 2, 1);
		grid.add(stdOfFaculty, 3, 1);

		TextField facultyName = new TextField();
		facultyName.setPrefSize(150, 15);
		grid.add(facultyName, 3, 2);

		Label outputLbl = new Label();
		outputLbl.setPrefSize(500, 100);
		grid.add(outputLbl, 0, 3, 4, 1);

		populateData();

		totalSal.setOnAction(e -> outputLbl.setText(Double.toString(dept.getTotalSalary())));
		showAll.setOnAction(e -> outputLbl.setText(dept.getAllMembersName()));
		unitPFaculty.setOnAction(e -> outputLbl.setText(dept.unitsPerFaculty()));
		stdOfFaculty.setOnAction(e -> outputLbl.setText(dept.getStudentsNameOfFaculty(facultyName.getText().trim())));

		MenuBar mBar = new MenuBar();
		Menu deptMenu = new Menu("All " + dept.getName());
		Menu facultyMenu = new Menu("Faculty Members");
		Menu staffMenu = new Menu("Staff Members");
		Menu studentMenu = new Menu("Student Members");
		Menu staffStudentMenu = new Menu("Staff Student Members");

		mBar.getMenus().addAll(deptMenu,facultyMenu,staffMenu,studentMenu,staffStudentMenu);
		
		mBar.prefWidthProperty().bind(primaryStage.widthProperty());

		dept.getDeptMembers().stream().map(d -> d.getName()).forEach(d -> deptMenu.getItems().add(new MenuItem(d)));
		dept.getDeptMembers().stream().filter(d->d instanceof Faculty).forEach(d->facultyMenu.getItems().add(new MenuItem(d.getName())));
		dept.getDeptMembers().stream().filter(d->d instanceof Staff).forEach(d->staffMenu.getItems().add(new MenuItem(d.getName())));
		dept.getDeptMembers().stream().filter(d->d instanceof Studies).forEach(d->studentMenu.getItems().add(new MenuItem(d.getName())));
		dept.getDeptMembers().stream().filter(d->d instanceof StaffStudent).forEach(d->staffStudentMenu.getItems().add(new MenuItem(d.getName())));

		// grid.setTop;

		Group root = new Group();
		root.getChildren().add(grid);
		root.getChildren().add(mBar);

		Scene scene = new Scene(root, 650, 200);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
} // end class
