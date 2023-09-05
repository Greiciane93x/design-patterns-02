package org.example.estruturais.bridge;

public class ProfessorGraduacao extends Professor{

    public ProfessorGraduacao(Implementador imp){
        super(imp);
    }

    public void op() {
        System.out.println("Ol�");
        imp.opImpl();
    }
}
