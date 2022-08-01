package aulas;

public class DMatriz {

	public static void main(String[] args) {
		
		int[][] numero = new int[3][3];
		int contador = 10;
		
		for(int i = 0; i < numero.length; i++) {
			
			for(int j = 0; j < numero.length; j++) {
				
				numero[i][j] = contador;
				
				System.out.println(numero[i][j] + "\t");
				contador++;
								
			}
			System.out.println();
			
		}
		
		System.out.println("Números na diogonal: ");
		
		for(int i = 0; i < numero.length; i++) {
			
			for(int j = 0; j < numero.length; j++) {
				
				if(numero[i] == numero[j]) {
					System.out.println(numero[i][j] + "\t");
				}
				
			}
		}
		
	}

}


