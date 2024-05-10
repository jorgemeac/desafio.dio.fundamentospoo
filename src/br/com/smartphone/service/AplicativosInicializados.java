package br.com.smartphone.service;

public class AplicativosInicializados {
    public void abrirAplicativos() {
        AplicativoMusical aplicativoMusical = new AplicativoMusical();
        System.out.println("01 - UTILIZANDO O APP DE MÚSICA.");
        aplicativoMusical.executarMusica();
        System.out.println(" ");

        AplicativoVideo aplicativoVideo = new AplicativoVideo();
        System.out.println("02 - UTILIZANDO O APP DE VÍDEO.");
        aplicativoVideo.executarVideo();
        System.out.println(" ");

        AplicativoInternet aplicativoInternet = new AplicativoInternet();
        System.out.println("03 - UTILIZANDO O APP DE INTERNET.");
        aplicativoInternet.executarInternet();
        System.out.println(" ");

        AplicativoTelefone aplicativoTelefone = new AplicativoTelefone();
        System.out.println("04 - UTILIZANDO O APP DE CHAMADAS.");
        aplicativoTelefone.executarTelefone();
    }
}
