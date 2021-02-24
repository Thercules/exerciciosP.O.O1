package exerciciosPOO;

import javax.swing.JOptionPane;

public class calculoMainAllFuctions {
	public static void main(String args[]) {

		int soma;
		int subtracao;
		int divisao; 
		int multiplicacao;
		int num1 = 0; int num2 = 0;

		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero:"));
		
		soma = num1 + num2; JOptionPane.showMessageDialog(null,"A soma dos dois numeros e: " + soma);
		subtracao = num1 - num2; JOptionPane.showMessageDialog(null,"A subtracao dos dois numeros e: " + subtracao);
		divisao = num1 / num2; JOptionPane.showMessageDialog(null,"A divisao dos dois numeros e: " + divisao);
		multiplicacao = num1 * num2; JOptionPane.showMessageDialog(null,"A multiplicacao dos dois numeros e: " + multiplicacao);
		System.exit(0); 
		
				}
}
