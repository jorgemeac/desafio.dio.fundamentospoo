package br.com.smartphone.service;

import br.com.smartphone.model.Multimidia;
import br.com.smartphone.model.Musica;
import br.com.smartphone.model.Video;

public class AplicativoVideo {
    public void executarVideo() {
        Video video = new Video(); //Instanciando
        //Executando todos os métodos para entregar em um método único
        video.iniciarAplicacaoVideo();
        video.executarVideo();
        video.pausarVideo();
        video.selecionarVideo();
        video.criarPlaylistVideo();
        video.deletarPlaylistVideo();
        video.adicionarNaPlaylistVideo();
        video.encerrarAplicacaoVideo();
    }
}
