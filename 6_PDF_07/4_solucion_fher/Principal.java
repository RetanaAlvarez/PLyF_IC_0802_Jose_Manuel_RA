public class Principal{
	public static void main(String[] args) {
		Principal.engine((long)5,(long)5).calculate(4,4);
		Principal.engine((int)5,(int)5).calculate(4,4);
	}
	public static CalculadoraInt engine(int a, int b){
		return (x,y)-> a*b;
	}
	public static CalculadoraLong engine(long a,long b){
		return (x,y)-> a+b;
	}
}