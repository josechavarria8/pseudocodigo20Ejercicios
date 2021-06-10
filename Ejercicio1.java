import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		int suma;

		System.out.println("Primer numero: ");
		num1 = scanner.nextInt();
		System.out.println("Segundo numero");
		num2 = scanner.nextInt();
		suma = num1+num2;
		System.out.println("La suma de "+num1+" y "+num2+" es:  "+suma);
	}


}

