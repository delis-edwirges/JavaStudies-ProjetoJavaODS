package br.com.generation.cadastro;

public class ClasseCadastro {
	
	private String nome;
	private int idade;
	private String g�nero;
	private double peso;
	private double altura;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int string) {
		this.idade = string;
	}
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void Impressao() {
		System.out.println("\t=============IMC da Crian�a============\n"
				+ "\n\tNome: " + nome + "\n\tIdade: " + idade
				+ "\n\tG�nero: " + g�nero + "\n\tPeso: " + peso
				+ "\n\tAltura: " + altura 
				+ "\n\t======================================="); 
	}
}
