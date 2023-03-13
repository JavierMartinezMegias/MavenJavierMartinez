package es.iesjandula.javier_martinez_megias.transparencia14;

import java.util.Scanner;

public class JMMVariablesJava02 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Double  x,resultado;
		
		System.out.println("Introduce la cantidad de euros: ");
		x = sc.nextDouble();
		
		resultado = x*166.386;
		
		System.out.println(x+" euros en pesetas seria: "+(resultado));	
		sc.close();
	}

}
