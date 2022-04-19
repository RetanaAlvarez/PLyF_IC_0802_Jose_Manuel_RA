public class LambdaTest{
	public static void main(String[] args) {
		
		//Expresión lambda ==> representa un objetivo de una interfaz funcional
		FunctionTest ft = () -> System.out.println("Hola Mundo"); // Implementacion del método abstracto "saludar()"
																  //de la Interfaz funcional.

		//ft.saludar();

		LambdaTest objeto = new LambdaTest();
		objeto.miMetodo(ft);
	}
	public void miMetodo(FunctionTest parametro){
		parametro.saludar();
	}
}	