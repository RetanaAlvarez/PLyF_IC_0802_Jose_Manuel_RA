import java.util.Scanner;
//import javafx.application.Application;

public class persona  {
	public static void main(String[] args) {
		
	
	//public void leer (String Nombre, String Apellidos, int edad, String genero){
		String Nombre, Apellidos, genero;
		int edad;
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cual es tu nombre? \n");
		Nombre=sc.nextLine();
		System.out.println("¿Cuales son tus Apellidos? \n");
		Apellidos=sc.nextLine();
		System.out.println("¿Que edad tienes?\n");
		edad=sc.nextInt();
		System.out.println("Que genero eres? (H/M) \n");
		genero=sc.next();
		System.out.println("\n");
	/*} 
	
	public void persona( String Nombre, String Apellidos, int edad, String genero){
		this.Nombre = Nombre;
		this.Apellidos= Apellidos;
		this.edad 	= edad;
		this.genero = genero;
	}

	public void imprimir(String Nombre,String Apellidos,String genero,	int edad){*/
		System.out.println("Nombre: persona");
		System.out.println("Nombre: "+Nombre+"\nApellidos: "+Apellidos+"\nedad: "+edad+"\ngenero: "+genero);
	}
}
