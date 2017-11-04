package PersonStudentStaff;

public class Staff extends Person{
	


	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		setSchool(school);
		setPay(pay);
	}


	private String school;
	private double pay;
	
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	
	@Override
	public void printPerson(){
		
		System.out.println("This person's name is: " + getName() + ".");
		System.out.println("They live at: " + getAddress() + ".");
		System.out.println("They get paid: " + getPay() + ".");
		System.out.println("They work at: " + getSchool() + " school.");
		
	}
	

}
