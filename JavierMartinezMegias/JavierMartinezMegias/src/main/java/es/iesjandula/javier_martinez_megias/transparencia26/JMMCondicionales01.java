package es.iesjandula.javier_martinez_megias.transparencia26;

import java.util.Scanner;

public class JMMCondicionales01 {
	public static void main(String[] args) {
		
		int dia,lunes=1,martes=2,miercoles=3,jueves=4,viernes=5;
	
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Que dia de la semana es:\nlunes=1\nmartes=2\nmiercoles=3\njueves=4\nviernes=5 ");
		dia = sc.nextInt();
		
		if(dia==1)
			System.out.println("Base de datos");
		else if(dia==2)
			System.out.println("Programacion");
		else if(dia==3)
			System.out.println("Sistemas informaticos");
		else if(dia==4)
			System.out.println("Formacion y orientacion laboral");
		else if(dia==5)
			System.out.println("Programacion");
		else
			System.out.println("Numero no valido");
			
		sc.close();
	}

}
