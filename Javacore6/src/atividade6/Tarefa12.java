package atividade6;

import java.util.Scanner;

public class Tarefa12 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu Nome: ");
		String nome = sc.next();

		System.out.println("Digite o seu Sexo: ");
		String sexo = sc.next();

		String sexo01 = "Masculino";

		if (sexo.equalsIgnoreCase(sexo01)) {
			System.out.println("Ilmo Sr " + nome + " Muito Prazer");
		} else {
			System.out.println("Ilma Sra." + nome + " Muito Prazer");
		}

		sc.close();
	}
	
}
