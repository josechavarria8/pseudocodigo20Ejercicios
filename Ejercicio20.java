import java.util.Scanner;


public class Ejercicio20 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int num;
		String d1, d2, d4, d5;
		
		System.out.print("\nIngrese un numero de 5 digitos: ");
		num = scanner.nextInt();
		
		if (num<100000 && num>0) {

			d1 = (""+num).substring(0,1);
			d2 = (""+num).substring(1,2);
			d4 = (""+num).substring(3,4);
			d5 = (""+num).substring(4,5);

			if (d1.equals(d5) && d2.equals(d4)) {
				System.out.println("\nEs Capicua\n");

			} else {
				System.out.println("\nNo es Capicua\n");

			}
			
		} else {
			System.out.println("\nEl numero debe tener 5 digitos.\n");
		}
	}


}

