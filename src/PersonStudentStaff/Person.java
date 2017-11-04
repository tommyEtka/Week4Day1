package PersonStudentStaff;

public class Person {
	
	
	private String name;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Person(String name, String address) {
		super();
		setName(name);
		setAddress(address);
	}
	
	public void printPerson(){
		System.out.println("This person's name is: " + getName() + ".");
		//do I need the getName() or can I use name?
		System.out.println("They live at: " + getAddress() + ".");
		//do I need the getAddress() or can I use address?
		
	}
	

}
