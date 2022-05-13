public class Principal{
	public static void main(String[] args) {
		System.out.println("==> CalculadoraInt --> resultado = "+Principal.engine((int)3, (int )3).calculate(5,5));	
		System.out.println("==> CalculadoraLong --> resultado = "+Principal.engine((long)3, (long )2).calculate(6,2));	
	}

	private static CalculadoraInt engine (int a, int b){
		return (x,y) -> a * b;
	}
	private static CalculadoraLong engine (long a, long b){
		return (x,y)-> a - b;
	}
}