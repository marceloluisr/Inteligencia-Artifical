package com.marcelo.buscas;

import com.marcelo.estruturas_de_dados.Pilha;
import com.marcelo.mapa.Cidade;

public class Profundidade {
    private Cidade cidadeInicial;
    private Cidade cidadeFinal;
    protected Pilha fronteira; // para armazenar todas as cidades adjacentes
    private boolean achou;

    public Profundidade(Cidade cidadeInicial, Cidade cidadeFinal) {
        this.cidadeInicial = cidadeInicial;
        this.cidadeFinal = cidadeFinal;
        this.cidadeInicial.setVisitado(true);
        this.fronteira = new Pilha(20);  // 2 elevado n até numero de cidades
        this.fronteira.empilhar(this.cidadeInicial);
        this.achou = false;
    }

    public void buscar() {
        Cidade topo = this.fronteira.getTopo();
        System.out.println("Topo: " + topo.getNome());

        if (topo == this.cidadeFinal) {
            this.achou = true;
            System.out.println("<><> Objetivo encontrado! <><>");
        } else {
            topo.getAdjacentes().forEach(
                    (a) -> {
                        if (!this.achou) {
                            System.out.println("Verificando se já visitado...");
                            if (!a.getCidade().isVisitado()) {
                                a.getCidade().setVisitado(true);
                                this.fronteira.empilhar(a.getCidade());
                                this.buscar();
                            }
                        }
                    }
            );
        }

        System.out.println("Desempilhou: " + this.fronteira.desempilhar().getNome());
    }

    public void setFronteira(Pilha fronteira) {
        this.fronteira = fronteira;
    }
}


