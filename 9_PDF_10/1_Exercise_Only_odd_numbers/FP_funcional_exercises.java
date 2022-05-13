import java.util.List;

public class FP_funcional_exercises{
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		FP_funcional_exercises.pares(numbers);
		System.out.println("");
		//List<String>courses = List.of("Spring", "Spring Boor", "API","Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
	}	
	private static void pares(List<Integer> numbers){
		for (int number : numbers ) {
			if ((number % 2 == 0)== true ) {
				System.out.print(number + ", ");	
			}
		}
		System.out.println("");
	}	

}