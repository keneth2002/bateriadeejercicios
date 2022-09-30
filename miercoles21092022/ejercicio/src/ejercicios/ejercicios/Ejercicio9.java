package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Modificar el programa anterior, de forma que
		//, si se teclea un cero, se vuelva a pedir 
		//el número por teclado (así hasta que se teclee un número mayor que cero).
		Scanner lector =new Scanner (System.in);
		 System.out.println("Ingrese un numero entero :");
		 int num=lector.nextInt();
		 
		 if(num==0){
			 System.out.println("El numero no es par ni impar");
			 System.exit(0);
		 }if(num  % 2 == 0){
			 System.out.println(num  +  "  Es un numero par");
		 }else {
			 System.out.println(num  +  "  Es un numero impar");
		 }
	}

}
	


