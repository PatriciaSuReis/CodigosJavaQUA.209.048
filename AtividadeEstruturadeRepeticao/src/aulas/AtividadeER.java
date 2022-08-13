package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeER {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*1.Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o
		 * valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/

		/*double nota = 0.0;
				
		do {
			System.out.println("Digite a sua nota entre 0 e 10:");
			nota = sc.nextDouble();
			
			if (nota > 0 || nota < 10) {
				System.out.println("Nota Inválida!");
			}

		}
		while (nota < 0 || nota > 10.0);*/

		
		/*2.Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
		 * igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/
		
		/*String usuario;
		String senha; 
		
		System.out.println("Digite seu nome:");
		usuario = sc.nextLine();
		
		System.out.println("Digite sua senha:");
		senha = sc.nextLine();
		
		while (usuario.equals(senha)) {
			System.out.println("-----------------------------");
			System.out.println("Senha não permitida!");
			System.out.println("-----------------------------");
			System.out.println("Digite seu nome:");
			usuario = sc.nextLine();
			
			System.out.println("Digite sua senha:");
			senha = sc.nextLine();
		}
		System.out.println("-----------------------------");
		System.out.println("Senha aceita!");
		System.out.println("Fim do cadastro!");*/
		
		/*3.  Faça um programa que leia e valide as seguintes informações:
		 * A.Nome: maior que 3 caracteres;
		 * B.Idade:entre 0 e 150;
		 * C.Salário:maior que zero;
		 * D.Sexo:'f' ou 'm';
		 * E.Estado Civil: 's', 'c', 'v', ‘d’;*/
		
		String nome;
		int idade = 0;
		double salario = 0.0;
		char sexo;
		char estadoCivil;
		
		//nome
		System.out.print("Informe seu nome: ");
		nome = sc.nextLine();
		
		while (nome.length() < 3) {
			System.out.println("Nome não pode ter menos de 3 caracteres.");
			
			System.out.print("\nInforme seu nome: ");
			nome = sc.nextLine();
		}
		//idade
		System.out.print("Informe sua idade: ");
		idade = sc.nextInt();
		
		while (idade < 0 || idade > 150) {
			System.out.println("Idade não pode ser menos que 0 ou maior que 150.");
			
			System.out.print("\nInforme sua idade: ");
			idade = sc.nextInt();
		}
		//salário
		System.out.print("Infome seu salário: R$ ");
		salario = sc.nextDouble();
		
		while (salario <= 0) {
			System.out.println("Salário não pode ser valor 0 ou menor.");
			
			System.out.print("\nInforme seu salário: R$ ");
			salario = sc.nextDouble();
		}
		//sexo
		System.out.println("Informe seu sexo 'f'(femenino) ou 'm'(masculino): ");
		sexo = sc.next().charAt(0);
		
		while (Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) !='F' ) {
			System.out.println("Sexo não válido!");
			
			System.out.println("\nInforme seu sexo 'f'(femenino) ou 'm'(masculino): ");
			sexo = sc.next().charAt(0);
		}
		//Estado Civil
		System.out.println("Informe seu estado civil:");
		System.out.println("s- solteiro");
		System.out.println("c- casado");
		System.out.println("v- viúvo");
		System.out.println("d- divorciado");
		System.out.print("Estado civil: ");
		estadoCivil = sc.next().charAt(0);
		
		while (Character.toUpperCase(estadoCivil) != 'S' 
				&& Character.toUpperCase(estadoCivil) != 'C' 
				&& Character.toUpperCase(estadoCivil) != 'V' 
				&& Character.toUpperCase(estadoCivil) != 'D') {
			
			System.out.println("Estado civil inválido.");
			
			System.out.println("\nInforme seu estado civil:");
			System.out.println("s- solteiro");
			System.out.println("c- casado");
			System.out.println("v- viúvo");
			System.out.println("d- divorciado");
			System.out.print("Estado civil: ");
			estadoCivil = sc.next().charAt(0);
		}
		
		System.out.println("Fim do cadastro!");
		
		sc.close();

	}
	

}
