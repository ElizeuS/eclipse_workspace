package br.com.elizeu.classes;

import java.text.DecimalFormat;

public class FibonacciIterativa {

	static long fibo(int n) {
		int F = 0; // atual
		int ant = 0; // anterior

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				F = 1;
				ant = 0;
			} else {
				F += ant;
				ant = F - ant;
			}

		}

		return F;
	}

	public static void main(String[] args) {
		long initialTime = System.currentTimeMillis(); // inicia a contagem do tempo
		//DecimalFormat df = new DecimalFormat("0.###"); //Para modificar a precisão dos valores
		
		// teste do programa. Imprime os i primeiros termos
		for (int i = 1; i <= 100000; i++) {
			System.out.print("(" + i + "):" + FibonacciIterativa.fibo(i) + "\t");
		}

		float endTime = System.currentTimeMillis();// finaliza a contagem do tempo

		// O tempo total decorrido será o tempo final menos o tempo inicial
		System.out.println("Tempo total em milessegundos: " + (endTime - initialTime));
		System.out.println("Tempo total em segundos: " + (endTime - initialTime) / 1000);
		float abc = (endTime - initialTime);
		 String dx = String.format("%.4f", abc);
		System.out.println("Tempo em milisegundos: "+ dx);
	}

}
