package com.aparelho;


public class InicializadorIphone {
	public static void main(String []args) {
		Iphone ip = new Iphone();
		
		
		System.out.println("Tela Inicial");
		
		ip.ligar();
		ip.atender();
		ip.iniciarCorreioVoz();
		
		ip.exibirPagina();
		ip.adicionarNovaAba();
		ip.atualizarPagina();
		 
		ip.tocar();
		ip.pausar();
		ip.selecionarMusica();
		
	}
}
