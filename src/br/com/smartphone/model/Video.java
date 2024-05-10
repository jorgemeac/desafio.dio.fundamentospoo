package br.com.smartphone.model;

public class Video extends Multimidia{
    //Métodos encapsulados e herdados da classe Multimidia
    @Override
    protected void executar() {
        System.out.println("Método Encapsulado 02 - Executando o aplicativo de vídeo...");
    }

    @Override
    protected void pausar() {
        System.out.println("Método Encapsulado 03 - Aplicativo de vídeo em pausa...");
    }

    @Override
    protected void selecionar() {
        System.out.println("Método Encapsulado 04 - Selecionando vídeo...");
    }

    @Override
    protected void criarPlaylist() {
        System.out.println("Método Encapsulado 05 - Criando playlist de vídeo...");
    }

    @Override
    protected void deletarPlaylist() {
        System.out.println("Método Encapsulado 06 - Deletando playlist de vídeo...");
    }

    @Override
    protected void adicionarNaPlaylist() {
        System.out.println("Método Encapsulado 07 - Adicionando na playlist de vídeo...");
    }

    @Override
    protected void iniciarAplicacao() {
        System.out.println("Método Encapsulado 01 - Iniciando aplicativo de vídeo...");
    }

    @Override
    protected void encerrarAplicacao() {
        System.out.println("Método Encapsulado 08 - Finalizando aplicativo de vídeo...");
    }

    //Métodos públicos chamando apenas os resultados de cada método.

    public void executarVideo() {
        executar();
    }

    public void pausarVideo() {
        pausar();
    }

    public void selecionarVideo() {
        selecionar();
    }

    public void criarPlaylistVideo() {
        criarPlaylist();
    }

    public void deletarPlaylistVideo() {
        deletarPlaylist();
    }

    public void adicionarNaPlaylistVideo() {
        adicionarNaPlaylist();
    }

    public void iniciarAplicacaoVideo() {
        iniciarAplicacao();
    }

    public void encerrarAplicacaoVideo() {
        encerrarAplicacao();
    }
}
