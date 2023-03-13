package es.iesjandula.javier_martinez_megias.transparencia9;

import java.util.Scanner;

public class JMMPrimerosPasosJava08
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,suma,resta,mul,div,modulo;
		double pot,sumRaiz;
		
		System.out.println("Introduce el primer numero: ");
		x = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		y = sc.nextInt();
		
		suma=x+y;
		System.out.println("Resultado de la suma: "+x+" + "+y+" = "+suma);
		resta=x-y;
		System.out.println("Resultado de la resta: "+x+" - "+y+" = "+resta);
		mul=x*y;
		System.out.println("Resultado de la multiplicacion: "+x+" * "+y+" = "+mul);
		div=x/y;
		System.out.println("Resultado de la dividion: "+x+" / "+y+" = " +div);
		modulo=x%y;
		System.out.println("Resultado del resto de la division: "+x+" % "+y+" = "+modulo);
		pot=Math.pow(x, y);
		System.out.println("Resultado de la potencia: "+x+"e"+y+" = "+pot);
		sumRaiz=(double)Math.sqrt(x)+(double)Math.sqrt(y);
		System.out.println("Resultado de la suma raices: "+sumRaiz);
		
		sc.close();
	}
}
