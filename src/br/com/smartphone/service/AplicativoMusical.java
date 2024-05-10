package br.com.smartphone.service;

import br.com.smartphone.model.Musica;

public class AplicativoMusical {
    public void executarMusica() {
        Musica musica = new Musica(); //Instanciando
        //Executando todos os métodos para entregar em um método único
        musica.iniciarAplicacaoMusica();
        musica.executarMusica();
        musica.pausarMusica();
        musica.selecionarMusica();
        musica.criarPlaylistMusica();
        musica.deletarPlaylistMusica();
        musica.adicionarNaPlaylistMusica();
        musica.encerrarAplicacaoMusica();
    }








}
