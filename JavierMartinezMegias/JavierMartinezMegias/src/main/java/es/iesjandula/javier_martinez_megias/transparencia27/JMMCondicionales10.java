package es.iesjandula.javier_martinez_megias.transparencia27;

import java.util.Scanner;

public class JMMCondicionales10 {
	public static void main(String[] args) {

		int n1;

		Scanner sc = new Scanner(System.in);

		System.out.println("** INTRODUCE UN NÚMERO PARA SABER SUS CIFRAS**  ");
		n1 = sc.nextInt();

		if (n1 < 0)
			n1 = n1 * -1;

		if (n1 > 9999) {
			System.out.println("El número tiene 5 cifras");
		} else if (n1 <= 9999 && n1 > 999) {
			System.out.println("El numero tiene 4 cifras");
		} else if (n1 <= 999 && n1 > 99) {
			System.out.println("El numero tiene 3 cifras");
		} else if (n1 <= 99 && n1 > 9) {
			System.out.println("El nunero tiene 2 cifras");
		} else if (n1 <= 9) {
			System.out.println("El numero tiene una cifra");
		}

		sc.close();

	}

}
