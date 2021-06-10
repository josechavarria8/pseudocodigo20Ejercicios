import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);

		int doble;
		int num;
		int triple;

		System.out.println("Numero: ");
		num =  scanner.nextInt();
		doble = num*2;
		triple = num*3;
		System.out.println("El doble de "+num+" es: "+doble);
		System.out.println("El triple de "+num+" es: "+triple);
	}


}

