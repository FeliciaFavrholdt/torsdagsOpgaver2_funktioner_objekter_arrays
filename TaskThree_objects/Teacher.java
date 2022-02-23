public class Teacher {

	//declare variables as template
	private String name; 
	private int age; 
	private boolean isFemale; 

	//constructor
	public Teacher(String tmpName, int tmpAge, boolean tmpIsFemale){
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale; 
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

}