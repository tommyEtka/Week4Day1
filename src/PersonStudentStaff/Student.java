package PersonStudentStaff;

public class Student extends Person{
	
	public Student(String name, String address, String program, double fee,
			int year) {
		super(name, address);
		setProgram(program);
		setFee(fee);
		setYear(year);
	
		// TODO Auto-generated constructor stub
	}
	private String program;
	private double fee;
	private int year;
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void printPerson(){
		System.out.println("This person's name is: " + getName() + ".");
		System.out.println("They live at: " + getAddress() + ".");
		System.out.println("They are in the " + getProgram() + " program.");
		System.out.println("They need to pay: " + getFee() + ".");
		System.out.println("They are in year: " + getYear() + ".");
		
	}
	

}
