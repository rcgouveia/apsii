package br.edu.unipe.aps2.exercicio1;


public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	
	//gets e sets...

	public Aniversariante(String nome, int dia, int mes){
		
	}
	public Aniversariante(String nome, DataAniversario dataAniversario){
		this.nome = nome;
    	this.dataAniversario = dataAniversario;
	}

	public boolean equals(Object outroAniversariante){
		if (outroAniversariante instanceof Aniversariante) {
			Aniversariante outraPessoa = (Aniversariante) outroAniversariante;
			return outraPessoa.nome == this.nome && outraPessoa.dataAniversario == dataAniversario; 
		}
		return false;
	}

}
