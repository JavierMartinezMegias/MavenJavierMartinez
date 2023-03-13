package es.iesjandula.javier_martinez_megias.transparencia45;

import java.util.Scanner;

public class JMMBuclesHacerHastaQue04 {
	public static void main(String[] args) {
		int x, y, suma,cont=1;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Introduce el numero base:");
			x = sc.nextInt();
		} while (x < 1);
		do {
			System.out.print("Introduce el exponente:  ");
			y = sc.nextInt();
			suma=x;
		} while (y < 1);
		do {
			suma =- y;
			cont++;
		}while(suma>=0);
		
	
		System.out.println("El cociente es: " + cont+" y el resto: "+(suma*(-1)));
		sc.close();
	}

}
