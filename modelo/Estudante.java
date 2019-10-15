/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Estudante {

    private String nome;
    private String RA;
    private String celular;
    private ArrayList<String> disciplinas;
    private ArrayList<Integer> notas;
    private ArrayList<Estudante> monitor;

    public Estudante() {
    }

    public ArrayList<Estudante> getMonitor() {
        return monitor;
    }

    public void setMonitor(ArrayList<Estudante> monitor) {
        this.monitor = monitor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    void addDisciplinasNotas(ArrayList<String> disciplinas, ArrayList<Integer> notas) {
        Scanner entrada = new Scanner(System.in);
        String dic;
        int not;
        System.out.println("INF DISCIPLINA E NOTAS");
        for (int i = 0; i <= 4; i++) {
            System.out.println("\nInforme a " + (i + 1) + "ª Disciplina do Aluno " + this.nome + " :");
            dic = entrada.next();
            disciplinas.add(dic);
            System.out.println("Informe a nota nessa Disciplina: ");
            not = entrada.nextInt();
            notas.add(not);
        }
        System.out.println("\n");
    }

    void ListarNotasDiciplinas() {
        System.out.print("LISTA ALUNO " + this.nome);
        for (int i = 0; i < disciplinas.size(); i++) {

            System.out.println("\n" + (i + 1) + "ª Disciplina: " + disciplinas.get(i) + " - Nota: " + notas.get(i));

        }

    }

    void calculaMediaNotas() {

        float total, not = 0;
        for (int i = 0; i < this.disciplinas.size(); i++) {
            not = not + this.notas.get(i);
        }
        total = not / 5;
        System.out.println("\n\nMedia da Notas do aluno " + this.nome + ": " + total);
    }

    void AddEstudante(Estudante AddList) {
        monitor.add(AddList);
    }

    void ListarMonitor() {
        System.out.print("\nLISTA DE MONITORADOS PELO ALUNO " + this.nome);
        for (int i = 0; i < monitor.size(); i++) {

            System.out.println("\n-" + this.nome + " Monitora o Aluno: " + monitor.get(i).nome);

        }
    }
}
