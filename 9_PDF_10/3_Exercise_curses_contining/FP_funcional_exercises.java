import java.util.List;

public class FP_funcional_exercises{
	public static void main(String[] args) {
		
		List<String>courses = List.of("Spring Spring Boor API Microservices AWS PCF Azure Docker Kubernetes");
		FP_funcional_exercises.all(courses);
	}	
	private static void all(List<String> courses){
		int q=1;
		String list = "Spring Spring_Boor API Microservices AWS PCF Azure Docker Kubernetes";
		String arreglo[] = list.split(" ");
		for (int i=0;i< arreglo.length;i++ ) {
			if (arreglo[i].equals("Spring") || arreglo[i].equals("Spring_Boor")) {	
				System.out.println(arreglo[i]);	
			}
		}
			
	}	

}