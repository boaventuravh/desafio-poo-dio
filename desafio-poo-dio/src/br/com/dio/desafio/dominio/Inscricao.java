package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {
    private Dev dev;
    private Bootcamp bootcamp;
    private List<Atividade> atividadesPendentes;
    private List<Atividade> atividadesConcluidas;

    public Inscricao(Dev dev, Bootcamp bootcamp) {
        this.dev = dev;
        this.bootcamp = bootcamp;
        this.atividadesPendentes = bootcamp.getAtividades();
        this.atividadesConcluidas = new ArrayList<>();
    }

    public void concluirAtividade(Atividade atividade){
        atividadesPendentes.remove(atividade);
        atividadesConcluidas.add(atividade);
        var xpAdquirido = atividade.calcularXP();
        dev.aumentarXp(xpAdquirido);
    }
}
