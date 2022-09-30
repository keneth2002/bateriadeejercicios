package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Se pide representar el programa que nos calcule la suma de 
		//los N primeros números pares. Es decir, si insertamos un 5, nos haga la suma de 6+8+10+12+14.
      Scanner lector = new Scanner(System.in);
      
      System.out.println("INGRESE EL TOTAL DE NUMEROS A SUMAR :");
      int n = lector.nextInt();
      int i;
      int suma = 0;
      
      if(n<0){
     	 System.out.println("VALOR INCORRECTO, POR FAVOR INTRODUCIR UN VALOR POSITIVO");
     	 System.exit(0);
      }
      
      for(i=1;i<=n;i++) {
    	  if(i%2==0) {
    		  suma += i;
    	  }
      }
      
    
      
      System.out.println("\n la suma es : " + suma);
      
	}

}
