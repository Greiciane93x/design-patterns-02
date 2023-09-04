package org.example.criacionais.factorymethod;

import java.util.Calendar;

/**
 * Fábrica concreta
 */
public class EmpresaOnibusInterestadual extends Empresa {
    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
    }
}
