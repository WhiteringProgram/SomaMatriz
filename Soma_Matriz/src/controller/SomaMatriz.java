package controller;

public class SomaMatriz extends Thread {

	private int [] linha;
	private int numLinha;
	
	public SomaMatriz (int [] linha, int numLinha) {
		this.linha = linha;
		this.numLinha = numLinha;
	}
	
	public void run() {
		somaLinha();
	}

	private void somaLinha() {
		int s = 0;
		for (int i: linha) {
			s += i;
		}
		System.out.println("Linha #"+numLinha+" tem soma igual a " + s);
	}
	
}
