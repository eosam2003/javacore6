package atividade6;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira Nota: ");
		float nota01 = sc.nextFloat();
		System.out.println("Digite a segunda Nota: ");
		float nota02 = sc.nextFloat();
		System.out.println("Digite a terceira Nota: ");
		float nota03 = sc.nextFloat();
		System.out.println("Digite a quarta Nota: ");
		float nota04 = sc.nextFloat();

		float mediaFinal = (nota01 + nota02 + nota03 + nota04) / 4;

		if (mediaFinal >= 5) {
			System.out.println("O aluno Foi Aprovado Com a Media : " + mediaFinal);
		} else {
			System.out.println("O aluno foi Reprovado Com a Media : " + mediaFinal);
		}

		sc.close();
	}
	
}
