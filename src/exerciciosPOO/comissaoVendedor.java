package exerciciosPOO;

import javax.swing.JOptionPane;

public class comissaoVendedor {

	    public static void main(String[] args) {
	 
	        Double salarioFixo;
	        Double totalVendas;
	        Double salarioFinal;
	        Double comissao;
	 
	        System.out.println("Informe o número do vendedor: ");
	        int numeroVendedor = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do vendedor: "));
	 
	        System.out.println("Informe o salário fixo do vendedor: ");
	        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo do vendedor: "));
	 
	        System.out.println("Informe o total de vendas efetuado pelo vendedor em um determinado mês");
	        totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de vendas efetuado pelo vendedor"
	                + " em um determinado mês"));
	 
	        if (totalVendas <= 1000) {
	            comissao = totalVendas * 10 / 100;
	        } else {
	                                
	            comissao = (1000.0 * 10.0 / 100.0) +       
	            (totalVendas - 1000.0) * 20.0 / 100.0; 
	        }
	 
	        System.out.println("Comissões do vendedor " + numeroVendedor +  " é: " + comissao);
	        salarioFinal = salarioFixo + comissao;
	        System.out.println("O salário do vendedor " + numeroVendedor +  " é: "+ salarioFinal);
	    }
	 
	}