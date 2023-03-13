package es.iesjandula.javier_martinez_megias.transparencia9;

import java.util.Scanner;

public class JMMPrimerosPasosJava06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, resto;

		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();

		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();

		System.out.println("Introduce el tercero numero: ");
		num3 = sc.nextInt();

		resto=num1 * num2 * num3;
		System.out.println("Resultado de la multiplicacion: " + resto);

		sc.close();
	}

}
