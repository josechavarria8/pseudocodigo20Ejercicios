import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		double farenheit;
		double temperatura;

		System.out.println("Ingrese una temperatura:");
		temperatura = scanner.nextInt();
		farenheit = (temperatura*9/5)+32;
		System.out.println(temperatura+"C = "+farenheit+"F");
	}


}

