package es.iesjandula.javier_martinez_megias.transparencia9;

import java.util.Scanner;

public class JMMPrimerosPasosJava09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Double  x;
		
		System.out.println("Introduce la cantidad de euros: ");
		x = sc.nextDouble();
		
		System.out.println(x+" euros en pesetas seria: "+(x*166.386));
		sc.close();
	}
}
