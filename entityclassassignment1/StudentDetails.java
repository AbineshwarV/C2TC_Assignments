package entityclassassignment1;

public class StudentDetails {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Tom");
		s1.setSmark(80);
		s1.setScity("Chennai");
		System.out.println(s1);
		System.out.println("------------------------------------------------------");
		
		Student s2 = new Student();
		s2.setSid(2);
		s2.setSname("Ogy");
		s2.setSmark(63);
		s2.setScity("Pondicherry");
		System.out.println(s2);
		System.out.println("------------------------------------------------------");
		
		Student s3 = new Student();
		s3.setSid(3);
		s3.setSname("Ben");
		s3.setSmark(45);
		s3.setScity("Madurai");
		System.out.println(s3);
		System.out.println("------------------------------------------------------");
	}

}
