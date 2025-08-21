package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios  {
	
    private ArrayList<Aniversariante> aniversariantes;
   
    public MinhaAgendaDeAniversarios() {
	      this.aniversariantes = new ArrayList<>();
	}

	@Override
	public void adicionar(Aniversariante aniversariante) {
	    aniversariantes.add(aniversariante);
	}

	@Override
	public void remover(Aniversariante aniversariante) {
	    aniversariantes.remove(aniversariante);
	}

	@Override
	public ArrayList<Aniversariante> listar() {
	    return new ArrayList<>(aniversariantes); 
	}
}	


