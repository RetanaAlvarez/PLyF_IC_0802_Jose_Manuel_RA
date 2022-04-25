public class Principal{
	public static void main(String[] args) {
		System.out.println("int");
		Principal.engine((int x,int y) -> x + y);
		Principal.engine((int x,int y) -> x * y);
		Principal.engine((int x,int y) -> x / y);
		Principal.engine((int x,int y) -> x - y);
		Principal.engine((int x,int y) -> x % y);
		System.out.println("\nlong");
		Principal.engine((long x,long y) -> x + y);
		Principal.engine((long x,long y) -> x * y);
		Principal.engine((long x,long y) -> x / y);
		Principal.engine((long x,long y) -> x - y);
		Principal.engine((long x,long y) -> x % y);
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