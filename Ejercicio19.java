import java.util.*;

public class Ejercicio19 {

	public static void main(String args[]) {
			
		Random random = new Random();

		int n;
		n = random.nextInt(1000-1)+1;
		System.out.println("Numero generado: "+n);
		if (n%5==0 && n<=25) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
	}


}

