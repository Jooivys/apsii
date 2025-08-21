package br.edu.unipe.aps2.exercicio1;
 

public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	
	public Aniversariante(String nome, DataAniversario dataAniversario) {
	      this.nome = nome;
	      this.dataAniversario = dataAniversario;
	}
	
	public Aniversariante(String nome, int dia, int mes) {
	     this.nome = nome;
	     this.dataAniversario = new DataAniversario(dia, mes);
	}

	public boolean equals(Object outroAniver){
		if (outroAniver instanceof Aniversariante){
			Aniversariante outroAniversariante = (Aniversariante) outroAniver;
			return (outroAniversariante.nome == this.nome && outroAniversariante.dataAniversario == this.dataAniversario);
		}
		return false;
	}
	
	public String toString(){
		return this.nome+";"+this.dataAniversario;
	}
	
}


