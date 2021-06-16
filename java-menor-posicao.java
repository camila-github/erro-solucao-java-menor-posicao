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