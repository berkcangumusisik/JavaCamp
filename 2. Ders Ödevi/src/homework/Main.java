package homework;

public class Main {
	public static void main(String[] args) {
	System.out.println("Kodlama.io'ya hoþ geldiniz.");
	Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin Demiroð");
	Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demiroð");
	Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs","Engin Demiroð");
	Course[] coursies = {course1, course2, course3};
	System.out.println("******************KURS LÝSTESÝ***********");
	for (Course course : coursies) {
		System.out.println("Kurs Adý: "+ course.CourseName+ " Kurs Eðitmeni:"+ course.CourseTeacher);
	}
	System.out.println("-------------------------------------------------------");
	System.out.println("******************KATEGORÝLER************");
	Category category1 = new Category(1,"Tümü",3);
	Category category2 = new Category(2,"Programlama",3);
	Category[] categories = {category1, category2};
	for (Category category : categories) {
		System.out.println("Kategori Adý: " +category.Categoryname + " Kurs Sayýsý: "+ category.CourseNumber);
	}
	CourseManager courses = new CourseManager();
	courses.Add(course3);
	courses.Add(course2);
	courses.Add(course1);
	courses.Add(course3);
	
	


	}
}