package br.com.JJdev;

import br.com.JJdev.filtros.FiltraClassificacao;
import br.com.JJdev.modelos.Musica;
import br.com.JJdev.modelos.PodCast;

public class Programa {
    public static void main(String[] args) {
        Musica musica = new Musica();


        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        musica.setTitulo("Money Trees");
        musica.setArtista("Kendrick Lamar");
        musica.setDuracao("3:27");
        musica.setVolume(55);
        musica.setAlbum("Good Kid, M.A.A.D City");
        musica.exibeFichaTecnicaMusica();

        FiltraClassificacao filtra = new FiltraClassificacao();
        filtra.filtra(musica);

        PodCast podCast = new PodCast();

        for (int i = 0; i < 5000; i++) {
            podCast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podCast.curte();
        }

        podCast.setTitulo("Jefferson Dev Ep 1.");
        podCast.setDuracao("1 hora e 30 minutos");
        podCast.setDescricao("Historia de um desenvolvedor!");
        podCast.setHost("JeffCast");
        podCast.exibeFichaTecnicaPodCast(podCast);
        filtra.filtra(podCast);
    }
}
