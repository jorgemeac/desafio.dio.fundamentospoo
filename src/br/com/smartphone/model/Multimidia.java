package br.com.smartphone.model;

public abstract class Multimidia {
    protected abstract void executar();

    protected abstract void pausar();

    protected abstract void selecionar();

    protected abstract void criarPlaylist();

    protected abstract void deletarPlaylist();

    protected abstract void adicionarNaPlaylist();

    protected abstract void iniciarAplicacao();

    protected abstract void encerrarAplicacao();
}
