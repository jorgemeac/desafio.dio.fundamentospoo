package br.com.smartphone.model;

public class Internet implements IExecutavel {
//Métodos oriundos da interface IExecutavel
    @Override
    public void abrir() {
        System.out.println("01 - Abrir aplicativo de Internet.");
    }

    @Override
    public void selecionar() {
        System.out.println("02 - Selecionar texto no navegador de Internet.");
    }

    @Override
    public void copiar() {
        System.out.println("03 - Copiar texto do navegador de Internet.");
    }

    public void adicionar() {
        System.out.println("04 - Adicionar nova Aba...");
    }

    @Override
    public void salvar() {
        System.out.println("05 - Salvando imagem no navegador de Internet.");
    }

//Métodos encapsulados próprios da própria classe Internet

    private void fecharAba() {
        System.out.println("06 - Fechando a Aba de Internet.");
    }

    private void atualizarPagina() {
        System.out.println("07 - Apertando F5 para atualizar a página de Internet.");
    }

//retorno do resultado dos métodos encapsulados
    public void atualizarPaginaInternet() {
        atualizarPagina();
    }

    public void fecharAbaInternet() {
        fecharAba();
    }

    @Override
    public void fechar() {
        System.out.println("08 - Fechar aplicativo de Internet.");
    }
}
