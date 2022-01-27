package entities;

public class PessoaJuridica extends Pessoa{

	private Integer qtdFuncionarios;
	
	public PessoaJuridica() {}
	
	public PessoaJuridica(String nome, double rendaAnual, int qtdFuncionarios) {
		super(nome, rendaAnual);
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public int getQtdFuncionarios() {
		return this.qtdFuncionarios;
	}
	
	public void setQtdFuncionarios(int qtd) {
		this.qtdFuncionarios = qtd;
	}
	
	@Override
	public double getImposto() {
		double imp = qtdFuncionarios > 10 ? 0.14 : 0.16;
		return this.getRendaAnual() * imp;
	}
}
