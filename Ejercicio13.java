import java.util.Scanner;



public class Ejercicio13 {

	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);

		int r, h;
		double V;

		System.out.print("\nIngrese el radio: ");
		r = scanner.nextInt();
		System.out.print("Ingrese la altura: ");
		h = scanner.nextInt();

		if (r>0 && h>0) {

			V = Math.PI *r*r*h;
			System.out.println("\nVolumen: "+V+"\n");
			
		} else {
			System.out.println("\nDebe ingresar numeros positivos\n");
		}
	}


}

