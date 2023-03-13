package es.iesjandula.javier_martinez_megias.transparencia26;

import java.util.Scanner;

public class JMMCondicionales02 {
	public static void main(String[] args) {
		
		int hora;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Que hora del dia es?:  ");
		hora = sc.nextInt();
		
		if(hora>=6&&hora<=12)
			System.out.println("Buenos dias");
		else if(hora>=13&&hora<=20)
			System.out.println("Buenas tardes");
		else if(hora==21||hora==5||hora==4||hora==3||hora==2||hora==1||hora==0||hora==22||hora==23)
			System.out.println("Buenas noches");
		else
			System.out.println("Hora no valida");
		sc.close();
	}
}
