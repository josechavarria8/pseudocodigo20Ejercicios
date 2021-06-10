import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String args[])  {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Ingrese el primer lado:");
		a = scanner.nextInt();
		System.out.println("Ingrese el segundo lado:");
		b = scanner.nextInt();
		System.out.println("Ingrese el tercer lado:");
		c = scanner.nextInt();
		if (a==b && a==c) {
			System.out.println("El triangulo es EQUILATERO");
		} else {
			if (a!=b && a!=c && c!=b) {
				System.out.println("El triangulo es ESCALENO");
			} else {
				System.out.println("El triangulo es ISOSCELES");
			}
		}
	}


}

