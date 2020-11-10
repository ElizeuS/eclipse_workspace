package br.com.elizeu.classes;

public class FibonacciRec {

	public static int fibonacci(int n) {
		if (n < 2)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long initialTime = System.currentTimeMillis(); // inicia a contagem do tempo
	
		for(int i = 1; i <= 100; i++) {
		System.out.println(fibonacci(i));
		System.out.println("I "+ i);

		}
		long endTime = System.currentTimeMillis();// finaliza a contagem do tempo

		// O tempo total decorrido será o tempo final menos o tempo inicial
		System.out.println("Tempo total em milessegundos: " + (endTime - initialTime));
		System.out.println("Tempo total em segundos: " + (endTime - initialTime) / 1000);
	

	}

}
