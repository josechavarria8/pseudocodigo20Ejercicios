import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);

		double metros;
		int num;
		double pies;
		double pulgadas;
		double yardas;

		System.out.println("Ingrese un numero: ");
		num = scanner.nextInt();
		yardas = num/91.44;
		metros = num/100;
		pies = num/30.48;
		pulgadas = num/2.54;
		System.out.println(num+" cm es igual a: ");
		System.out.println(yardas+" yardas");
		System.out.println(metros+" metros");
		System.out.println(pies+" pies");
		System.out.println(pulgadas+" pulgadas");
	}


}

