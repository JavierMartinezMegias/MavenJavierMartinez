package es.iesjandula.javier_martinez_megias.transparencia27;

import java.util.Scanner;

public class JMMCondicionales08 {
	public static void main(String[] args) {
		int n1;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("** INTRODUCE UN NÚMERO PARA SABER SU ÚLTIMA CIFRA**  ");
		n1 = sc.nextInt();
		
		int num = n1%10;
		System.out.println("Su ultima cifra es: "+num);
		
		sc.close();
	}

}
