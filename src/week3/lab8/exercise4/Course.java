package week3.lab8.exercise4;

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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (ofFaculty == null) {
			if (other.ofFaculty != null)
				return false;
		} else if (!ofFaculty.equals(other.ofFaculty))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (units != other.units)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((ofFaculty == null) ? 0 : ofFaculty.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + units;
		return result;
	}
	
	

}
