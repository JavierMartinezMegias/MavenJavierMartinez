package es.iesjandula.javier_martinez_megias.transparencia26;

import java.util.Scanner;

public class JMMCondicionales04 {
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Introduce a:  ");
		a = sc.nextInt();
		
		System.out.print("Introduce b:  ");
		b = sc.nextInt();
		
		if(a==0)System.out.println("No existe");
		
		else if(b<0)
			System.out.println("x = "+(double)-b/a);
		
		else 
			System.out.println("x = "+(double)-b/a);
		
		sc.close();
	}

}
