package program;

import java.util.Locale;
import java.util.Scanner;

import entities.FormulaHeron;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
		FormulaHeron fh = new FormulaHeron();
		
		System.out.println("Entre com os 3 lados do triangulo é: ");
		fh.lado1 = sc.nextDouble();
		fh.lado2 = sc.nextDouble();
		fh.lado3 = sc.nextDouble();
			
		System.out.println("O valor da area do triangulo é: " 
		+ fh.CalcularAreaTriangulo());
		
		sc.close();
		
		}
		
	}


