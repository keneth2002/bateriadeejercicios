package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Un colegio desea saber qué porcentaje de niños y qué porcentaje de
		//niñas hay en el curso actual. Diseñar un programa para este
		//propósito.
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el numero total de alumnos : ");
		int Total = lector.nextInt();
		System.out.println("Ingrese el numero de varones en el curso :");
		int varones = lector.nextInt();
		System.out.println("Ingrese el numero de mujeres en el curso :");
		int mujeres = lector.nextInt();
		
		if(Total != varones + mujeres){
			System.out.println("EL TOTAL NO COINCIDE CON LA SUMA DE VARONES Y MUJERES, POR FAVOR INGRESARLO NUEVAMENTE");
			System.exit(0);
		}
		
	  int	pniños = (varones * Total) / 100;
	  int pniñas = (mujeres * Total) /100;
	  
	  System.out.println("El porcentaje del curso actual es : varones =  " + pniños + " % " + " mujeres= " + pniñas + " % " );
	  
	}

}
