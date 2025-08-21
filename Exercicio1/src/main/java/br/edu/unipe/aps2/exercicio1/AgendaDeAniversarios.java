package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
	    void adicionar(Aniversariante aniversariante);
	    void remover(Aniversariante aniversariante);
	    ArrayList<Aniversariante> listar();
}
