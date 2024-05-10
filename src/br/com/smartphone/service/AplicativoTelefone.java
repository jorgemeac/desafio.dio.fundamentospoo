package br.com.smartphone.service;

import br.com.smartphone.model.Telefone;

public class AplicativoTelefone {
    public void executarTelefone() {
        Telefone telefone = new Telefone();
        telefone.abrir();
        telefone.selecionar();
        telefone.copiar();
        telefone.adicionar();
        telefone.salvar();
        telefone.bloquearDesbloquearContatoTelefone();
        telefone.ligarChamada();
        telefone.atenderChamada();
        telefone.iniciarCaixaPostal();
        telefone.fechar();
    }



}
