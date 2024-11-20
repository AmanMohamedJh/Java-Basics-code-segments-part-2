package dont;

public class Employee implements Printable {
	
	private String empName;
	private int empAge;
	private int empNo;
	
	Employee(String empName,int empAge,int empNo){
		this.empName =empName;
		this.empAge =empAge;
		this.empNo =empNo;
	}
	public void print() {
		System.out.println("-------------The employee details------------");
		System.out.println("The employee Name : " + this.empName);
		System.out.println("The employee id   : " + this.empNo);
		System.out.println("The employee age  : " + this.empAge);
		System.out.println();
	}
	
}
