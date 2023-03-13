package es.iesjandula.javier_martinez_megias.transparencia27;

import java.util.Scanner;

public class JMMCondicionales11 {
	public static void main(String[] args) {

		int n1, cifras = 0, primera, segunda, tercera, cuarta, quinta;

		Scanner sc = new Scanner(System.in);

		System.out.println("** INTRODUCE EL NUMERO A COMPROBAR **");
		n1 = sc.nextInt();

		if (n1 > 9999) {
			cifras = 5;
		} else if (n1 <= 9999 && n1 > 999) {
			cifras = 4;
		} else if (n1 <= 999 && n1 > 99) {
			cifras = 3;
		} else if (n1 <= 99 && n1 > 9) {
			cifras = 2;
		} else if (n1 <= 9) {
			cifras = 1;
		}

		switch (cifras) {
		case 1:
			System.out.println("Capicua");
			break;
		case 2:
			primera = n1 / 10;
			segunda = n1 % 10;
			if (primera == segunda)
				System.out.println("Capicua");
			else
				System.out.println("No capicua");
			break;
		case 3:
			primera = n1 / 100;
			tercera = n1 % 10;
			if (primera == tercera)
				System.out.println("Capicua");
			else
				System.out.println("No capicua");
			break;
		case 4:
			primera = n1 / 1000;
			n1 = n1 - (primera * 1000);
			segunda = n1 / 100;
			n1 = n1 - (segunda * 100);
			tercera = n1 / 10;
			n1 = n1 - (tercera * 10);
			cuarta = n1;

			if (primera == cuarta && segunda == tercera)
				System.out.println("Capicua");
			else
				System.out.println("No capicua");
			break;
		case 5:
			primera = n1 / 10000;
			n1 = n1 - (primera * 10000);
			segunda = n1 / 1000;
			n1 = n1 - (segunda * 1000);
			tercera = n1 / 100;
			n1 = n1 - (tercera * 100);
			cuarta = n1 / 10;
			n1 = n1 - (cuarta * 10);
			quinta = n1;

			if (primera == quinta && segunda == cuarta)
				System.out.println("Capicua");
			else
				System.out.println("No capicua");
			break;
		}

		sc.close();

	}

}
