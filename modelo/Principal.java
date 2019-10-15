/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Estudante est01 = new Estudante();
        Estudante est02 = new Estudante();

        est01.setNome("Thiago");
        est01.setRA("156456-2");
        est01.setCelular("99819-4767");
        est01.setDisciplinas(new ArrayList<String>());
        est01.setNotas(new ArrayList<Integer>());
        est01.addDisciplinasNotas(est01.getDisciplinas(), est01.getNotas());
        est01.ListarNotasDiciplinas();
        est01.calculaMediaNotas();

        System.out.println("\n------------------------------------------------\n");
        est02.setNome("Marlon");
        est02.setRA("32564-4");
        est02.setCelular("95852-4544");
        est02.setDisciplinas(new ArrayList<String>());
        est02.setNotas(new ArrayList<Integer>());
        est02.addDisciplinasNotas(est02.getDisciplinas(), est02.getNotas());
        est02.ListarNotasDiciplinas();
        est02.calculaMediaNotas();
        est02.setMonitor(new ArrayList<Estudante>());
        est02.AddEstudante(est01);
        est02.ListarMonitor();

    }

}
