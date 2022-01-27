package entities;

public abstract class Pessoa {
	 private String nome;
	 private double rendaAnual;
	 
	 public Pessoa(){}
	 
	 public Pessoa(String nome, double rendaAnual) {
		 this.nome = nome;
		 this.rendaAnual = rendaAnual;
	 }
	 
	 public String getNome() {
		 return this.nome;
	 }
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public double getRendaAnual() {
		 return this.rendaAnual;
	 }
	 public void setRendaAnual(double rendaAnual) {
		 this.rendaAnual = rendaAnual;
	 }
	 
	 public abstract double getImposto();
	 
	 @Override
	 public String toString() {
		 return String.format("%s: $ %.2f", nome, getImposto());
	 }
}
