package com.marcelo.buscas;

import com.marcelo.mapa.Cidade;

import java.util.PriorityQueue;

public class CustoUniforme {
    private Cidade cidadeInicial;
    private Cidade cidadeFinal;
    private PriorityQueue<Cidade> fronteira;
    private boolean achou;

    public CustoUniforme(Cidade cidadeInicial, Cidade cidadeFinal) {
        this.cidadeInicial = cidadeInicial;
        this.cidadeFinal = cidadeFinal;
        this.cidadeInicial.setVisitado(true);
        this.fronteira = new PriorityQueue<>(20);
        this.fronteira.add(this.cidadeInicial);
        this.achou = false;
    }


    public void buscar() {
        Cidade inicioFila = this.fronteira.element();
        System.out.println("Início da fila: " + inicioFila.getNome());

        if (inicioFila == this.cidadeFinal) {
            this.achou = true;
            System.out.println("<><> Objetivo encontrado! <><>");
        } else {
            Cidade temp = this.fronteira.remove();
            System.out.println("Desenfileirou: " + temp.getNome());

            inicioFila.getAdjacentes().forEach(
                    (a) -> {
                        if (!this.achou) {
                            //System.out.println("Verificando se já visitado...");
                            System.out.println(this.fronteira); // TODO
                            if (!a.getCidade().isVisitado()) {
                                a.getCidade().setVisitado(true);
                                this.fronteira.add(a.getCidade());
                                // Agora muda em relação a Busca em Profundidade
                            }
                        }
                    }
            );
            if (this.fronteira.size() > 0 ) {
                this.buscar();
            }
        }

    }

}
