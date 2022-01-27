package entities;

public class PessoaFisica extends Pessoa{

	private Double gastoSaude = 0d;
	
	public PessoaFisica () {}
	
	public PessoaFisica(String nome, double rendaAnual) {
		super(nome, rendaAnual);
	}

	public double getGastoSaude() {
		return this.gastoSaude;
	}
	
	public void addGastoSaude(double valor) {
		this.gastoSaude += valor;
	}	
	
	@Override
	public double getImposto() {
		double imp = this.getRendaAnual() > 20000 ? 0.25 : 0.15;
		double descSaude = gastoSaude * 0.5;
		return (this.getRendaAnual() * imp) - descSaude;
	}	
}
