package es.iesjandula.javier_martinez_megias.transparencia10;

import java.util.Scanner;

public class JMMPrimerosPasosJava11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double nota1, notaTrimestre, nota1Porcentaje, nota2;

		System.out.println("Introduce la nota del primer examen: ");
		nota1 = sc.nextDouble();

		System.out.println("Que nota quieres sacar en el trimestre?");
		notaTrimestre = sc.nextDouble();

		nota1Porcentaje = (nota1 * 4) / 10;

		nota2 = ((notaTrimestre - nota1Porcentaje) * 10) / (6);

		System.out.println("Para sacar un " + notaTrimestre + " necesitas sacar en el segundo examen un: " + nota2);
		sc.close();
	}

}
