package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private List<Aniversariante> listaAniversariantes;

    
    public MinhaAgendaDeAniversarios() {
        this.listaAniversariantes = new ArrayList<>();
    }

    public void adicionar(Aniversariante aniversariante) {
        listaAniversariantes.add(aniversariante);
    }

    public void remover(Aniversariante aniversariante) {
        listaAniversariantes.remove(aniversariante);
    }

    public List<Aniversariante> listarTodos() {
        return new ArrayList<>(listaAniversariantes);
    }

    public List<Aniversariante> buscarPorMes(int mes) {
        List<Aniversariante> resultado = new ArrayList<>();
        for (Aniversariante a : listaAniversariantes) {
            if (a.getDataAniversario().getMes() == mes) {
                resultado.add(a);
            }
        }
        return resultado;
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
        adicionar(aniversariante);
    }

    @Override
    public void removerAniversariante(String nome) {
        listaAniversariantes.removeIf(a -> a.getNome().equals(nome));
    }

    public List<Aniversariante> obterAniversariantesDoDia(int dia, int mes) {
        List<Aniversariante> resultado = new ArrayList<>();
        for (Aniversariante a : listaAniversariantes) {
            if (a.getDataAniversario().getDia() == dia && a.getDataAniversario().getMes() == mes) {
                resultado.add(a);
            }
        }
        return resultado;
    }
}
