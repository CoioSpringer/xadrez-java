package application;

import xadrez.Partida;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Partida partida = new Partida();
		InterfaceDoUsuario.imprimirTabuleiro(partida.getPeca());
	}

}
