public class Principal{
	public static void main(String[] args) {
		CalculadoraInt ObjInt = (x,y) -> x + y;
		CalculadoraLong ObjLong = (x,y) -> x * y;
		Principal.engine(ObjInt);
		Principal.engine(ObjLong);
	}

	//Sobrecara de Métodos
	public static void engine (CalculadoraInt cal ){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = "+ resultado);
	}

	public static void engine (CalculadoraLong cal){
		long x = 2, y = 4;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado = "+resultado);
	}
}