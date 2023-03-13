package es.iesjandula.javier_martinez_megias.transparencia27;

import java.util.Scanner;

public class JMMCondicionales07 {
	public static void main(String[] args) {
		int n1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero:  ");
		n1 = sc.nextInt();

		if (n1 % 2 == 0)
			System.out.println("Es par ");
		else
			System.out.println("No es par");

		if (n1 % 5 == 0)
			System.out.println("Es divisible entre 5");
		else
			System.out.println("No es divisible entre 5");
		sc.close();
	}

}
