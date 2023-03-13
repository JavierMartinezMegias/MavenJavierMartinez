package es.iesjandula.javier_martinez_megias.transparencia37;

import java.util.Scanner;

public class JMMBuclesMientras02 {
	public static void main(String[] args) {
		
		int n,al = (int)(Math.random()*10+1);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Adivina el numero entre 1 y 10:  ");
		n = sc.nextInt();
		
		while(n!=al) {
			
			if(n!=al)
				System.out.print("Prueba otra vez:  ");
			n = sc.nextInt();
		}
		
		System.out.println("Correctoo!!!!!");


		sc.close();
	}

}
