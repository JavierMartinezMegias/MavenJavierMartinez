package es.iesjandula.javier_martinez_megias.transparencia9;

import java.util.Scanner;

public class JMMPrimerosPasosJava07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x,resultado;
		
		System.out.println("Introduce el valor de X: ");
		x = sc.nextInt();
		
		resultado=(x*x)+x+1;
			
		System.out.println("Resultado de f=x^2+x+1: "+resultado);
		
		sc.close();
	}

}
