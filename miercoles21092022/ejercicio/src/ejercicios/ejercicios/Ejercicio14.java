package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Dada una secuencia de números leídos por teclado, que acabe con un –1, por ejemplo: 
		//5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el programa que calcule la media aritmética. 
		//Suponemos que el usuario no insertará número negativos.
        
		Scanner lector = new Scanner(System.in);
		System.out.print("-*-*-*-*INGRESE LA SECUENCIA DE NUMEROS TERMINANDOLO CON UN -1 -*-*-*-*");
		System.out.print("\nINGRESE UN NUMERO : ");
		int num = lector.nextInt();
		double media=0;
		int cantidadnum=0;
		int suma=0;
		while(num>0) {
			 suma=suma+num;
			  cantidadnum ++;
			  System.out.println("INTRODUZCA OTRO NUMERO :");
			   num = lector.nextInt();
		}
		
		if(cantidadnum==0){
			System.out.println("NO SE PUEDE CALCULAR LA MEDIA");
		}else {
			media=suma/cantidadnum;
			System.out.println("LA MEDIA ES : " + media);
		}
		
		
	}

}
