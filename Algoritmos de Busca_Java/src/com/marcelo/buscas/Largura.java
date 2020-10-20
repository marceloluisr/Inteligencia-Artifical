package com.marcelo.buscas;

import com.marcelo.estruturas_de_dados.FilaCircular;
import com.marcelo.mapa.Cidade;
// Profundidade Limitada, Profundidade iterativa, Bidirecional, Estrutura de dados: Arvore
public class Largura {
    private Cidade cidadeInicial;
    private Cidade cidadeFinal;
    private FilaCircular fronteira; // para amrmazenar todas as cidades adjacentes
    private boolean achou;

    public Largura(Cidade cidadeInicial, Cidade cidadeFinal) {
        this.cidadeInicial = cidadeInicial;
        this.cidadeFinal = cidadeFinal;
        this.cidadeInicial.setVisitado(true);
        this.fronteira = new FilaCircular(20);
        this.fronteira.enfileirar(this.cidadeInicial);
        this.achou = false;
    }


    public void buscar() {
        Cidade inicioFila = this.fronteira.getInicio();
        System.out.println("Início da fila: " + inicioFila.getNome());

        if (inicioFila == this.cidadeFinal) {
            this.achou = true;
            System.out.println("<><> Objetivo encontrado! <><>");
        } else {
            Cidade temp = this.fronteira.desenfileirar();
            System.out.println("Desenfileirou: " + temp.getNome());

            inicioFila.getAdjacentes().forEach(
                    (a) -> {
                        if (!this.achou) {
                            //System.out.println("Verificando se já visitado...");
                            System.out.println(this.fronteira); // TODO
                            if (!a.getCidade().isVisitado()) {
                                a.getCidade().setVisitado(true);
                                this.fronteira.enfileirar(a.getCidade());
                                // Agora muda em relação a Busca em Profundidade
                            }
                        }
                    }
            );
            if (this.fronteira.getNumeroElementos() > 0 ) { //para evitar que não chame com nenhum elemento na fila
                this.buscar();
            }
        }

    }


}
