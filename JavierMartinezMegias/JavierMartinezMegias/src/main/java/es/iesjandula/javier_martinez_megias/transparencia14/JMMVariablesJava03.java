package es.iesjandula.javier_martinez_megias.transparencia14;

import java.util.Scanner;

public class JMMVariablesJava03 
{
	public static void main(String[] args) 
	{
		double precioTotal,descuento,cuantia;
		double iva;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce el precio: ");
		cuantia = sc.nextDouble();
		
		System.out.println("Introduce el el iva: ");
		iva = sc.nextDouble();

		
		descuento = (iva/100)*cuantia;
		
		precioTotal=cuantia-descuento;
		
		System.out.println("El precio a pagar es: "+precioTotal);
		sc.close();
	}

}
