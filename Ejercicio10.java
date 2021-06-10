import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		int altura;
		int area;
		int base;
		int perimetro;
		System.out.println("Base:");
		base = scanner.nextInt();
		System.out.println("Altura:");
		altura = scanner.nextInt();
		area = base*altura;
		perimetro = 2*(base+altura);
		System.out.println("Area: "+area);
		System.out.println("Perimetro: "+perimetro);
	}


}

