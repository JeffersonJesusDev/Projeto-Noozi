package br.com.JJdev.modelos;

import br.com.JJdev.filtros.Classificacao;

public class PodCast extends Audio implements Classificacao {

    private String host;
    private String descricao;
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassficar() {
        if (getTotalCurtidas() >= 100){
            return 4;
        }else if(getTotalCurtidas() >= 50) {
            return 2;
        }
        return 0;
    }
}
