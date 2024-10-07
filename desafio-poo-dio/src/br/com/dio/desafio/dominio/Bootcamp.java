package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bootcamp {
    private String titulo;
    private Date dataInicio;
    private Date dataFim;
    private List<Inscricao> inscricoes;
    private List<Atividade> atividades;

    public Bootcamp(String titulo, Date dataInicio, Date dataFim) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.inscricoes = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void alterarDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void adicionarInscricao(Inscricao inscricao){
        inscricoes.add(inscricao);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void adicionarAtividade(Atividade atividade){
        atividades.add(atividade);
    }

}
