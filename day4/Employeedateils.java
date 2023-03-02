package week1.day4;

public class Employeedateils {
	public void EmployeeName(String empName) {
		System.out.println("EmployName:"+empName);
	}
	public void empId( int empId) {
		System.out.println("EmpId:"+empId);

}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("empAddress:"+empAddress);
}
	public void EmployeeSalary(double empSalary) {
		System.out.println("empSalary:"+empSalary);
	}
	public void EmployeeMobileNumber(long mobNum) {
		System.out.println("mobNum:"+mobNum);
	}
	public static void main(String[] args) {
		Employeedateils emp=new Employeedateils();
		emp.EmployeeName("Arun");
		emp.empId(10);
		emp.EmployeeSalary(25000.00);
		emp.EmployeeMobileNumber(9344198851l);
	}
	
}