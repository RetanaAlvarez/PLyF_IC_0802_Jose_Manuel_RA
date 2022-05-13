import java.util.List;

public class FP_funcional_exercises{
	public static void main(String[] args) {
		//List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String>courses = List.of("Spring", "Spring Boor", "API","Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
		FP_funcional_exercises.all(courses);
	}	
	private static void all(List<String> courses){
		System.out.println(courses);
		
	}	

}