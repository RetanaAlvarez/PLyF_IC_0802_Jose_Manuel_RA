public class Principal{
	public static void main(String[] args) {
		Principal.engine((x, y) -> x + y);
		Principal.engine((x, y) -> x * y);
		Principal.engine((x, y) -> x / y);
		Principal.engine((x, y) -> x - y);
		Principal.engine((x, y) -> x % y);
	}

	//Sobrecara de Métodos
	private static void engine ( CalculadoraInt cal ){
		int x = 2, y = 4;
		int resultado = calcular(x, y);
		System.out.println("resultado = "+ resultado);
	}

	private static void engine (CalculadoraLong cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = "+resultado);
	}
}