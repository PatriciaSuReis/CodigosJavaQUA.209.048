package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ativiAssincrona1 {

	public static void main(String[] args) {
		
/*Exercício:
 * Estamos em ano de eleições. A empresa "Dados Incertos" precisa fazer uma pesquisa de intenção
 * de votos para divulgar no jornal do meio dia "Jornal da meia noite ao meio dia, segunda edição".
 * Os candidatos são: Molusco, da feira do biquíni .Nelson, dizem que cuida dos fazendeiros e muitas 
 * cabeças de gado. Gomes, pela volta do coronelismo no brasil. Bolim , parece que confeitaria é sua 
 * profissão mas na verdade ele atua no ramo imobiliário.
 * Crie as variáveis necessárias para contar a quantidade de votos que cada candidato possui e mostre
 * na tela. Use a estrutura de repetição que achar melhor para essa atividade.*/

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		//variaveis
		int molusco = 0;
		int nelson = 0;
		int gomes = 0;
		int bolim = 0;
		int voto = 0;
		int qtdVotos = 0;

		System.out.println("-------------DADOS INCERTOS-----------");
		System.out.println("\nQuantos votos deseja registrar?");
			qtdVotos = sc.nextInt();
		System.out.println("--------------------------------------");
		System.out.println("Opções de votos:");
		System.out.println(" Molusco : 31");
		System.out.println(" Nelson  : 10");
		System.out.println(" Gomes   : 51");
		System.out.println(" Bolim   : 20");
		System.out.println("--------------------------------------");
		
		//contação de votos
		for (int i = 0; i < qtdVotos; i++)	{
			
			System.out.println("Qual é o seu voto?");
			voto = sc.nextInt();
			
			switch (voto) {
			
				case 31: System.out.println("Voto foi registrado!");
						 molusco++;
						 break;

				case 10: System.out.println("Voto foi registrado!");
						 nelson++;
						 break;
				
				case 51: System.out.println("Voto foi registrado!");
						 gomes++;
						 break;
				
				case 20: System.out.println("Voto foi registrado!");
						 bolim++;
						 break;
				
				default: System.out.println("Opção inválida.");
						 break;	
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Votos registrados: " + qtdVotos);
		System.out.println("\nO candidato molusco tem " + molusco + " votos.");
		System.out.println("O candidato nelson tem " + nelson + " votos.");
		System.out.println("O candidato gomes tem " + gomes + " votos.");
		System.out.println("O candidato bolim tem " + bolim + " votos.");
		
		sc.close();

	}

}
