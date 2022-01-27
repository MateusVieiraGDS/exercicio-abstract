package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int num_payers = sc.nextInt();
		sc.nextLine(); //Limpando o Buffer
		
		for(int i = 0; i < num_payers; i++) {
			System.out.print("Tax payer #" + (i + 1) + " data:");
			
			System.out.print("\nIndividual or company (i/c)? ");
			String tipo = sc.nextLine();
			
			System.out.print("Name: ");
			String nome = sc.nextLine();
			
			System.out.print("Anual income: ");
			double ra = sc.nextDouble();
						
			if(tipo.equals("i")) {
				System.out.print("Health expenditures: ");
				double gs = sc.nextDouble();
				PessoaFisica pf = new PessoaFisica(nome, ra);
				pf.addGastoSaude(gs);
				pessoas.add(pf);				
			}
			else if(tipo.equals("c")) {
				System.out.print("Number of employees: ");
				int qtdF = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, ra, qtdF));
			}
			sc.nextLine(); //Limpando Buffer
		}
		
		double total_taxes = 0;
		System.out.println("\nTAXES PAID:");
		for(Pessoa p : pessoas) {
			total_taxes += p.getImposto();
			System.out.println(p);
		}
		System.out.printf("%nTOTAL TAXES: $ %.2f", total_taxes);
		
		sc.close();
	}

}
