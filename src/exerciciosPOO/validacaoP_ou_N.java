package exerciciosPOO;

import javax.swing.JOptionPane;

public class validacaoP_ou_N {
	 
	    public static void main(String[] args) {
	 
	        int numero;
	        
	        System.out.println("Digite um n�mero");
	        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
	 
	        if (numero % 2 == 0) {
	            System.out.println("O n�mero � par");
	        } else {
	            System.out.println("O n�mero � impar");
	        }
	 
	        if (numero >= 0) {
	            System.out.println("O n�mero � positivo");
	        } else {
	            System.out.println("O n�mero � negativo");
	        }
	 
	    }
	 
	}
