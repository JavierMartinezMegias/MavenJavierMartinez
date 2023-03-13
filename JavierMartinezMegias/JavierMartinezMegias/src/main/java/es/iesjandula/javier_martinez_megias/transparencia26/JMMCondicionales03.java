package es.iesjandula.javier_martinez_megias.transparencia26;

import java.util.Scanner;

public class JMMCondicionales03 {
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Introduce un numero del 1 al 7:  ");
		n = sc.nextInt();
		
		switch(n) {
			case 1:{
				System.out.println("Es Lunes");
				break;
			}
			case 2:{
				System.out.println("Es Martes");
				break;
			}
			case 3:{
				System.out.println("Es Miercoles");
				break;
			}
			case 4:{
				System.out.println("Es Jueves");
				break;
			}
			case 5:{
				System.out.println("Es Viernes");
				break;
			}
			case 6:{
				System.out.println("Es Saabado");
				break;
			}
			case 7:{
				System.out.println("Es Domingo");
				break;
			}
		}
		
		sc.close();
	}

}
