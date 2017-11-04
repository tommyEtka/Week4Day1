package Week4Day1;

public class Employee extends Person {

	// this calls the upper class constructor
	public Employee(String firstName, String lastName, String Title) {
		super(firstName, lastName);
		setTitle(Title);
	}

	private String Title;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	@Override
	public void printName() {
		// this is OVERRIDE

		System.out.println(getLastName() + ", " + getFirstName() + " : "
				+ Title);
		// can't do lastName and firstName because they are private in Person
		// class

	}

}
