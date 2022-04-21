public class Principal{
	public static void main(String[] args) {
		System.out.println("cls");
		System.out.println("CalculadoraInt");
		Principal.engine((x, y) -> x + y);
		Principal.engine((x, y) -> x * y);
		Principal.engine((x, y) -> x / y);
		Principal.engine((x, y) -> x - y);
		Principal.engine((x ,y) -> x % y);

		System.out.println("\nCalculadoraLong");
		Principal.engin((x, y) -> x + y);
		Principal.engin((x, y) -> x * y);
		Principal.engin((x, y) -> x / y);
		Principal.engin((x, y) -> x - y);
		Principal.engin((x ,y) -> x % y);

	}

	//Sobrecara de Métodos
	public static void engine ( CalculadoraInt cal ){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = "+ resultado);
	}

	public static void engin (CalculadoraLong cal){
		long x = 2, y = 4;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado = "+resultado);
	}
}