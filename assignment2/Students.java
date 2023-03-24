package assignment2;

public class Students {
	
	public void getStudentInfos(int stuid,String stuname) {
		System.out.println(stuid);
		System.out.println(stuname);
	}
	public void getStudentInfos(String empMaiId,long empPhonenumber) {
		System.out.println(empMaiId);
		System.out.println(empPhonenumber);
	}
	public static void main(String[] args) {
		Students jee = new Students();
		jee.getStudentInfos(2001, "Thalapathi");
		jee.getStudentInfos("thalapathi67@gmail.com", 9344198851l);
	}
}
