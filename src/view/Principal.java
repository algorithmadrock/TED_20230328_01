/*
RESUMO      : Exercicio 1, Tela de execução dos 2 algoritmos simulados
PROGRAMADORA: Luiza Felix
DATA        : 25/03/2023
 */

package view;

import controller.A;
import controller.B;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		A a = new A();
		B b = new B();

		System.err.println("A \n");
		 	a.Simulacao();
		System.err.println("B \n");
			b.Simulacao();
		
	}

}
