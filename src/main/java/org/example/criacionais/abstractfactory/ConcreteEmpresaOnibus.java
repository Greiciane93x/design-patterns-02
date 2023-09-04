package org.example.criacionais.abstractfactory;

import java.util.Calendar;

public class ConcreteEmpresaOnibus extends EmpresaOnibus{
    @Override
    public PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar calendar) {
        return new ConcretePassagemOnibusUrbano(origem, destino, calendar);
    }

    @Override
    public PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar calendar) {
        return new ConcretePassagemOnibusInterestadual(origem, destino, calendar);
    }
}
