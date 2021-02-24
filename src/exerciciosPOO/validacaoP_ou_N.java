package exerciciosPOO;

import javax.swing.JOptionPane;

public class validacaoP_ou_N {
	 
	    public static void main(String[] args) {
	 
	        int numero;
	        
	        System.out.println("Digite um número");
	        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
	 
	        if (numero % 2 == 0) {
	            System.out.println("O número é par");
	        } else {
	            System.out.println("O número é impar");
	        }
	 
	        if (numero >= 0) {
	            System.out.println("O número é positivo");
	        } else {
	            System.out.println("O número é negativo");
	        }
	 
	    }
	 
	}
