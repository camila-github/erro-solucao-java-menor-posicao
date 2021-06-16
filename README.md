## Exercicio (Java): Menor e Posição

O exercicio publicado é referente ao treinamento do Bootcamp Java - Solucionando Problemas Básicos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Desenvolva um código que leia um valor E. Este E será o tamanho de um vetor X[E]. A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.


#### Entrada: 

A primeira linha de entrada contem um único inteiro E (1 < E < 1000), indicando o número de elementos que deverão ser lidos em seguida para o vetor X[E] de inteiros. A segunda linha contém cada um dos E valores, separados por um espaço.


#### Saída: 

A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
10 | Menor valor: -5
1 2 3 4 -5 6 7 8 9 10 | Posicao: 4


#### Java　

```java
//SOLUCAO 1

import java.io.IOException;
import java.util.Scanner;

public class MenorPosicao {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int valorEntrada = entrada.nextInt();
        int[] tamanhoVetor = new int[valorEntrada];
        int menorElemento = 0, posicaoMenorElemento = 0;
        for (int i = 0; i < valorEntrada; i++) {
        	tamanhoVetor[i] = entrada.nextInt();
        	if (i == 0) {
        		menorElemento = tamanhoVetor[i];
        		posicaoMenorElemento = i;
        	} else if (tamanhoVetor[i] < menorElemento) {
        		menorElemento = tamanhoVetor[i];
        		posicaoMenorElemento = i;
        	}
        }
        System.out.println("Menor valor: " + menorElemento); 
        System.out.println("Posicao: " + posicaoMenorElemento);
    }
}
```

