package com.example.Finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceApplication.class, args);

	try {
		Financing f1 = new Financing(100000.0, 2000.0, 20);
		System.out.println("Dados do financiamento 1:");
		System.out.printf("Entrada: %.2f%n ", f1.entry());
		System.out.printf("Prestacao: %.2f%n ", f1.quota());

	}
	catch(IllegalArgumentException e) {
		System.out.println("Erro nos dados do financiamento 1: " + e.getMessage());
	}
	
	try {
		Financing f2 = new Financing(100000.0, 2000.0, 80);
		System.out.println("Dados do financiamento 2:");
		System.out.printf("Entrada: %.2f%n", f2.entry());
		System.out.printf("Prestacao: %.2f%n", f2.quota());

	}
	catch(IllegalArgumentException e) {
		System.out.println("Erro nos dados do financiamento 2: " + e.getMessage());
	}
	
	}
}
