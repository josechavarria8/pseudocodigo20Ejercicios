import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);

		String a;
		String aux;
		String b;

		System.out.println("Escriba la primer palabra:");
		a = scanner.nextLine();
		System.out.println("Escriba la segunda palabra:");
		b = scanner.nextLine();
		aux = a;
		a = b;
		b = aux;
		System.out.println("El nuevo orden de las palabras es:");
		System.out.println(a);
		System.out.println(b);
	}


}

