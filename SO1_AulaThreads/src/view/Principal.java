package view;

import controller.ThreadCalc;

public class Principal { // Vai chamar as Threads

	public static void main(String[] args) {
		
		// CLASSE THREADID

//		for (int idThread = 0; idThread < 5 ; idThread++) {
			
//			ThreadId threadId = new ThreadId(idThread); // ThreadId � uma classe com caracter�sticas de Thread
//			Thread threadId = new ThreadId(idThread); // Podemos descrever diretamente que threadId � uma Thread
			
//			threadId.start(); // rodar 5 Threads e printar de acordo com que cada uma termine, pode sair aleat�rio
// 			Quem come�ar primeiro termina primeiro
//		}
		
		// CLASSE THREAD CALC
		
		int a = 10;
		int b = 2;
		
		for (int op = 0 ; op < 4 ; op++) { // realizar as opera��es aleatoriamente, de acordo com a Thread
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
	}

}
