package app2;

import java.util.Scanner;

public class App2 {
	
	public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in);
          
          System.out.println("Digite sua idade em anos: ");
          int idadeAnos = entrada.nextInt();
          
          System.out.println("Digite sua idade em meses: ");
          int idadeMeses = entrada.nextInt();
          
          System.out.println("Digite sua idade em dias: ");
          int idadeDias = entrada.nextInt();
          
          int idadeFinalEmDias = (idadeAnos * 365 + idadeMeses * 30 + idadeDias);
          
          System.out.println(" Sua idade em dias é = "+idadeFinalEmDias+"/n");
          
          
         
	

	}

}
