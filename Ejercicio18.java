import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String args[]) {

	
		Scanner scanner = new Scanner(System.in);

		int d1=0, d2=0, d3=0, d4=0, num, suma;
		String numTxt;

		System.out.print("\nIngrese un numero de cuatro digitos o menos: ");
		num = scanner.nextInt();

		numTxt = ""+num;

		if (num<10) {
			d4 = Integer.parseInt(numTxt.substring(0,1));

		} else if (num<100) {
			d3 = Integer.parseInt(numTxt.substring(0,1));
			d4 = Integer.parseInt(numTxt.substring(1,2));

		} else if (num<1000) {
			d2 = Integer.parseInt(numTxt.substring(0,1));
			d3 = Integer.parseInt(numTxt.substring(1,2));
			d4 = Integer.parseInt(numTxt.substring(2,3));

		} else if (num<10000) {
			d1 = Integer.parseInt(numTxt.substring(0,1));
			d2 = Integer.parseInt(numTxt.substring(1,2));
			d3 = Integer.parseInt(numTxt.substring(2,3));
			d4 = Integer.parseInt(numTxt.substring(3,4));

		} else {
			System.out.println("\nDebe ingresar un numero de 4 digitos o menos\n");
		}

		suma = d1+d2+d3+d4;

		System.out.println("\nd1 = "+d1+",  d2 = "+d2+",  d3 = "+d3+",  d4 = "+d4);
		System.out.println("Suma: "+suma+"\n");
}


}

