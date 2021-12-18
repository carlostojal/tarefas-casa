package com.carlostojal.tarefascasa.Entidades;

import java.util.Calendar;
import java.util.Date;

public class Tarefa {

    private String id;
    private String descricao;
    private Utilizador encarregado;
    private Date dataInicio;
    private boolean concluida;

    public Tarefa() {

        this.dataInicio = new Date();
        this.concluida = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Utilizador getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Utilizador encarregado) {
        this.encarregado = encarregado;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
