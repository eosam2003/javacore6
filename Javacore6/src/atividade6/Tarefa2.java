package atividade6;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor Positivo ou Negativo: ");
		int valor01 = sc.nextInt();

		if (valor01 < 0) {
			int valor02 = valor01 * (-1);
			System.out.println("O modulo do Numero informado é : " + valor02);
		}

		sc.close();
	}
	
}
