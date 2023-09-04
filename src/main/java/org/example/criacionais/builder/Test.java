package org.example.criacionais.builder;

public class Test {

    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha();

        SanduicheBuilder b1 = new HamburguerBuilder();
        SanduicheBuilder b2 = new FishburguerBuilder();

        cozinha.fazSanduiche(b1);
        b1.getSanduiche();

        System.out.println("###########");

        cozinha.fazSanduiche(b2);
        b2.getSanduiche();
    }
}
