package arrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n;
			do {
				System.out.print("Tamaño: ");
				n = in.nextInt();
			} while (n < 10 || n > 1000000);
			int [] v = Ejercicio05.rellenarSinRepetir(n, -999999, 1000000);
		}
	}

}
