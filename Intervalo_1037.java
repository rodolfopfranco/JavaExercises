/*
fazer um programa que leia um valor qualquer
e apresente uma mensagem dizendo em qual dos seguintes intervalos
([0,25], (25,50], (50,75], (75,100])
este valor se encontra.

Se o valor não estiver em nenhum destes intervalos,
deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Exemplo de entrada:
100.00

Exemplo de saída:
Intervalo (75,100]
 */

import java.util.Scanner;

public class Intervalo_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        String intervalo = "Fora de intervalo";
        if (valor >= 0 && valor<= 25){
            intervalo = "Intervalo [0,25]";
        } else {
            if (valor > 25 && valor <= 50){
                intervalo = "Intervalo (25,50]";
            } else {
                if (valor > 50 && valor <= 75){
                    intervalo = "Intervalo (50,75]";
                } else {
                    if (valor > 75 && valor <= 100){
                        intervalo = "Intervalo (75,100]";
                    }
                }
            }
        }
        System.out.println(intervalo);
    }
}
