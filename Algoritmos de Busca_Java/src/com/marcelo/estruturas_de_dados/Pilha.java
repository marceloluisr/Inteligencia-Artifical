package com.marcelo.estruturas_de_dados;

import com.marcelo.mapa.Cidade;
import com.marcelo.mapa.Mapa;

import java.util.ArrayList;

public class Pilha {
    private int tamanho;
    private ArrayList<Cidade> cidades;
    public int topo;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.cidades = new ArrayList<Cidade>(tamanho);
        this.topo = -1;
    }


    public boolean isCheia() {
        return (this.topo == this.tamanho - 1);
    }

    public boolean isVazia() {
        return (this.topo == -1);
    }

    public Cidade getTopo() {
        return this.cidades.get(this.topo);
    }

    public void empilhar(Cidade cidade) {
        if (!isCheia()) {
            this.topo += 1;
            this.cidades.add(this.topo, cidade);
        } else {
            System.out.println("A pilha está cheia!");
        }
    }

    public Cidade desempilhar() {
        if (!isVazia()) {
            Cidade temp = this.cidades.get(this.topo);
            this.topo -= 1;
            return temp;
        } else {
            System.out.println("A pilha está vazia");
            return null;
        }
    }
}

class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        Mapa mapa = new Mapa();

        pilha.empilhar(mapa.getOradea());
        pilha.empilhar(mapa.getZerind());
        pilha.empilhar(mapa.getArad());
        pilha.empilhar(mapa.getSibiu());
        pilha.empilhar(mapa.getFagaras());

        System.out.println(pilha.getTopo().getNome());

        pilha.desempilhar();

        System.out.println(pilha.getTopo().getNome());


    }
}
