package org.example.criacionais.prototype;

public class Test {

    public static void main(String[] args) {
        Partitura.carregaNotas();

        Partitura.getNota("Fa").desenha();
        Partitura.getNota("Sol").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Si").desenha();
        Partitura.getNota("La").desenha();
        Partitura.getNota("Re").desenha();
    }
}
