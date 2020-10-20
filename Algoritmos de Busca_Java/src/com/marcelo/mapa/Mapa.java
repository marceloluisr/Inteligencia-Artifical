package com.marcelo.mapa;


public class Mapa {
    private static Cidade oradea = new Cidade("Oridea", 10);
    private static Cidade zerind = new Cidade("Zerind", 20);
    private static Cidade arad = new Cidade("Arad", 30);
    private static Cidade timisoara = new Cidade("Timisoara", 100);
    private static Cidade lugoj = new Cidade("Lugoj", 2);
    private static Cidade mehadia = new Cidade("Mehadia", 5);
    private static Cidade drobeta = new Cidade("Drobeta", 8);
    private static Cidade sibiu = new Cidade("Sibiu", 40);
    private static Cidade rimmicu = new Cidade("Rimmicu Vilcea", 23);
    private static Cidade craiova = new Cidade("Craviova", 65);
    private static Cidade fagaras = new Cidade("Fagaras", 26);
    private static Cidade pitesti = new Cidade("Pitesti", 50);
    private static Cidade neamt = new Cidade("Neamt", 39);
    private static Cidade bucareste = new Cidade("Bucareste", 53);
    private static Cidade giurgiu = new Cidade("Giurgiu", 94);
    private static Cidade iasi = new Cidade("Iase", 13);
    private static Cidade vaslui = new Cidade("Vaslui", 46);
    private static Cidade urziceni = new Cidade("Urziceni", 15);
    private static Cidade hirsova = new Cidade("Hirsova", 19);
    private static Cidade eforie = new Cidade("Eforie", 85);

    public Mapa() {
        oradea.addCidadeAdjacente(new Adjacente(zerind));
        oradea.addCidadeAdjacente(new Adjacente(sibiu));

        zerind.addCidadeAdjacente(new Adjacente(oradea));
        zerind.addCidadeAdjacente(new Adjacente(arad));

        arad.addCidadeAdjacente(new Adjacente(zerind));
        arad.addCidadeAdjacente(new Adjacente(sibiu));
        arad.addCidadeAdjacente(new Adjacente(timisoara));

        timisoara.addCidadeAdjacente(new Adjacente(lugoj));
        timisoara.addCidadeAdjacente(new Adjacente(arad));

        lugoj.addCidadeAdjacente(new Adjacente(timisoara));
        lugoj.addCidadeAdjacente(new Adjacente(mehadia));

        mehadia.addCidadeAdjacente(new Adjacente(lugoj));
        mehadia.addCidadeAdjacente(new Adjacente(drobeta));

        drobeta.addCidadeAdjacente(new Adjacente(mehadia));
        drobeta.addCidadeAdjacente(new Adjacente(craiova));

        sibiu.addCidadeAdjacente(new Adjacente((oradea)));
        sibiu.addCidadeAdjacente(new Adjacente((arad)));
        sibiu.addCidadeAdjacente(new Adjacente((fagaras)));
        sibiu.addCidadeAdjacente(new Adjacente((rimmicu)));

        rimmicu.addCidadeAdjacente(new Adjacente(sibiu));
        rimmicu.addCidadeAdjacente(new Adjacente(craiova));
        rimmicu.addCidadeAdjacente(new Adjacente(pitesti));

        craiova.addCidadeAdjacente(new Adjacente(drobeta));
        craiova.addCidadeAdjacente(new Adjacente(rimmicu));
        craiova.addCidadeAdjacente(new Adjacente(pitesti));

        fagaras.addCidadeAdjacente(new Adjacente(sibiu));
        fagaras.addCidadeAdjacente(new Adjacente(bucareste));

        pitesti.addCidadeAdjacente(new Adjacente(rimmicu));
        pitesti.addCidadeAdjacente(new Adjacente(craiova));
        pitesti.addCidadeAdjacente(new Adjacente(bucareste));

        bucareste.addCidadeAdjacente(new Adjacente(fagaras));
        bucareste.addCidadeAdjacente(new Adjacente(pitesti));
        bucareste.addCidadeAdjacente(new Adjacente(giurgiu));
        bucareste.addCidadeAdjacente(new Adjacente(urziceni));

        giurgiu.addCidadeAdjacente(new Adjacente(bucareste));

        urziceni.addCidadeAdjacente(new Adjacente(bucareste));
        urziceni.addCidadeAdjacente(new Adjacente(hirsova));
        urziceni.addCidadeAdjacente(new Adjacente(vaslui));

        hirsova.addCidadeAdjacente(new Adjacente(urziceni));
        hirsova.addCidadeAdjacente(new Adjacente(eforie));

        eforie.addCidadeAdjacente(new Adjacente(hirsova));

        vaslui.addCidadeAdjacente(new Adjacente(urziceni));
        vaslui.addCidadeAdjacente(new Adjacente(iasi));

        iasi.addCidadeAdjacente(new Adjacente(vaslui));
        iasi.addCidadeAdjacente(new Adjacente(neamt));

        neamt.addCidadeAdjacente(new Adjacente(iasi));
    }

    public static Cidade getOradea() {
        return Mapa.oradea;
    }

    public static Cidade getZerind() {
        return Mapa.zerind;
    }

    public static Cidade getArad() {
        return Mapa.arad;
    }

    public static Cidade getTimisoara() {
        return Mapa.timisoara;
    }

    public static Cidade getLugoj() {
        return Mapa.lugoj;
    }

    public static Cidade getMehadia() {
        return Mapa.mehadia;
    }

    public static Cidade getDrobeta() {
        return Mapa.drobeta;
    }

    public static Cidade getSibiu() {
        return Mapa.sibiu;
    }

    public static Cidade getRimmicu() {
        return Mapa.rimmicu;
    }

    public static Cidade getCraiova() {
        return Mapa.craiova;
    }

    public static Cidade getFagaras() {
        return Mapa.fagaras;
    }

    public static Cidade getPitesti() {
        return Mapa.pitesti;
    }

    public static Cidade getNeamt() {
        return Mapa.neamt;
    }

    public static Cidade getBucareste() {
        return Mapa.bucareste;
    }

    public static Cidade getGiurgiu() {
        return Mapa.giurgiu;
    }

    public static Cidade getIasi() {
        return Mapa.iasi;
    }

    public static Cidade getVaslui() {
        return Mapa.vaslui;
    }

    public static Cidade getUrziceni() {
        return Mapa.urziceni;
    }

    public static Cidade getHirsova() {
        return Mapa.hirsova;
    }

    public static Cidade getEforie() {
        return Mapa.eforie;
    }
}

class TesteMapa{
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        System.out.println(mapa.getSibiu().getNome());
        System.out.println(mapa.getSibiu().isVisitado());

        for(int i = 0; i < mapa.getSibiu().getAdjacentes().size(); i++) {
            System.out.println(mapa.getSibiu().
                    getAdjacentes().
                    get(i).
                    getCidade().
                    getNome());
        }

    }
}
