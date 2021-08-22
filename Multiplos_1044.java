/*

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Exemplo de Entrada:
6 24
Exemplo de Saída:
Sao Multiplos

 */

import java.util.Scanner;

public class Multiplos_1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double numero1 = sc.nextDouble();
        Double numero2 = sc.nextDouble();
        if (numero1%numero2==0 ||numero2%numero1==0){
            System.out.println("Sao Multiplos");
        } else{
            System.out.println("Nao sao multiplos");
        }
    }
}
