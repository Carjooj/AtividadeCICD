package com.cicd;
import java.util.Scanner;

public class Main {
	
	 public static double multi(double v1, double v2){
	        double resul = 0;
	        resul = resul + v2;
	        if (v2 == 1){
	            return v1;
	        }
	        else {
	            return v1 + multi(v1,v2-1);
	        }

	    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Comentário de mudança no código
		
		//Mudança do coleguinha //
		System.out.println("Colab: Jackeline esteve aqui");
		
		System.out.println("Digite um número");
		Double n1 = scan.nextDouble();
		
		System.out.println("Digite outro número");
		
		Double n2 = scan.nextDouble();
		
		scan.close();
		
		System.out.println("Os valores inseridos foram " + n1 + " e " + n2);
		
		System.out.println(n1 + " X " + n2 + " = " + Main.multi(n1, n2));
		
		
		
		
	}

}
