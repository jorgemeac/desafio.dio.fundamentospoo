package br.com.smartphone.service;

import br.com.smartphone.model.Internet;

public class AplicativoInternet {
    public void executarInternet() {
        Internet internet = new Internet();
        internet.abrir();
        internet.selecionar();
        internet.copiar();
        internet.adicionar();
        internet.salvar();
        internet.fecharAbaInternet();
        internet.atualizarPaginaInternet();
        internet.fechar();
    }
}
