public class Principal{
	public static void main(String[] args) {
		int a=5,b=5;
		//cambiar el tipo
		System.out.println(Principal.engine(a,b).calculate(0,1));
	}
	
	private static CalculadoraInt engine(int a, int b){
		return (int x,int y)-> a/b;
	}

	private static CalculadoraLong engine(long a,long b){
		return (long x,long y)-> a+b;
	}
}