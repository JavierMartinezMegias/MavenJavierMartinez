package es.iesjandula.javier_martinez_megias.transparencia37;

import java.util.Scanner;

public class JMMBuclesMientras03 {
	public static void main(String[] args) {
		 	
		double num1, num2, resta, suma, multi, divi;
        int opcion;
        
        
	    do{
	    	 System.out.println("pulsa:");
	         System.out.println("1. sumar");
	         System.out.println("2. restar");
	         System.out.println("3. multiplicar");
	         System.out.println("4. dividir");
	         System.out.println("0. salir");
	         
	         Scanner sc = new Scanner(System.in);
	         opcion = sc.nextInt();
	         
	        
        
	        switch(opcion)
	        {
	            case 1 :
	            {                
	                
	                System.out.println("Introduce el primer numero: ");
	                num1 = sc.nextDouble();
	                
	                System.out.println("Introduce el segundo numero: ");
	                num2 = sc.nextDouble();
	                
	                suma = num1 + num2;
	                
	                System.out.println(num1+" + "+num2+" = "+suma);
	                break;
	            }
	            
	            case 2 :
	            {
	                System.out.println("Introduce el primer numero: ");
	                num1 = sc.nextDouble();
	                
	                System.out.println("Introduce el segundo numero: ");
	                num2 = sc.nextDouble();
	                
	                resta = num1 + num2;
	                
	                System.out.println(num1+" - "+num2+" = "+resta);
	                break;
	                   
	            }
	            
	            case 3 :
	            {
	                System.out.println("Introduce el primer numero: ");
	                num1 = sc.nextDouble();
	                
	                System.out.println("Introduce el segundo numero: ");
	                num2 = sc.nextDouble();
	                
	                multi = num1 * num2;
	                
	                System.out.println(num1+" * "+num2+" = "+multi);
	                break;  
	                  
	            }
	            
	            case 4 :
	            {
	                System.out.println("Introduce el primer numero: ");
	                num1 = sc.nextDouble();
	                
	                System.out.println("Introduce el segundo numero: ");
	                num2 = sc.nextDouble();
	                
	                divi = num1 / num2;
	                
	                System.out.println(num1+" / "+num2+" = "+divi);
	                break;
	                
	            }
	            
	            case 0 :
	            {
	                System.out.println("Ha salido del programa.");
	                break;
	            }
	            
	            default : 
	            {
	                System.out.println("Valor no reconocible");
	            }
	        }
	    }while(opcion!=0);
	   
	}
}
	    
	
        
	
