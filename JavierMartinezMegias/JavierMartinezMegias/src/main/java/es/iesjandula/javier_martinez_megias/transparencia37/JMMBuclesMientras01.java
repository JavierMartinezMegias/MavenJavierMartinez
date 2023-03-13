package es.iesjandula.javier_martinez_megias.transparencia37;

import java.util.Scanner;

public class JMMBuclesMientras01 {
	public static void main(String[] args) {

		int n,cont=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero para pintar asteriscos:  ");
		n = sc.nextInt();
		
		while(n>cont) {
			System.out.print("*");
			cont++;
		}
		sc.close();
	}

}
