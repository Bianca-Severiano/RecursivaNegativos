package controller;

public class ControllerNegativos {

	public ControllerNegativos() {
		super();
	}

	public int contaNegativos (int vet[], int tamanho) {
		int cont = 0;
		/*Quando tamanho do vetor for 0, não há valores a comparar
		 * então retorna 0 para iniciar a contagem somando os próximos
		 * caso sejam negativos*/
		if(tamanho == 0) {
			return 0;
		} else {
			tamanho--;
			cont = contaNegativos(vet, tamanho);
			/*Se valor do vetor na posição x 
			 *(iniciando na posição 0 do vetor) for negativo soma
			 * 1 ao contador e o retorna para a próxima verificação, 
			 * caso não retorne o próprio valor*/
			if (vet[tamanho] < 0) {
				return cont + 1;
			} else {
				return cont;
			}
		}
		
	}
}

