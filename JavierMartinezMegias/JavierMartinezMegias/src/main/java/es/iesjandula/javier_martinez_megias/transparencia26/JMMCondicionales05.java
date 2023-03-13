package es.iesjandula.javier_martinez_megias.transparencia26;

import java.util.Scanner;

public class JMMCondicionales05 {
	public static void main(String[] args) {
		int hora,min,sec;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Introduce hora:  ");
		hora = sc.nextInt();
		
		System.out.print("Introduce minutos:  ");
		min = sc.nextInt();
		
		sec = (hora*3600)+(min*60);
		
		if(sec==86400)
			System.out.println("Ya es media noche");
		else
			System.out.println("Faltan: "+(86400-sec)+" segundos para media noche.");
		sc.close();
	}

}
