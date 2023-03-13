package es.iesjandula.javier_martinez_megias.transparencia45;

import java.util.Scanner;

public class JMMBuclesHacerHastaQue01 {
	public static void main(String[] args) {
		 int num,factorial=1;
	        
        System.out.println("Introduce un numero para calcular su factorial: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        for(int i=num;i>0;i--)
        {
            factorial *= i; 
        }
        System.out.println("El resultado es: "+factorial);
        sc.close();
	}
	
}
