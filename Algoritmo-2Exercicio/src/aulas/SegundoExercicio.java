package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {
/*Atividade aula algoritmo inserção de dados via teclado*/
/*Faça um programa que peça o nome do usuario, a idade,  o sexo e um saldo 
 *bancario. Mostre os dados na tela concatenados com uma frase que faça 
 *sentido. ex.: Fulano tem 100 anos, seu sexo é M e possui a fortuna de 
 *R$ 10.00 reais no banco.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int idade = 0;
		char sexo;
		double x = 0;
		
		System.out.println("Informe seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Informe sua idade:"); 
		idade = leia.nextInt();
		
		System.out.println("Informe seu sexo F(feminino) e M(masculino):");
		sexo = leia.next().charAt(0);
		
		System.out.println("Informe seu saldo no banco:");
		x = leia.nextDouble();
		
		System.out.println("----------------------------------");
		System.out.println("O nome informado: " + nome);
		System.out.println("A idade informada: " + idade);
		System.out.println("O sexo informado: " + sexo);
		System.out.println("O saldo informado: R$ " + x);
		System.out.println("----------------------------------");
		
		System.out.println("Senhor(a) " + nome + " de " + idade + " anos do sexo " + sexo + ",\n" + "tem um saldo no banco de R$ " + x + ".");
		
		leia.close();

		
	}

}