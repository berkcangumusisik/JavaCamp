package homework;

public class Main {
	public static void main(String[] args) {
	System.out.println("Kodlama.io'ya ho� geldiniz.");
	Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�");
	Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�");
	Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs","Engin Demiro�");
	Course[] coursies = {course1, course2, course3};
	System.out.println("******************KURS L�STES�***********");
	for (Course course : coursies) {
		System.out.println("Kurs Ad�: "+ course.CourseName+ " Kurs E�itmeni:"+ course.CourseTeacher);
	}
	System.out.println("-------------------------------------------------------");
	System.out.println("******************KATEGOR�LER************");
	Category category1 = new Category(1,"T�m�",3);
	Category category2 = new Category(2,"Programlama",3);
	Category[] categories = {category1, category2};
	for (Category category : categories) {
		System.out.println("Kategori Ad�: " +category.Categoryname + " Kurs Say�s�: "+ category.CourseNumber);
	}
	CourseManager courses = new CourseManager();
	courses.Add(course3);
	courses.Add(course2);
	courses.Add(course1);
	courses.Add(course3);
	
	


	}
}