package com.aparelho;

import com.aparelho.appconfig.AparelhoTelefonico;
import com.aparelho.appconfig.NavegadorInternet;
import com.aparelho.appconfig.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet  {
	
	//AparelhoTelefonico
	public void ligar() {
		System.out.println("ligando...");
		
	}

	public void atender() {
		System.out.println("Atendendo ligação...");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz...");
		
	}
	
	//ReprodutorMusical
	public void tocar(){
		System.out.println("Tocando Musica...");
	}
	
	public void pausar(){
		System.out.println("Pausando Musica...");
	}
	
	public void selecionarMusica(){
		System.out.println("Selecionando Musica...");
	}
	
	//NavegadorInternet
	public void exibirPagina(){
		System.out.println("Exibindo Pagina Web...");
	}
	
	public void adicionarNovaAba(){
		System.out.println("Adicionando Nova Aba...");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina...");
	}

}
