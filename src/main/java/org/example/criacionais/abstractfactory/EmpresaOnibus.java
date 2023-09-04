package org.example.criacionais.abstractfactory;

import java.util.Calendar;

public abstract class EmpresaOnibus {
    public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar calendar);
    public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar calendar);

}
