package week3.day1Assignment;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("StudentId :"+id);
		
	}
  public void getStudentInfo(int id,String email) {
	  System.out.println("StudentId :"+id+" E-mail: "+email);
		
	}
  public void getStudentInfo(String email,int phoneNumber) {
	  System.out.println("Email :"+email+" phoneNumber: "+phoneNumber);
	
}

	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(10);
		s.getStudentInfo(11,"jayu@gmail.com");
		s.getStudentInfo("jayu@gmail.com", 1230456);
		

	}

}
