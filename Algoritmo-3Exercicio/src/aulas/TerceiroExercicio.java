package aulas;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicio {
/*Atividade operadores aritméticos */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		//1-Faça um Programa que peça dois números e imprima a soma;
		
		/*int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		//Somar dos números
		soma = numero1 + numero2;
		
		System.out.println("A somar dos números: " + soma); */
		
		//2-Faça um programa que peça as 4 notas bimestrais e mostre a média.
		
		/*double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double soma = 0;
		double media = 0;
		
		System.out.println("Digite sua nota do primeiro bimestre:");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite sua nota do segundo bimestre:");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite sua nota do terceiro bimestre:");
		nota3 = leia.nextDouble();
		
		System.out.println("Digite sua nota do quarto bimestre:");
		nota4 = leia.nextDouble();
		
		//Média de notas
		soma = nota1 + nota2 + nota3 + nota4;
		media = soma / 4;
		
		System.out.println("----------------------------------");
		System.out.println("Sua média: " + media); */
		
		//3-Faça um programa que pergunte quanto você ganha por hora e o número de horas
		//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		
		/*double horaG = 0;
		int horasT = 0;
		double salario = 0;
		
		System.out.println("Quando você ganhar por hora?");
		horaG = leia.nextDouble();
		
		System.out.println("Quantas horas você trabalhar por mês?");
		horasT = leia.nextInt();
		
		//Cálculo do salário por mês
		salario = horaG * horasT;
		
		System.out.println("Seu salário total é de R$ " + salario); */
		
		//4-Faça um programa que peça a temperatura em graus Fahrenheit, transforme 
		//e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
		
		double fahrenheit = 0;
		double celsius = 0;
		
		System.out.println("Informe a temperatura em Fahrenheit:");
		fahrenheit = leia.nextDouble();
		
		//Cálculo de Fahrenheit para Celsius
		celsius = 5 * ((fahrenheit - 32) / 9);
		
		System.out.println("-----------------------------------------------");
		System.out.println("O valor convertido para Celsius: " + celsius);
		System.out.printf("A temperatura em Celsius: %.2f" , celsius);
		
		leia.close();
	}
	
}

