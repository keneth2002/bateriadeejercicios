package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Se pide representar el programa que nos calcule la 
		//suma de los N primeros números naturales. N se leerá por teclado.
      Scanner lector = new Scanner(System.in);
      System.out.println("INGRESE EL TOTAL DE NUMEROS A SUMAR :");
      int n = lector.nextInt();
      int cont = 1;
      int suma = 0;
      
     if(n<0){
    	 System.out.println("VALOR INCORRECTO, POR FAVOR INTRODUCIR UN VALOR POSITIVO");
    	 System.exit(0);
     }
      
      
      
      while(cont <= n) {
    	  suma += cont;
    	  cont ++;
      }
      
      System.out.println("\n la suma es : " + suma);
      
	}

}
