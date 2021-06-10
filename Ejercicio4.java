import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		int cuadrado;
		int cubo;
		int num;

		System.out.println("Numero: ");
		num = scanner.nextInt();
		cuadrado = num*num;
		cubo = num*cuadrado;
		System.out.println("El cuadrado de "+num+" es: "+cuadrado);
		System.out.println("El cubo de "+num+" es: "+cubo);
	}


}

