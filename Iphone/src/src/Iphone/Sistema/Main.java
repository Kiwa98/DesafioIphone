package Iphone.Sistema;

import Iphone.ligação.Chamadas;
import Iphone.musica.ReprodutorMusical;
import Iphone.navegador.Safari;


public class Main implements ReprodutorMusical, Chamadas, Safari {
    @Override
    public void ligar() {
        System.out.println("Ligando Pelo iphone");
    }

    @Override
    public void atender() {
        System.out.println("atendendo pelo Iphone");

    }

    @Override
    public void correioVoz() {
        System.out.println("Iniciando o correio de voz pelo iphone");

    }

    @Override
    public void tocarMusica() {
        System.out.println("tocando musica pelo iphone");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica pelo Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando musica pelo iphone");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina pelo iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova Aba pelo Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina pelo iphone");
    }
}
