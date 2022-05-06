public class Principal{
	public static void main(String[] args) {
		Principal.engine((int x, int y)-> (long x1,long y2)-> x1+y2);
	}

	private static void engine(CalculadoraInt cal){
		int x=2,y=4;
		CalculadoraLong resultado = cal.calcular(x,y);
		System.out.println(resultado.calcular((long)x, (long)y));
	}

	private static void engine(CalculadoraLong cal){
		long x=2,y=4;
		long resultado= cal.calcular(x,y);
		System.out.println(resultado);
	}
}