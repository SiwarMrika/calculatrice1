package calcul;

public class Calculatrice {
	public static double addition(double a,double b){
		return a+b;
	}
	public static double soustraction(double a,double b){
		return a-b;
	}
	public static double multiplication(double a,double b){
		return a*b;
	}
	public static double division(double a,double b){
		if(b==0){
			throw new IllegalArgumentException("division par z�ro est impossible");
		}
		return a/b;
	}
	
}
