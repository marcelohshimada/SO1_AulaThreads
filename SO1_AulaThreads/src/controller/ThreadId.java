package controller;

// extends Thread
// Par�metros s�o passados por construtor

// O m�todo run() -> s� executa o que estiver dentro

// public class ThreadId {
	// Para verificar as caracteristicas da classe, neste caso de um objeto
	// Bot�o direito > Source > Override/Implement Methods > Nesta janela mostra as caracteristicas da classe

public class ThreadId extends Thread { // ThreadId � uma classe com caracterisicas de Thread
	
	// Adiciona 'extends Thread' e salva <ctrl+s> muda as caracteristicas da classe
	// Para verificar as caracteristicas da classe, agora � ma Thread
	// Bot�o direito > Source > Override/Implement Methods > Nesta janela mostra as caracteristicas da classe
	
	private int idThread; // classe privada que receber� o valor de ThreadId(int idThread)

	public ThreadId(int idThread) { // M�todo construtor para passar os par�metros
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		// S� executa o que estiver dentro do m�todo run()
		System.out.println(idThread);
	}
	
	
	
}
