package br.com.smartphone.model;

public class Musica extends Multimidia{
    //Métodos encapsulados e herdados da classe Multimidia
    @Override
    protected void executar() {
        System.out.println("Método Encapsulado 02 - Executando o aplicativo de música...");
    }

    @Override
    protected void pausar() {
        System.out.println("Método Encapsulado 03 - Aplicativo de música em pausa...");
    }

    @Override
    protected void selecionar() {
        System.out.println("Método Encapsulado 04 - Selecionando música...");
    }

    @Override
    protected void criarPlaylist() {
        System.out.println("Método Encapsulado 05 - Criando playlist de música...");
    }

    @Override
    protected void deletarPlaylist() {
        System.out.println("Método Encapsulado 06 - Deletando playlist de música...");
    }

    @Override
    protected void adicionarNaPlaylist() {
        System.out.println("Método Encapsulado 07 - Adicionando na playlist de música...");
    }

    @Override
    protected void iniciarAplicacao() {
        System.out.println("Método Encapsulado 01 - Iniciando aplicativo de música...");
    }

    @Override
    protected void encerrarAplicacao() {
        System.out.println("Método Encapsulado 08 - Finalizando aplicativo de música...");
    }

    //Métodos públicos chamando apenas os resultados de cada método.

    public void executarMusica() {
        executar();
    }

    public void pausarMusica() {
        pausar();
    }

    public void selecionarMusica() {
        selecionar();
    }

    public void criarPlaylistMusica() {
        criarPlaylist();
    }

    public void deletarPlaylistMusica() {
        deletarPlaylist();
    }

    public void adicionarNaPlaylistMusica() {
        adicionarNaPlaylist();
    }

    public void iniciarAplicacaoMusica() {
        iniciarAplicacao();
    }

    public void encerrarAplicacaoMusica() {
        encerrarAplicacao();
    }

}
