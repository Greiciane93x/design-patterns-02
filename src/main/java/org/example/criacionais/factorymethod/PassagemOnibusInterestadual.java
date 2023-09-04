package org.example.criacionais.factorymethod;

import java.util.Calendar;

/**
 * Fábrica concreta
 */
public class PassagemOnibusInterestadual extends Passagem {
    public PassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    public void exibeDetalhes(){
        System.out.println("Passagem de ônibus interestadual: " + this.getOrigem() +
                " para " + this.getDestino() +
                ", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));
    }
}
