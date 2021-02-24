package exerciciosPOO;

import javax.swing.JOptionPane; 

public class leituraTemperatura {
	public static void main(String[] args) {
		
		        Double c,f;
		        
		        System.out.println("Informe a temperatura em fahrenheit:");
		        f = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em fahrenheit:"));
		        c = (5 * (f-32) / 9);//((f / 1.8)-32);
		        System.out.println("A temperatura em celsius é:" + c );
		        System.out.println("==========TEMPERATURAS:==========");
		        System.out.println("Celsius:" + c +"°");
		        System.out.println("Fahrenheit:" + f + "°" );
	}
 }

