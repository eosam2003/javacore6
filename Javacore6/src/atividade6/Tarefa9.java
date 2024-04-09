package atividade6;

import java.util.Scanner;

public class Tarefa9 {


	public static void main(String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite um numero: ");
		float valorParOuImpar = sc.nextFloat();
		
		if(valorParOuImpar % 2 == 1){
			System.out.println("O seu numero é Impar");
		}else {
			System.out.println("O seu numero é Par");
		}
		
		sc.close();
	}
	
}
