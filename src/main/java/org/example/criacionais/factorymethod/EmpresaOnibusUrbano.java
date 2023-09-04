package org.example.criacionais.factorymethod;

import java.util.Calendar;

/**
 * Fábrica concreta
 */
public class EmpresaOnibusUrbano extends Empresa{
    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemOnibusUrbano(origem, destino, dataHoraPartida);
    }
}
