package controller;

public class ThreadCalc extends Thread {

	private int a, b, op;

	public ThreadCalc(int a, int b, int op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() { // No m�todo privado, a classe principal n�o tem acesso. Ser� acessada pela
							// Thread

		int tempo = 1000; // 1000 segundos em que a thread vai ficar bloqueada

		try {
			sleep(op * tempo);
		} catch (InterruptedException e) {
			e.printStackTrace(); // printar o erro, caso tenha
		}

		int res = 0;
		String operacao = "";

		switch (op) {

		case 0:
			res = a + b;
			operacao = "+";
			break;
		case 1:
			res = a - b;
			operacao = "-";
			break;
		case 2:
			res = a * b;
			operacao = "*";
			break;
		case 3:
			res = a / b;
			operacao = "/";
			break;
		}
		// getId() mostra a Identifica��o da thread
		System.out.println("Thread ID # " + getId() + " ==> " + a + " " + operacao + " " + b + " = " + res);
	}

}
