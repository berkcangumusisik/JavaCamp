package homework2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Berkcan");
		student.setLastName("Gümüşışık");
		student.seteMail("gumusisikberkcan@gmail.com");
		student.setCoursesApplied("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.seteMail("engindemirog@gmail.com");
		instructor.setCoursesInstructor("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		UserManager userManager  = new InstructorManager();
		UserManager userManager2 = new StudentManager();
		UserManager userManager3 = new UserManager();

		
		User[] users = {student, instructor};
		userManager.add(instructor);
		userManager2.add(student);
		userManager3.addMultiple(users);
		userManager.update(instructor);
		userManager.delete(instructor);
		userManager2.update(student);
		userManager2.delete(student);
		

	}

}
