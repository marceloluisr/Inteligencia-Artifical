package com.marcelo.estruturas_de_dados;

import com.marcelo.mapa.Cidade;
import com.marcelo.mapa.Mapa;

import java.util.ArrayList;

public class FilaCircular {
    protected int tamanho;
    protected ArrayList<Cidade> cidades;
    protected int inicio;
    private int fim;
    private int numeroElementos;

    public FilaCircular(int tamanho) {
        this.tamanho = tamanho;
        this.cidades = new ArrayList<Cidade>(tamanho);
        this.inicio = 0;
        this.fim = -1;
        this.numeroElementos = 0;
    }

    public boolean isCheia() {
        return (this.numeroElementos == this.tamanho);
    }

    public boolean isVazia() {
        return (this.numeroElementos == 0);
    }

    public void enfileirar(Cidade cidade) {
        if (!this.isCheia()) {
            if (this.fim == this.tamanho - 1) {
                this.fim = -1; // por causa da fila circular
            }
            this.fim += 1;
            this.cidades.add(this.fim, cidade);
            this.numeroElementos += 1;
        } else {
            System.out.println("A fila está cheia!");
        }
    }

    public Cidade desenfileirar() {
        if (!isVazia()) {
            Cidade temp = this.cidades.get(this.inicio);
            this.inicio += 1;
            if (this.inicio == this.tamanho) {
                this.inicio = 0;
            }
            this.numeroElementos -= 1;
            return temp;
        } else {
            System.out.println("A fila está vazia!");
            return null;
        }
    }

    public Cidade getInicio() {
        return this.cidades.get(this.inicio);
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "cidades=" + cidades +
                '}';
    }
}


class TesteFila {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        FilaCircular fila = new FilaCircular(6);

        fila.enfileirar(mapa.getOradea());
        fila.enfileirar(mapa.getZerind());
        fila.enfileirar(mapa.getArad());
        fila.enfileirar(mapa.getSibiu());
        fila.enfileirar(mapa.getFagaras());
        fila.enfileirar(mapa.getLugoj());

        System.out.println(fila.getInicio().getNome());

        fila.desenfileirar();

        System.out.println(fila.getInicio().getNome());

        fila.desenfileirar();

        System.out.println(fila.getInicio().getNome());

    }
}