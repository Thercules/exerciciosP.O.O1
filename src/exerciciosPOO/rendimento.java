package exerciciosPOO;

import java.util.Scanner;

public class rendimento {
	 
	public static void main(String args[])    {      
		Scanner input = new Scanner(System.in);
		
		double juros;
		double deposito;
		double rendimento; 
		
		System.out.print("Digite o  valor do deposito:" );    
		deposito = input.nextDouble(); 
		
		juros = ( deposito * 0.70 ) / 100; 
		rendimento = juros + deposito; 
		
		System.out.println("O rendimento deste mês foi de:" + rendimento + "$");
		
	}
}
