package exerciciosPOO;

import javax.swing.JOptionPane;

public class comissaoVendedor {

	    public static void main(String[] args) {
	 
	        Double salarioFixo;
	        Double totalVendas;
	        Double salarioFinal;
	        Double comissao;
	 
	        System.out.println("Informe o n�mero do vendedor: ");
	        int numeroVendedor = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero do vendedor: "));
	 
	        System.out.println("Informe o sal�rio fixo do vendedor: ");
	        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio fixo do vendedor: "));
	 
	        System.out.println("Informe o total de vendas efetuado pelo vendedor em um determinado m�s");
	        totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de vendas efetuado pelo vendedor"
	                + " em um determinado m�s"));
	 
	        if (totalVendas <= 1000) {
	            comissao = totalVendas * 10 / 100;
	        } else {
	                                
	            comissao = (1000.0 * 10.0 / 100.0) +       
	            (totalVendas - 1000.0) * 20.0 / 100.0; 
	        }
	 
	        System.out.println("Comiss�es do vendedor " + numeroVendedor +  " �: " + comissao);
	        salarioFinal = salarioFixo + comissao;
	        System.out.println("O sal�rio do vendedor " + numeroVendedor +  " �: "+ salarioFinal);
	    }
	 
	}