package aulas;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*Faça um programa que peça o nome e a senha e faça a verificação de uma 
		*variável que obtenha a senha e o usuário (como se fosse cadastrado) e retorne
		*erro caso a senha ou o usuário esteja errado. A mensagem a ser mostrada deve 
		*ser de acordo com o respectivo erro!*/
		
		/*String nomeSalvo = "Calvinho";
		String senhaSalva = "1310";
		String nome;
		String senha;
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite sua senha: ");
		senha = sc.nextLine();
		
		System.out.println("-----------------------------");
		
		if (nomeSalvo.equals(nome)) {
			System.out.println("Nome Correta!");
		}
		else {
			System.out.println("Nome Incorreta!");
		}
		
		if (senhaSalva.equals(senha)) {
			System.out.println("Senha Correta!");
		}
		else {
			System.out.println("Senha Incorreta!");
		}*/
		
		/*Peça para o usuário inserir o valor do seu salario bruto e faça o desconto de 5% do IRPF, 
		*e 11 % do INSS e mostre o salario liquido. Se o salario liquido for menor que 1200,00 o 
		*profissional receberá 5% a mais de bônus, se o salario liquido ultrapassar 3500,00 o 
		*funcionario recebera 2% a mais de bônus. */
		
		double salarioBruto = 0.0;
		double salarioLiquido = 0.0;
		double irpf = 0.11;
		double inss = 0.05;
		
		System.out.print("Informe seu salário bruto: R$ ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("---------------------------------------------");
		System.out.println("Descontos: 5% do IRPF e 11% do INSS.");
		System.out.println("Bônus: R$1200,00 receberá 5% á mais.\n "
				+ "      R$3500,00 receberá 2% á mais.");
		System.out.println("---------------------------------------------");
		
		salarioLiquido = salarioBruto - ((salarioBruto * irpf) + (salarioBruto * inss));
		
		if (salarioLiquido < 1200.00) {
			salarioLiquido += salarioLiquido * 0.05;
		}
		else if (salarioLiquido > 3500.00) {
			salarioLiquido += salarioLiquido * 0.02; 
		}
		
		System.out.println("Seu salário líquido é de R$ " + salarioLiquido + ".");
		
		
		sc.close();

	}

}
