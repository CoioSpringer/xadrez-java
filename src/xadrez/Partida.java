package xadrez;

import tabuleiro.Tabuleiro;

public class Partida {
	
	private Tabuleiro tabuleiro;
	
	public Partida() {
		this.tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PecaDeXadrez[][] getPeca(){
		PecaDeXadrez[][] matriz = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for(int j = 0; j < tabuleiro.getColunas(); j++) {
				matriz[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return matriz;
	}
	

}
