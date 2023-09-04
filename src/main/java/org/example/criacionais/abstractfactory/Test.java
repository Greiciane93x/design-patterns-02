package org.example.criacionais.abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        EmpresaOnibus viacao = new ConcreteEmpresaOnibus();
        /*
         * Emissão de passagens
         */
        PassagemOnibusUrbano passagemUrbana = viacao.emitePassagemOnibusUrbano("São Paulo", "Campinas", new GregorianCalendar(2023, Calendar.SEPTEMBER, 3, 11, 0));
        PassagemOnibusInterestadual passagemInterestadual = viacao.emitePassagemOnibusInterestadual("São Paulo", "Rio de Janeiro", new GregorianCalendar(2023, Calendar.SEPTEMBER, 3, 11, 0));


        passagemUrbana.exibeDetalhes();

        passagemInterestadual.exibeDetalhes();
    }
}
