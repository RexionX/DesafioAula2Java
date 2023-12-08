package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomeColaborador; 
		int codigoCargo; 
		Float salario;
		
		System.out.println("Escreva seu nome");
		nomeColaborador = leia.next();
		
		System.out.println("Escreva o Código do Cargo");
		codigoCargo = leia.nextInt();
		
		System.out.println("Escreva o seu Salário");
		salario = leia.nextFloat();
		
		switch (codigoCargo) {
		case 1: 
			System.out.println("Código do Cargo: 1");
			System.out.println(salario +  ((10f * salario)/100));
			break; 
		case 2: 
			System.out.println("Código do Cargo: 2");
			System.out.println(salario + ((7 * salario)/100));
			break;
		case 3: 
			System.out.println("Código do Cargo: 3");
			System.out.println(salario + ((9 * salario)/100));
			break;
		case 4: 
			System.out.println("Código do Cargo: 4");
			System.out.println(salario + ((6 * salario)/100));
			break;
		case 5: 
			System.out.println("Código do Cargo: 5");
			System.out.println(salario +  ((5 * salario)/100));
			break;
		case 6: 
			System.out.println("Código do Cargo: 6");
			System.out.println(salario + ((8 * salario)/100));
			break;
		default:
			System.out.println("Opção invalida");
			
		}
	}

}
