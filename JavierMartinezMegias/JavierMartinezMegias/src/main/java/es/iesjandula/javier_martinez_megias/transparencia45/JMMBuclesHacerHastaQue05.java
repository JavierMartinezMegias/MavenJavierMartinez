package es.iesjandula.javier_martinez_megias.transparencia45;

import java.util.Scanner;

public class JMMBuclesHacerHastaQue05 {
	public static void main(String[] args) {
		int  h;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Introduce la altura:");
			h = sc.nextInt();
		} while (h < 1);
		
		for(int i=h;i>0;i--) {
			System.out.println("");
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
		}
		sc.close();
	}

}
