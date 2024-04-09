package atividade6;

import java.util.Scanner;

public class Tarefa5 {


	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Valor A: ");
		float valorA = sc.nextFloat();
		System.out.println("Digite o Valor B: ");
		float valorB = sc.nextFloat();
		System.out.println("Digite o Valor C: ");
		float valorC = sc.nextFloat();

		float delta = (valorB * valorB) - 4 * valorA * valorC;

		if (delta > 0) {
			float x1 = (float) ((-valorB + Math.sqrt(delta)) / (2 * valorA));
			float x2 = (float) ((-valorB - Math.sqrt(delta)) / (2 * valorA));
			System.out.println("O valor de X e = " + x1 + " Valor de X e = " + x2);
		} else {
			System.out.println("\"Não e possivel calcular esta Raiz, não e um numero real \"");
		}

		sc.close();
	}
	
}
