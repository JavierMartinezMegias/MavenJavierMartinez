package es.iesjandula.javier_martinez_megias.transparencia45;

import java.util.Scanner;

public class JMMBuclesHacerHastaQue03 {
	public static void main(String[] args) {
		
		int x, y, suma = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Introduce el numero 1:");
			x = sc.nextInt();
		} while (x < 1);
		do {
			System.out.print("Introduce el numero 2:  ");
			y = sc.nextInt();
		} while (y < 1);
		for (int i = y; i > 0; i--) {
			suma += x;
		}
		System.out.println("El resultado es: " + suma);
		sc.close();
	}

}
