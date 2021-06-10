import java.util.*;

public class Ejercicio7 {

	public static void main(String args[]) {
		
		Random random = new Random();


		int numaleat;
		double porcentaje;

		numaleat = random.nextInt(51-10)+10;
		System.out.println("Numero aleatorio: "+numaleat);
		porcentaje = (1-0.15)*numaleat;
		System.out.println(numaleat+" disminuido un 15% es "+porcentaje);
	}


}

