/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplinas: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 * Baseado nos slides 22 da aula do dia 22/09/2017  
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Recebe um vetor A[1... n] e devolve o mínimo do vetor.
     * Número de comparações: n-1 = Theta(n)
     * 
     * @param A Vetor com os valores
     * @param n Quantidade de elementos do vetor
     * @return Um valor inteiro com o menor elemento do vetor
     */
    public static int minimo(int A[], int n) {
        //Considere o primeiro como menor
        int min = A[0];
        for (int j = 0; j <= n; j++) {
            if (min > A[j]) {
                min = A[j];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //Vetor dos dados    
        int A[] = {50, 70, 60, 90, 10, 30, 20, 40};

        //Quantidade de elementos
        int n = A.length-1;

        int menor = minimo(A, n);
        System.out.println("Menor:" + menor);
    }
}
