/*
A primeira linha contem três inteiros Ca, Ba e Pa (0 ≤ Ca, Ba, Pa ≤ 100)
representando respectivamente o número de refeições disponiveis de
frango, bife e massa.
A segunda linha contem três inteiros Cr, Br e Pr (0 ≤ Cr, Br, Pr ≤ 100),
indicando respectivamente o número de refeições requisitadas de
frango, bife e massa respectivamente.

Imprima uma única linha com um inteiro representando o número de passageiros
que seguramente não receberão sua escolha de refeição.

Exemplo de entrada:
80 20 40
45 23 48

Exemplo de saída:
11
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EscolhaDificil_2702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> estoque;
        List<Integer> pedidos;
        //Recebe e converte os dados:
        List<String> estoqueEntrada = Arrays.asList(sc.nextLine().split(" "));
        estoque = estoqueEntrada.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<String> pedidosEntrada = Arrays.asList(sc.nextLine().split(" "));
        pedidos = pedidosEntrada.stream().map(Integer::parseInt).collect(Collectors.toList());
        int passageirosComFome = 0;
        //Calcula cada um:
        for (int i = 0; i < 3; i++){
            int comidaFaltante = pedidos.get(i) - estoque.get(i);
            if (comidaFaltante > 0){
                passageirosComFome += comidaFaltante;
            }
        }
        System.out.println(passageirosComFome);
    }
}
