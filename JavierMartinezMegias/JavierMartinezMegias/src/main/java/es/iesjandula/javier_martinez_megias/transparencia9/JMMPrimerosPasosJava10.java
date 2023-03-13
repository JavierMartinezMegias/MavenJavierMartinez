package es.iesjandula.javier_martinez_megias.transparencia9;

import java.util.Scanner;

public class JMMPrimerosPasosJava10 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Double  hora,dia;
		
		System.out.println("Introduce las horas trabajadas: ");
		hora = sc.nextDouble();
		System.out.println("Introduce los dias trabajados: ");
		dia = sc.nextDouble();
		
		System.out.println("El salari semanal seria de: "+(hora*12*dia));	
		sc.close();
	}

}
