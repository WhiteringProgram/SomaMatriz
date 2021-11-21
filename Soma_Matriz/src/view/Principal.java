package view;

import controller.SomaMatriz;

public class Principal {

	public static void main(String[] args) {
		int [][] matriz_soma = new int [3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz_soma[i][j] = (int)((Math.random() * 100) + 3);
				System.out.println(matriz_soma[i][j] + "\t");
			}
			System.out.println("");
		}
	
			for (int i = 0; i < 3; i++) {
				Thread thread = new SomaMatriz(matriz_soma[i], i);
				thread.start();
			}
	}
}
