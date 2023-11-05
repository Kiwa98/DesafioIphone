package Iphone;

import Iphone.Sistema.Main;
import Iphone.navegador.Navegador;
import Iphone.navegador.Safari;

public class Iphone {
    public static void main(String[] args) {
        Main main = new Main();

        main.adicionarNovaAba();
        main.atender();
        main.atualizarPagina();
        main.correioVoz();
        main.pausarMusica();
        main.ligar();
        main.exibirPagina();
        main.tocarMusica();
        }
    }

