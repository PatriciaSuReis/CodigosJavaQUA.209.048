package program050822;

import java.util.ArrayList;
import java.util.Scanner;

import entities050822.Hero;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> superPoderes = new ArrayList<>();
		Hero heroi = new Hero();
		
		char option;
		
		System.out.println("Informe o nome do herói: ");
		heroi.setNomeDeHeroi(sc.nextLine());
		
		System.out.println("Qual universo pertence (marvel, dc..): ");
		heroi.setUniversoPertence(sc.nextLine());
		
		System.out.println("Informe a identidade secreta: ");
		heroi.setIdentidadeSecreta(sc.nextLine());
		
		System.out.println("Informe o planeta natal: ");
		heroi.setPlanetaNatal(sc.nextLine());
		
		System.out.println("Pertence a um grupo ou liga, qual: ");
		heroi.setPertenceAoGrupoLiga(sc.nextLine());
		
		System.out.println("Cidade natal: ");
		heroi.setCidadeNatal(sc.nextLine());
		
		System.out.println("Base secreta: ");
		heroi.setBaseSecreta(sc.nextLine());		
		
		do{			
			System.out.println("Poderes: ");
			superPoderes.add(sc.nextLine());
			
			System.out.println("Deseja cadastrar mais um poder? s(sim) ou n(não");
			option = sc.next().charAt(0);
			sc.nextLine();
		}while(Character.toUpperCase(option) == 'S');
		
		heroi.setSuperPoderes(superPoderes);
		
		System.out.println("Idade: ");
		heroi.setIdade(sc.nextInt());
		
		System.out.println("Está na ativa: s(sim) ou n(não");
		option = sc.next().charAt(0);
		
		while(Character.toUpperCase(option) != 'S' && Character.toUpperCase(option) != 'N') {
			System.out.println("Está na ativa:s(sim) ou n(não");
			option = sc.next().charAt(0);
		}
		
		switch (Character.toUpperCase(option)) {
		case 'S':
			heroi.setEstaNaAtiva(true);
			break;
			
		case 'N':
			heroi.setEstaNaAtiva(false);
			break;

		default:
			System.out.println("comando incorreto!");
			break;
		}
		System.out.println("----------------------------------------");
		System.out.println(heroi);

		sc.close();

	}


	}

