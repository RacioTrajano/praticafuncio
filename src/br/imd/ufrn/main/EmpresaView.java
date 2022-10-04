package br.imd.ufrn.main;

import br.imd.ufrn.dominio.Funcionario;
import br.imd.ufrn.dominio.Gerente;
import br.imd.ufrn.dominio.Vendedor;

public class EmpresaView {

	public static void main(String[] args) {
		Funcionario f =   new Funcionario();
		f.setTipoFuncionario("Engenheiro");
		f.setSalario(4500.50);
		f.calcularSalario();
		
		Vendedor v = new Vendedor();
		v.setTipoFuncionario("Vendedor");
		v.setSalario(1500.00);
		v.setComissao(500.00);
		v.calcularSalario();
		
		Gerente g = new Gerente();
		g.setTipoFuncionario("Gerente");
		g.setSalario(7500.00);
		g.setBonus(2500.00);
		g.calcularSalario();
		
		System.out.println("Salario " + f.getClass() + " R$ " + f.getSalario());
		System.out.println("Salario " + v.getClass() + " R$ " + v.getSalario());
		System.out.println("Salario " + g.getClass() + " R$ " + g.getSalario());
		
		System.err.println(f instanceof Vendedor);
		System.err.println(g instanceof Funcionario);
	}

}
