package br.imd.ufrn.dominio;

public class Vendedor extends Funcionario {
	private double comissao;

	public Vendedor() {
		
		
	}
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		this.salario += comissao;
		return salario;
	}
}
