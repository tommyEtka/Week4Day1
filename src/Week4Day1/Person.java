package Week4Day1;

public class Person {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void printName() {
		System.out.println(lastName + ", " + firstName);
		// this is where printName is but what if we can't change this
		// go to Employee
	}

}
