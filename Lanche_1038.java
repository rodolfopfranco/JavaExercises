/*
escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

O arquivo de entrada contém dois valores inteiros
correspondentes ao código e à quantidade de um item conforme tabela

Exemplo de Entrada
3 2

Exemplo de saída
 Total: R$ 10.00
 */

import java.util.*;
import java.util.stream.Collectors;

public class Lanche_1038 {
    public static void main(String[] args) {
        //Inicializando:
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> tabela = Map.of(1,4.0,2,4.5,3,5.0,4,2.0,5,1.5);
        List<Integer> pedido = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.printf("Total: R$ %.2f",tabela.get(pedido.get(0))*pedido.get(1));
    }
}