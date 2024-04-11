package br.com.JJdev.modelos;

import br.com.JJdev.filtros.Classificacao;

public class Musica extends Audio implements Classificacao {

    private String album;

    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassficar() {
        if (getTotalDeReproducoes() >= 2000){
            return 4;
        }else if(getTotalCurtidas() >= 500) {
            return 2;
        }
        return 0;
    }

}
