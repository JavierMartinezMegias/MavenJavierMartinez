package es.iesjandula.javier_martinez_megias.pract_oblig_1;

import java.util.Scanner;

public class JMMEncuentraLosTesoros {
	public static void main(String[] args) {
		int a,b,c;
        
        System.out.println("a = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        System.out.println("b = ");
        b = sc.nextInt();
        
        System.out.println("c = ");
        c = sc.nextInt();
        
        if(a>0&&a<=150&&a%13==0&&a%11==0)
        	System.out.println("Tesoro 1 encontrado");
       
        else if(a<=100&&(b<=20||b==c))
        	System.out.println("tesoro 2");
        
        else if (c>0&&c<=1500&&c%7==0&&c%13==0&&c%17==0)
        	System.out.println("tesoro 3 encontrado");
	}

}
