import java.util.List;

public class FP_funcional_exercises{
	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		FP_funcional_exercises.letras(courses);
		System.out.print("\n");
	}

	private static void letras(List<String> courses){
		courses.stream()
    	.forEach(course -> System.out.println("la palabra: " + course + "\ttiene " +course.length() + " caracteres"));
	}
}