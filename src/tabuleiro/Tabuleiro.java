package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.pecas = new Peca[linhas][colunas];
	}
	
	public Peca peca(int linha, int coluna) {
		return this.pecas[linha][coluna];
	}
	
	public Peca peca(Position posicao) {
		return this.pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Position posicao) {
		this.pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.position = posicao;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	
		

}
