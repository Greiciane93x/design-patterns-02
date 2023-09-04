package org.example.criacionais.factorymethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {

        /*
         * Empresas de ônibus
         */
        Empresa empresaViacaoUrbana = new EmpresaOnibusUrbano();
        Empresa empresaViacaoInterestadual = new EmpresaOnibusInterestadual();

        /*
         * Emissão de passagens
         */
        Passagem passagemUrbana = empresaViacaoUrbana.emitePassagem("São Paulo", "Campinas", new GregorianCalendar(2023, Calendar.SEPTEMBER, 3, 11, 0));
        Passagem passagemInterestadual = empresaViacaoInterestadual.emitePassagem("São Paulo", "Rio de Janeiro", new GregorianCalendar(2023, Calendar.SEPTEMBER, 3, 11, 0));


        passagemUrbana.exibeDetalhes();

        passagemInterestadual.exibeDetalhes();

    }
}
