package week1.lab2;

public class Course {
	private Faculty ofFaculty;
	private String number;
	private String title;
	private int units;
	
	
	
	public Course( String number, String title, int units, Faculty ofFaculty) {
		super();
		this.ofFaculty = ofFaculty;
		this.number = number;
		this.title = title;
		this.units = units;
		ofFaculty.addCourse(this);
	}
	public Faculty getOfFaculty() {
		return ofFaculty;
	}
	public void setOfFaculty(Faculty ofFaculty) {
		this.ofFaculty = ofFaculty;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int unirs) {
		this.units = unirs;
	}
	
	

}
