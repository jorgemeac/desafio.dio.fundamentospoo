package br.com.smartphone.model;

public class Telefone implements IExecutavel{
    //Métodos oriundos da interface IExecutavel
    @Override
    public void abrir() {
        System.out.println("01 - Abrir aplicativo de chamada telefônica.");
    }

    @Override
    public void selecionar() {
        System.out.println("02 - Selecionar contato na lista telefônica.");
    }

    @Override
    public void copiar() {
        System.out.println("03 - Copiar número de contato.");
    }

    public void adicionar() {
        System.out.println("04 - Adicionar/Remover contato...");
    }

    @Override
    public void salvar() {
        System.out.println("05 - Salvando novo contato...");
    }

//Métodos encapsulados próprios da própria classe Internet

    private void bloquearDesbloquearContato() {
        System.out.println("06 - Bloquear/Desbloquear contato.");
    }
//Alguns métodos públicos
    public void ligarChamada() {
        System.out.println("07 - Fazendo ligação telefônica.");
    }

    public void atenderChamada() {
        System.out.println("08 - Atendendo ligação telefônica.");
    }

    public void iniciarCaixaPostal() {
        System.out.println("09 - Caixa Postal.");
    }

    //retorno do resultado dos métodos encapsulados
    public void bloquearDesbloquearContatoTelefone() {
        bloquearDesbloquearContato();
    }

    public void fecharAbaInternet() {
        bloquearDesbloquearContato();
    }

    @Override
    public void fechar() {
        System.out.println("10 - Fechar aplicativo de chamada telefônica.");
    }
}
