package es.iesjandula.javier_martinez_megias.transparencia28;

import java.util.Scanner;

public class JMMCondicionales12 {
	public static void main(String[] args) {
		double media, nota1, nota2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la primera nota");
		nota1 = sc.nextInt();
		System.out.println("Dame la segunda nota");
		nota2 = sc.nextInt();
		
		media = (nota1+nota2)/2;
		
		if(media >= 5)
		{
			System.out.println("Estas aprobado con un: "+media);
		}
		else 
		{
			System.out.println("Introduce el resultado de la recuperacion(apto/no apto)");
			String recuperacion = sc.next();
			
			if(recuperacion.equals("apto"))
				System.out.println("Estas aprobado con un 5");
			else
				System.out.println("No apto. Nota media:"+media);
		}
			
		
		sc.close();
				
	}

}
