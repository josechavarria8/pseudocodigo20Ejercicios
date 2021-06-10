import java.util.*;

public class Ejercicio6 {

	public static void main(String args[]) {

		Random random = new Random();

		int numaleat;
		double porcentaje;

		numaleat =random.nextInt(200+1);
		System.out.println("Numero aleatorio: "+numaleat);
		porcentaje = (1+0.3)*numaleat;
		System.out.println(numaleat+" aumentado un 30% es "+porcentaje);
	}


}

