package es.iesjandula.javier_martinez_megias.transparencia27;

import java.util.Scanner;

public class JMMCondicionales09 {
	public static void main(String[] args) {
		
		int n1;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("** INTRODUCE UN NÚMERO PARA SABER SU PRIMERA CIFRA**  ");
		n1 = sc.nextInt();
		
		
		while (n1 > 10){
			n1 = n1 /10;
		}
		
		System.out.println("La primera cifra es: "+n1);
		
		sc.close();
	
	}

}
