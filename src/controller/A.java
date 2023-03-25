/*
RESUMO      : Exercicio 1, Simulação do algoritmo A
PROGRAMADORA: Luiza Felix
DATA        : 25/03/2023
 */

package controller;

import br.edu.fateczl.pilhas.IntPilha;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

	public void Simulacao() throws Exception {
		IntPilha pilha = new IntPilha(); // a pilha criada já foi "inicializada" com o nó "null"

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				pilha.push(i * i);
			} else {
				if (i <= 5) {
					pilha.push(i);
				} else {
//					(aqui não preciso "ter medo" da mensagem de erro pois o pop não acontecerá perto da "base" da pilha)
					pilha.pop();
				}
			}
			System.out.println("	TOPO:" + pilha.top());
		}
		System.out.println("\nEmpilhamento concluído! \nTamanho:" + pilha.size() + "\nPilha:" + pilha.toString());
	}

}
