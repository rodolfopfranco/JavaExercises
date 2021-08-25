/*
Crie um algoritmo que receba dois inputs que sejam strings
e combine-as alternando as letras de cada string.

Deve começar pela primeira letra da primeira string,
seguido pela primeira letra da segunda string,
em seguida pela segunda letra da primeira string
e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa
devem ser adicionadas ao fim da string resultante e retornada.

A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir.
Cada caso de teste é composto por
uma linha que contém duas cadeias de caracteres,
cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Exemplo de Entrada
2
aA Bb
aa bb

Exemplo de saída

2
aA Bb
aa bb
 */

import java.util.Scanner;

public class JuntandoPalavras {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        leitor.nextLine();
        for (int i = 0; i < N; i++) {
            String[] palavras = leitor.nextLine().split(" ");
            int menorPalavra;
            int maiorPalavra;
            if ( palavras[0].length() > palavras[1].length() ) {
                menorPalavra = 1;
                maiorPalavra = 0;
            } else {
                menorPalavra = 0;
                maiorPalavra = 1;
            }
            String resultado = "";
            for (  int j=0; j < palavras[menorPalavra].length(); j++) {
                resultado += palavras[0].substring(j,j+1)+palavras[1].substring(j,j+1);
            }
            resultado += palavras[maiorPalavra].substring(palavras[menorPalavra].length());
            System.out.println(resultado);
        }
    }

}