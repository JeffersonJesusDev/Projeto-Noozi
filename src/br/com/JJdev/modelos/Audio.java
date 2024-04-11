package br.com.JJdev.modelos;

public class Audio {
    private String titulo;
    private String duracao;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int volume;


    public void exibeFichaTecnicaMusica(){
        System.out.println("Nome da Música " + getTitulo());
        System.out.println("Nome do Album: ");
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de Reproduções: " + getTotalDeReproducoes());
    }

    public void exibeFichaTecnicaPodCast(PodCast podCast){
        System.out.println();
        System.out.println("Apresentador: " + podCast.getHost());
        System.out.println("Nome do PodCast: " + getTitulo());
        System.out.println("Descrição: "+ podCast.getDescricao());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de Reproduções: " + getTotalDeReproducoes());
    }


    public void curte(){
      totalCurtidas++;
    }

    public void reproduz(){
        totalDeReproducoes++;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int setTotalDeReproducoes(int totalDeReproducoes) {
        return this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }


}
