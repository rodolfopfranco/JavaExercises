/*
Leia 2 valores com uma casa decimal (x e y)
A seguir, determine qual o quadrante ao qual pertence o ponto,
ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Exemplo de Entrada
 4.5 -2.2
 Exemplo de saída:
  Q4
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoordenadasDeUmPonto_1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> coordenadas = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        if (coordenadas.get(0)==0 && coordenadas.get(1)==0){
            System.out.println("Origem");
        } else {
            if (coordenadas.get(0)==0){
                System.out.println("Eixo X");
            } else {
                if (coordenadas.get(1)==0){
                    System.out.println("Eixo Y");
                } else {
                    if (coordenadas.get(0)>0 && coordenadas.get(1)>0) {
                        System.out.println("Q1");
                    } else {
                        if (coordenadas.get(0)>0 && coordenadas.get(1)<0) {
                            System.out.println("Q4");
                        } else {
                            if (coordenadas.get(0)<0 && coordenadas.get(1)>0) {
                                System.out.println("Q2");
                            } else {
                                if (coordenadas.get(0) < 0 && coordenadas.get(1) < 0) {
                                    System.out.println("Q3");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
