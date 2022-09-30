package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Realizar un programa que, dado un número entero,
		//visualice en pantalla si es par o impar. 
		//En el caso de ser 0, debe visualizar
		//“el número no es par ni impar”.

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
