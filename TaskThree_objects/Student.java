// Create a Student class
public class Student {

	//declare variables as template
	private String name; 
	private int age; 
	private boolean isFemale; 
	private String datamatikerTeam; 

	//constructor
	public Student(String tmpName, int tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam){
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale; 
		this.datamatikerTeam = tmpDatamatikerTeam; 
	}

	public String getName() {
		return this.name; 
	}

	public int getAge() {
		return this.age; 
	}

	public String getGender() {
		if(this.isFemale) {
			return "Woman";
		} else {
			return "Man";
		}
	}

	public String getTeam() {
		return this.datamatikerTeam;
	}

} 
