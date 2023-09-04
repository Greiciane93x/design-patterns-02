package org.example.criacionais.abstractfactory;

import org.example.criacionais.factorymethod.Passagem;

import java.util.Calendar;

/**
 * Fábrica concreta
 */
public class PassagemOnibusUrbano extends Passagem {
    public PassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Passagem de ônibus urbano: " + this.getOrigem() +
                " para " + this.getDestino() +
                ", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));
    }
}
