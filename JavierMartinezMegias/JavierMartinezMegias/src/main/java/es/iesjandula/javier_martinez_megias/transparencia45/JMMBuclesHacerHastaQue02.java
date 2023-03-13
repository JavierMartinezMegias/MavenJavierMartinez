package es.iesjandula.javier_martinez_megias.transparencia45;

import java.util.Scanner;

public class JMMBuclesHacerHastaQue02 {
	public static void main(String[] args) {

		int x, y, suma = 1;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Introduce el numero base:");
			x = sc.nextInt();
		} while (x < 1);
		do {
			System.out.print("Introduce el exponente:  ");
			y = sc.nextInt();
		} while (y < 1);
		for (int i = y; i > 0; i--) {
			suma *= x;
		}
		System.out.println("El resultado es: " + suma);
		sc.close();
	}
}
