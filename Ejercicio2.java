import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);

		String capital;
		String pais;

		System.out.println("Pais: ");
		pais = scanner.nextLine();
		System.out.println("Capital: ");
		capital = scanner.nextLine();
		System.out.println(capital+" es la capital de "+pais);
	}


}

