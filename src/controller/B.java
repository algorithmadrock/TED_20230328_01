/*
RESUMO      : Exercicio 1, Simulação do algoritmo B
PROGRAMADORA: Luiza Felix
DATA        : 25/03/2023
 */

package controller;

import br.edu.fateczl.pilhas.IntPilha;

public class B {

	public B() {
		// TODO Auto-generated constructor stub
	}

	public void Simulacao() throws Exception {
		IntPilha pilha = new IntPilha();

		for (int i = 100; i < 115; i++) {
			if (pilha.vazia()) {
				pilha.push(i + 100);
			} else {
				if (pilha.size() <= 4) {
					// não preciso fazer a verificação tamanho em outro lugar do looping, ele calcula isso sozinho
					pilha.push(i + 50);
				} else {
					pilha.pop();
				}
			}
			System.out.println("	TOPO:" + pilha.top());
		}
		System.out.println("\nEmpilhamento concluído! \nTamanho:" + pilha.size() + "\n" + pilha.toString());
	}

}
