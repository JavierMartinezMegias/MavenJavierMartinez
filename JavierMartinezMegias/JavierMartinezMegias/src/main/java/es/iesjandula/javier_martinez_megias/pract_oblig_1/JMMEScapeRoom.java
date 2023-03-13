package es.iesjandula.javier_martinez_megias.pract_oblig_1;

import java.util.Scanner;

public class JMMEScapeRoom {
	public static void main(String[] args) {
		int a;
        
        System.out.println("contraseña = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
       if(a<600)
    	   if(a%13==0&&a%2==0)
    		   System.out.println("verdadera");
       
	}

}
