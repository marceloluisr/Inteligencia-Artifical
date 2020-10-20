package com.marcelo.mapa;

import java.util.ArrayList;

public class Cidade implements Comparable<Cidade>{
    private String nome;
    private boolean visitado;
    private ArrayList<Adjacente> adjacentes;
    private int custo;

    public Cidade(String nome) {
        this.nome = nome;
        this.visitado = false;
        this.adjacentes = new ArrayList<>();
    }

    public Cidade(String nome, int custo) {
        this.nome = nome;
        this.visitado = false;
        this.adjacentes = new ArrayList<>();
        this.custo = custo;
    }

    public void addCidadeAdjacente(Adjacente c) {
        this.adjacentes.add(c);
    }

    public String getNome() {
        return nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public ArrayList<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getCusto() {
        return custo;
    }

    @Override
    public int compareTo(Cidade c) {
        if (this.getCusto() > c.getCusto()) {
            return 1;
        } else if(this.getCusto() < c.getCusto()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", custo=" + custo +
                '}';
    }
}
