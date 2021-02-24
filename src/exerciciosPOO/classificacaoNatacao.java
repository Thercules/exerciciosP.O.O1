package exerciciosPOO;

import javax.swing.JOptionPane;

public class classificacaoNatacao {

	    public static void main(String[] args) {
	 
	        int idade;
	 
	        System.out.println("Informe a sua idade");
	        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
	 
	        if(idade <= 4){
	            System.out.println("Abaixo da idade");
	        }
	 
	        if((idade >= 5) && (idade <= 7)){
	            System.out.println("Infantil A");
	        }
	 
	        if((idade >= 8) && (idade <= 10)){
	            System.out.println("Infantil B");
	        }
	 
	        if((idade >= 11) && (idade <= 13)){
	            System.out.println("Juvenil A");
	        }
	 
	        if((idade >= 14) && (idade <= 17)){
	            System.out.println("Juvenil B");
	        }
	 
	        if(idade >= 18){
	            System.out.println("Sênior");
	        }    
	 
	  }
}
