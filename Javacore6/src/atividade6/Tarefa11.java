package atividade6;

import java.util.Scanner;

public class Tarefa11 {

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
		
	System.out.println("Digite um Valor: ");
	int valor01 = sc.nextInt();
	
	if(valor01 <= 3) {
		System.out.println("Valor digitado: "+valor01);
	}

	sc.close();	
	}
	
}
