import java.util.List;

public class FP_funcional_exercises{
	public static void main(String[] args) {
		System.out.println("");
		List<String>courses = List.of("Spring", "Spring Boor", "API","Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
		System.out.println("printCoursesAtLeastFourLetters: ");
		printCoursesAtLeastFourLetters(courses);
		System.out.println("");
	}

	private static void printCoursesAtLeastFourLetters(List<String> courses){
		courses.stream()
		.filter(course -> course.length()<=4)
    	.forEach(System.out::println);
	}

}