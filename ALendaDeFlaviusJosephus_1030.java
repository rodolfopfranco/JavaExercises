/*
Haverá NC (1 ≤ NC ≤ 30 ) casos de teste.
haverá um par de números inteiros positivos n (1 ≤ n ≤ 10000 ) e k (1 ≤ k ≤ 1000).
O número n representa a quantidade de pessoas no círculo,
numeradas de 1 até n.
O número k representa o tamanho do salto de um homem até o próximo homem que será morto.

Exemplo de Entrada:
3
5 2
6 3
1234 233

Exemplo de Saída:
Case 1: 3
Case 2: 1
Case 3: 25
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALendaDeFlaviusJosephus_1030 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticao = sc.nextInt();
        for (int i = 0; i< repeticao; i++){
            int pessoasNaRoda = sc.nextInt();
            int pulo = sc.nextInt();
            mortes(pessoasNaRoda,pulo,i);
        }
    }

    private static void mortes(int pessoasNaRoda, int pulo,int caso) {
        List<Integer> pessoas = new ArrayList<>();
        //Compõe roda:
        for (int i = 1; i <= pessoasNaRoda; i++) {
            pessoas.add(i);
        }
        //Executa mortes:
        int contador = -1;
        while (pessoas.size() > 1) {
            for (int i = 0; i < pulo; i++) {
                contador++;
                if (contador == pessoas.size()) {
                    contador = 0;
                }
            }
            pessoas.remove(contador);
            contador--;
            if (contador < 0 && pessoas.size() > 2)
                contador = pessoas.size()-1;
        }
        caso++;
        System.out.println("Case "+caso+": "+pessoas.get(0));
    }
}