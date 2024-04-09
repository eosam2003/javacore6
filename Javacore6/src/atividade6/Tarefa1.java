package atividade6;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro valor: ");
		int valor01 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor02 = sc.nextInt();
		
		if(valor01 > valor02) {
			System.out.println("A diferencia entre os dois valores digitados é: "+(valor01-valor02));
		}else {
			System.out.println("A diferencia entre os dois valores digitados é: "+(valor02-valor01));
		}
		
		
		sc.close();
	}
	
}
