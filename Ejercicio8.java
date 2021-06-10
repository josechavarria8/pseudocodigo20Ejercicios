import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		double promedio;

		System.out.println("Primer Numero:");
		num1 = scanner.nextInt();
		System.out.println("Segundo Numero:");
		num2 = scanner.nextInt();
		System.out.println("Tercer Numero:");
		num3 = scanner.nextInt();
		promedio = (num1+num2+num3)/3;
		System.out.println("El promedio es: "+promedio);
	}


}

