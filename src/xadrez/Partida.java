package xadrez;

import tabuleiro.Position;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class Partida {
	
	private Tabuleiro tabuleiro;
	
	public Partida() {
		this.tabuleiro = new Tabuleiro(8, 8);
		setupInicial();
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
	
	private void setupInicial() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCO), new Position(2, 1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETO), new Position(0, 4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCO), new Position(7, 4));
	}
	

}
