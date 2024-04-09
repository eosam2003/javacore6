package atividade6;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da Primeira Nota: ");
		float valorNota01 = sc.nextFloat();
		System.out.println("Digite o Valor da segunda Nota: ");
		float valorNota02 = sc.nextFloat();
		System.out.println("Digite o Valor da Terceira Nota: ");
		float valorNota03 = sc.nextFloat();
		System.out.println("Digite o Valor da Quarta Nota: ");
		float valorNota04 = sc.nextFloat();

		float valorNotaFinal = (valorNota01 + valorNota02 + valorNota03 + valorNota04) / 4;

		if (valorNotaFinal >= 7) {
			System.out.println("O aluno foi APROVADO sem Exame com a MEDIA : " + valorNotaFinal);
		} else if (valorNotaFinal < 7) {
			System.out.println("Digite o Valor da Nota do EXAME : ");
			float valorNotaExame = sc.nextFloat();
			float valorNotaFinalComExame = (valorNotaFinal + valorNotaExame) / 2;
			System.out.println("Media do aluno com o exame: " + valorNotaFinalComExame);
			if (valorNotaFinalComExame >= 5) {
				System.out.println("O aluno Foi APROVADO com a Media do Exame: " + valorNotaFinalComExame);
			} else {
				System.out.println("O aluno foi REPROVADO mesmo com a MEDIA do exame: " + valorNotaFinalComExame);
			}
		}

		sc.close();
	}
	
}
