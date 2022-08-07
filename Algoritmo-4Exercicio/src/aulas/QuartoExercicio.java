package aulas;

import java.util.Locale;
import java.util.Scanner;

public class QuartoExercicio {
//Atividade estrutura condicional
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in).useLocale(Locale.US);
			
	//1-Faça um programa que leia dois números e imprima o maior deles;

		  /*int numero1 = 0;
			int numero2 = 0;

			System.out.println("Informe o primeiro número:");
			numero1 = leia.nextInt();
			
			System.out.println("Informe o segundo número:");
			numero2 = leia.nextInt();
			
			if (numero1 > numero2){
				System.out.println("--------------------------------------------------");
				System.out.printf("Os números informados são %d e %d.\n", numero1, numero2);
				System.out.printf("O número maior é " + numero1);
			}
			else{
				System.out.println("--------------------------------------------------");
				System.out.printf("Os números informados são %d e %d.\n", numero1, numero2);
				System.out.printf("O número maior é %d.", numero2); 
			} */

	//2-Faça um programa que leia 3 números e mostre o maior deles;
		
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			
			System.out.println("Digite o primeiro número:");
			num1 = leia.nextInt();
		
			System.out.println("Digite o segundo número:");
			num2 = leia.nextInt();
		
			System.out.println("Digite o terceiro número:");
			num3 = leia.nextInt();
			
			if (num1 > num2 && num1 > num3) {
				System.out.println("--------------------------------------------------");
				System.out.printf("Os números informados são %d, %d e %d.\n", num1, num2, num3);
				System.out.printf("O número maior é %d.", num1);
			}
			else if (num2 > num3) {
				System.out.println("--------------------------------------------------");
				System.out.printf("Os números informados são %d, %d e %d.\n", num1, num2, num3);
				System.out.printf("O número maior é %d.", num2);
			}
			else {
				System.out.println("--------------------------------------------------");
				System.out.printf("Os números informados são %d, %d e %d.\n", num1, num2, num3);
				System.out.printf("O número maior é %d.", num3);
			}
			
			leia.close();
			
		}

	}
	

