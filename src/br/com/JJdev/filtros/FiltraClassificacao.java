package br.com.JJdev.filtros;

public class FiltraClassificacao {
    private String classificado;
    public void filtra(Classificacao classificacao){
        if (classificacao.getClassficar() >= 4){
            System.out.println("\nEstá entre os preferidos do momento!");
        } else if (classificacao.getClassficar() >= 2){
            System.out.println("\nMuito bem avaliado no momento!");
        } else {
            System.out.println("\nColoque na lista para escutar depois!");
        }
    }
}
