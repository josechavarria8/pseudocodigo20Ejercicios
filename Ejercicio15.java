import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String args[]) {
		

		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Ingrese un numero:");
		num = scanner.nextInt();
		if (num==0) {
			System.out.println("El numero es nulo.");
		} else {
			if (num>0) {
				System.out.println("El numero es positivo.");
			} else {
				System.out.println("El numero es negativo.");
			}
		}
	}


}

