package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		String doador; 
		int idade;
		boolean primeira; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva seu nome");
		doador = leia.nextLine();
		
		System.out.println("Coloquei sua idade");
		idade = leia.nextInt();
		
		System.out.println("Coloquei se é a sua primeira doação");
		primeira = leia.nextBoolean();
			if (idade >= 18 && idade <= 59) {
				System.out.println("Você pode doar sangue");
			}
			if (idade > 69) {
				System.out.println("Você não pode doar");
		}
			if (idade >= 60 && idade <= 69) {
				if (primeira == true) {
					 System.out.println("Você está apto a doar");
				}
				 else {
					 System.out.println("Você não está apto a doar");
					 
				 }
			
		//Para doar sangue você precisa ter entre 18 e 69 anos
				
			}			
	}

}
