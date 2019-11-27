package es.Studium.ComparaTema3;

import java.util.Scanner;

public class ComparaTema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String cad1, cad2;
		
		System.out.println("Escriba una cadena");
		cad1=teclado.next();
		System.out.println("Escriba otra cadena");
		cad2=teclado.next();
		
		if (cad1.length()==cad2.length()) {
			System.out.println("Son iguales");
		}
		else if (cad1.length()<cad2.length()) {
			System.out.println("cad1 es menor que cad2");
		}
		else if (cad1.length()>cad2.length()) {
			System.out.println("cad1 es mayor que cad2");
		}
		
		
		
		teclado.close();

	}

}
