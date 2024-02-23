package calcul;
import java.util.Scanner;
public class Test {
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("entrez le premier nombre:");
		double x=scan.nextDouble();
		System.out.println("entrez le deuxiéme nombre:");
		double y=scan.nextDouble();
		System.out.println("entrez l'opération:");
		String op = scan.next();
		if(op.equals("+"))
			System.out.println(Calculatrice.addition(x,y));
		else if(op.equals("-"))
			System.out.println(Calculatrice.soustraction(x,y));
		else if(op.equals("*"))
			System.out.println(Calculatrice.multiplication(x,y));
		else if(op.equals("/"))
			System.out.println(Calculatrice.division(x,y));
		else
			System.out.println("erreur");
		
		
		
		
		
		
		
		
	}

}
