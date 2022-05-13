import java.util.List;

public class FP_funcional_exercises{
	public static void main(String[] args) {
		System.out.println("");
		List<String>courses = List.of("Spring", "Spring Boor", "API","Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
		String course = "Spring,Spring Boor,API,Microservices,AWS,PCF,Azure,Docker,Kubernetes";
		FP_funcional_exercises.all(courses);
	}	
	private static void all(List<String>courses){
		
		if(courses<=3)
			System.out.println(courses);
    
	}	

}