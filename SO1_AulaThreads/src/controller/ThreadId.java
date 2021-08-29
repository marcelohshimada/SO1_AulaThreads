package controller;

// extends Thread
// Parâmetros são passados por construtor

// O método run() -> só executa o que estiver dentro

// public class ThreadId {
	// Para verificar as caracteristicas da classe, neste caso de um objeto
	// Botão direito > Source > Override/Implement Methods > Nesta janela mostra as caracteristicas da classe

public class ThreadId extends Thread { // ThreadId é uma classe com caracterisicas de Thread
	
	// Adiciona 'extends Thread' e salva <ctrl+s> muda as caracteristicas da classe
	// Para verificar as caracteristicas da classe, agora é ma Thread
	// Botão direito > Source > Override/Implement Methods > Nesta janela mostra as caracteristicas da classe
	
	private int idThread; // classe privada que receberá o valor de ThreadId(int idThread)

	public ThreadId(int idThread) { // Método construtor para passar os parâmetros
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		// Só executa o que estiver dentro do método run()
		System.out.println(idThread);
	}
	
	
	
}
