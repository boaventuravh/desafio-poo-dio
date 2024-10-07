package br.com.dio.desafio.dominio;

public abstract class Atividade {
    protected String titulo;
    protected String descricao;
    protected boolean concluida;
    protected long xpAtividade;
    public long calcularXP(){
        return this.xpAtividade;
    }
}
