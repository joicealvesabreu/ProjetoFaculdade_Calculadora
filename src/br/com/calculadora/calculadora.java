package br.com.calculadora;

import java.util.Scanner;

public class calculadora {

	/* @author Joice Natalice Alves de Abreu  - R.A: D859927
	 * 4� Semestre - Pinheiros - Noturno
	 * 
	 * Programa��o Orientado a Objetos II - Pr�tica e Te�rica - Projeto Calculadora
	 * 
	 * Criar uma calculadora, criar m�todos Somar, subtrair, multiplicar e dividir e uma classe main pedindo dois valores
	 * pro usu�rio e retorna os m�todos da classe calculadora.
	 * 
	 * @version 1.0 03/10/2020
	 */
	public static void main (String args[]){
		
	

		objCal c = new objCal();
		
		int opcao = 5;
		int num1;
	 	int num2;

	     
		System.out.println("Escolha uma op��o: ");
	    System.out.println("1 -Soma");  
	    System.out.println("2 -Subtracao");  
	    System.out.println("3 -Multiplicacao");  
	    System.out.println("4 -Divisao");  
	    System.out.println("0 -Sair");  
	    System.out.println("Opera��o: ");  
	    
	    Scanner in = new Scanner(System.in); 
	    opcao = in.nextInt();
	    
	    while (opcao != 0) {
	    	
	    
	    	if (opcao == 1) {
	    		    		
	    	
	    	    Scanner in1 = new Scanner(System.in);  
	    		System.out.println("Qual o primeiro numero: ");
	    		 num1 = in1.nextInt();
	    		System.out.println("Qual o segundo numero: ");
	    		 num2 = in1.nextInt();
	    
	    			int operacao = c.som(num1, num2);
	    			
	    			System.out.println("O resultado da soma �: " + operacao);
	    		break;
	    	}
	    	 	if (opcao == 2) {
		    		
	    	 		  Scanner in1 = new Scanner(System.in);  
	    	  	      
	  	    		System.out.println("Qual o primeiro numero: ");
	  	    		 num1 = in1.nextInt();
	  	    		System.out.println("Qual o segundo numero: ");
	  	    		 num2 = in1.nextInt();
	  	    			int operacao = c.sub(num1, num2);
	  	    			
	  	    			System.out.println("O resultado da subtra��o �: " + operacao);
		    		
		    		break;
		    		}
		    	 	if (opcao == 3) {
		    	 		  Scanner in1 = new Scanner(System.in);  
		    	  	      
		  	    		System.out.println("Qual o primeiro numero: ");
		  	    		 num1 = in1.nextInt();
		  	    		System.out.println("Qual o segundo numero: ");
		  	    		 num2 = in1.nextInt();
		  	    			int operacao = c.mult(num1, num2);
		  	    			
		  	    			System.out.println("O resultado da multiplica��o �: " + operacao);
		  	    			
			    		break;
		    	 	}
			    	 	if (opcao == 4) {
			    	 		  Scanner in1 = new Scanner(System.in);  
			    	  	      
			  	    		System.out.println("Qual o primeiro numero: ");
			  	    		 num1 = in1.nextInt();
			  	    		System.out.println("Qual o segundo numero: ");
			  	    		 num2 = in1.nextInt();
			  	    			int operacao = c.div(num1, num2);
			  	    			
			  	    			System.out.println("O resultado da divis�o �: "  + operacao);
				    		break;
				    		}
			    	 	else{
					    		System.out.println("N�o tem essa op��o!!");
					    	
					    		break;
					    		}
				    
	    }
	}
}
	