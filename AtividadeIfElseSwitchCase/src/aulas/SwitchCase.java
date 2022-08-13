package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*Faça um programa que peça ao usuário para escolher o item de um menu e a quantidade:
		*(apenas 1 item)
		*1 - sanduiche natureba
		*2 - Sanduba Bomba
		*3 - Coxinha de Jaca
		*4 - Feijoada vegetariana*/
		
		/*int intemSelecionado = 0;
		int quantidade = 0;
		
		System.out.println("-------------------------------");
		System.out.println("            Menu:              ");
		System.out.println("1 - sanduiche natureba         ");
		System.out.println("2 - Sanduba Bomba              ");
		System.out.println("3 - Coxinha de Jaca            ");
		System.out.println("4 - Feijoada vegetariana       ");
		System.out.println("-------------------------------");
		
		System.out.print("Qual é o seu pedido: ");
		intemSelecionado = sc.nextInt();
		
		System.out.print("Quantas quantidades: ");
		quantidade = sc.nextInt(); 
		
		System.out.println("--------------------------------");
		
		switch (intemSelecionado) {
	
		case 1: System.out.println("Seu pedido: Sanduiche natureba");
			    System.out.println("Quantidade: " + quantidade);
	            break;
	            
		case 2: System.out.println("Seu pedido: Sanduba Bomba");
	    		System.out.println("Quantidade: " + quantidade);
	    		break;
        
		case 3: System.out.println("Seu pedido: Coxinha de Jaca");
	    		System.out.println("Quantidade: " + quantidade);
	    		break;
        
		case 4: System.out.println("Seu pedido: Feijoada vegetariana");
	    		System.out.println("Quantidade: " + quantidade);
	    		break;		        
		}*/
			
		/*Faça um programa que peça ao usuário para digitar um numero entre 1 e 7  não podendo
		 *ser maior e nem menor. O numero que a pessoa escolher representará um dia da semana
		 *(a semana começa no domingo).*/
		
		int numero = 0;
		
		System.out.print("Digite um número entre 1 e 7: ");
		numero = sc.nextInt();
		System.out.println("--------------------------------");
		
		switch (numero) {
		
			case 1: System.out.println("O dia da semana é Domigo!");
					break;
			
			case 2: System.out.println("O dia da semana é Segunda-feira!");
					break;
					
			case 3: System.out.println("O dia da semana é Terça-feira!");
					break;
					
			case 4: System.out.println("O dia da semana é Quarta-feira!");
					break;
					
			case 5: System.out.println("O dia da semana é Quinta-feira!");
					break;
					
			case 6: System.out.println("O dia da semana é Sexta-feira!");
					break;
					
			case 7: System.out.println("O dia da semana é Sábado!");
					break;
		
			default: System.out.println("Opção Inválida!");
						
		}
		
		sc.close();
	}

}
