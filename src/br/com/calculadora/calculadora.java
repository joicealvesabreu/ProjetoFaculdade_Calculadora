package br.com.calculadora;

import java.util.Scanner;

public class calculadora {

	/* @author Joice Natalice Alves de Abreu  - R.A: D859927
	 * 4º Semestre - Pinheiros - Noturno
	 * 
	 * Programação Orientado a Objetos II - Prática e Teórica - Projeto Calculadora
	 * 
	 * Criar uma calculadora, criar métodos Somar, subtrair, multiplicar e dividir e uma classe main pedindo dois valores
	 * pro usuário e retorna os métodos da classe calculadora.
	 * 
	 * @version 1.0 03/10/2020
	 */
	public static void main (String args[]){
		
	

		objCal c = new objCal();
		
		int opcao = 5;
		int num1;
	 	int num2;

	     
		System.out.println("Escolha uma opção: ");
	    System.out.println("1 -Soma");  
	    System.out.println("2 -Subtracao");  
	    System.out.println("3 -Multiplicacao");  
	    System.out.println("4 -Divisao");  
	    System.out.println("0 -Sair");  
	    System.out.println("Operação: ");  
	    
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
	    			
	    			System.out.println("O resultado da soma é: " + operacao);
	    		break;
	    	}
	    	 	if (opcao == 2) {
		    		
	    	 		  Scanner in1 = new Scanner(System.in);  
	    	  	      
	  	    		System.out.println("Qual o primeiro numero: ");
	  	    		 num1 = in1.nextInt();
	  	    		System.out.println("Qual o segundo numero: ");
	  	    		 num2 = in1.nextInt();
	  	    			int operacao = c.sub(num1, num2);
	  	    			
	  	    			System.out.println("O resultado da subtração é: " + operacao);
		    		
		    		break;
		    		}
		    	 	if (opcao == 3) {
		    	 		  Scanner in1 = new Scanner(System.in);  
		    	  	      
		  	    		System.out.println("Qual o primeiro numero: ");
		  	    		 num1 = in1.nextInt();
		  	    		System.out.println("Qual o segundo numero: ");
		  	    		 num2 = in1.nextInt();
		  	    			int operacao = c.mult(num1, num2);
		  	    			
		  	    			System.out.println("O resultado da multiplicação é: " + operacao);
		  	    			
			    		break;
		    	 	}
			    	 	if (opcao == 4) {
			    	 		  Scanner in1 = new Scanner(System.in);  
			    	  	      
			  	    		System.out.println("Qual o primeiro numero: ");
			  	    		 num1 = in1.nextInt();
			  	    		System.out.println("Qual o segundo numero: ");
			  	    		 num2 = in1.nextInt();
			  	    			int operacao = c.div(num1, num2);
			  	    			
			  	    			System.out.println("O resultado da divisão é: "  + operacao);
				    		break;
				    		}
			    	 	else{
					    		System.out.println("Não tem essa opção!!");
					    	
					    		break;
					    		}
				    
	    }
	}
}
	