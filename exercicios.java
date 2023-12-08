package exercicios;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		float A, B, C;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A");
		A = leia.nextFloat();
		
		System.out.println("Digite o númro B");
		B = leia.nextFloat();
		
		System.out.println("Digite o número C");
		C = leia.nextFloat();
		
		if (A+B==C) {
			System.out.println("A soma de A + B é igual a C");
		}
		
		if (A+B<C) {
			System.out.println("A soma de A + B é menor que C");
		}
		
		if (A+B>C) {
			System.out.println("A soma de A + B é maior que C");
		}
		
	
	}

}
