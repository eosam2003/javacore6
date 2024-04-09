package atividade6;

import java.util.Scanner;

public class Tarefa10 {


	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor: ");
		int valor01 = sc.nextInt();

		if (valor01 >= 1 && valor01 <= 9) {
			System.out.println("O seu numero está dentro do permitido entre 1 e 9: " + valor01);
		} else {
			System.out.println("O seu numero não está dentro do permitido entre 1 e 9: " + valor01);
		}

		sc.close();
	}
	
}
