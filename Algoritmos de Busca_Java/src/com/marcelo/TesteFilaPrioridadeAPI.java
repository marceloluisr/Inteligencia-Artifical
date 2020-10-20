package com.marcelo;

import com.marcelo.mapa.Cidade;
import com.marcelo.mapa.Mapa;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TesteFilaPrioridadeAPI {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Queue<Cidade> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(mapa.getOradea());
        filaComPrioridade.add(mapa.getZerind());
        filaComPrioridade.add(mapa.getArad());
        filaComPrioridade.add(mapa.getTimisoara());

        System.out.println(filaComPrioridade);


    }
}
