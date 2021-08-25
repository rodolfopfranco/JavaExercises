/*
A primeira linha de entrada é um inteiro T (T < 100)
que indica o número total de casos de teste.

Cada caso inicia com uma linha contendo um inteiro N
(N < X2, onde X é a largura em nodos do labirinto, que pode variar de 3 até 7).
Este N é o ponto (nodo) no qual o desenho deve ser iniciado
e também é onde o desenho deve ser terminado.

Na próxima linha há duas informações V e A
que são respectivamente a quantidade de vértices e arestas do desenho.

Uma quantidade A de linhas vem a seguir,
cada uma descrevendo um segmento de linha que Pedro tem disponível
para para desenhar o labirinto desejado.

Exemplo de entrada:
2
0
16 15
0 4
2 3
6 2
8 9
10 9
8 12
14 15
14 10
6 5
10 11
11 7
4 8
0 1
1 2
12 13

Exemplo de saída:
30

Passos -
I   Criar um objeto node
II  Criar uma linked list de nodes
III Extender o node com Generics
IV  Extender a conectividade do node
V   Construir um grafo geral
 */

public class DesenhandoLabirintos_1076 {
    public static void main(String[] args) {
        Node no= new Node(1,null);
        Node no2 = new Node(2, no);
        System.out.println(no.getNumero());
        System.out.println(no2.getProximo().getNumero());
    }

}

class Node {
    private int numero;
    private Node proximo;

    public Node(int numero, Node proximo){
        this.numero= numero;
        this.proximo = proximo;
    }

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public Node getProximo() {return proximo;}
    public void setProximo(Node proximo) {this.proximo = proximo;}
}
