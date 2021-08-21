/*
 Ler uma expressão na forma de dois números Racionais (numerador / denominador)
 Apresentar o resultado da operação.
 Cada operando ou operador é separado por um espaço em branco.
 A sequência de cada linha que contém a expressão a ser lida é:
 número, caractere, número, caractere, número, caractere, número.
 A resposta deverá ser apresentada e posteriormente simplificada.
 Deverá então ser apresentado o sinal de igualdade e em seguida a resposta simplificada.
 No caso de não ser possível uma simplificação, deve ser apresentada a mesma resposta após o sinal de igualdade.

Considerando N1 e D1 como numerador e denominador da primeira fração, segue a orientação de como deverá ser realizada cada uma das operações:
Soma: (N1*D2 + N2*D1) / (D1*D2)
Subtração: (N1*D2 - N2*D1) / (D1*D2)
Multiplicação: (N1*N2) / (D1*D2)
Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)

Exemplo de entrada:
4
1 / 2 + 3 / 4
1 / 2 - 3 / 4
2 / 3 * 6 / 6
1 / 2 / 3 / 4

Exemplo de saída:
10/8 = 5/4
-2/8 = -1/4
12/18 = 2/3
4/6 = 2/3
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TDARacional_1022 {

    private static List<Integer> somaFracao (int numerador1, int denominador1, int numerador2, int denominador2){
        List<Integer> soma = new ArrayList<>(Arrays.asList(numerador1*denominador2+numerador2*denominador1,denominador1*denominador2));
        return soma;
    }

    private static List<Integer> subFracao (int numerador1, int denominador1, int numerador2, int denominador2){
        List<Integer> sub = new ArrayList<>(Arrays.asList(numerador1*denominador2-numerador2*denominador1,denominador1*denominador2));
        return sub;
    }

    private static List<Integer> multFracao (int numerador1, int denominador1, int numerador2, int denominador2){
        List<Integer> mult = new ArrayList<>(Arrays.asList(numerador1*numerador2,denominador1*denominador2));
        return mult;
    }

    private static List<Integer>divFracao (int numerador1, int denominador1, int numerador2, int denominador2){
        List<Integer> div = new ArrayList<>(Arrays.asList(numerador1*denominador2,denominador1*numerador2));
        return div;
    }

    private static List<Integer> calculaResultado(Formula formula){
        int n1 = formula.getNumerador1();
        int d1 = formula.getDenominador1();
        int n2 = formula.getNumerador2();
        int d2 = formula.getDenominador2();
        List<Integer> resultado = new ArrayList<>();
        switch(formula.getOperador()){
            case('+'):
                resultado = somaFracao(n1, d1, n2, d2);
                break;
            case('-'):
                resultado = subFracao(n1, d1, n2, d2);
                break;
            case('*'):
                resultado = multFracao(n1, d1, n2, d2);
                break;
            case('/'):
                resultado = divFracao(n1, d1, n2, d2);
                break;
        }
        return resultado;
    }

    private static Formula separaValores(String formulaTexto){
        Formula formula = new Formula();
        String[] items = formulaTexto.split(" ");
        formula.setNumerador1(Integer.parseInt(items[0]));
        formula.setDenominador1(Integer.parseInt(items[2]));
        formula.setOperador(items[3].charAt(0));
        formula.setNumerador2(Integer.parseInt(items[4]));
        formula.setDenominador2(Integer.parseInt(items[6]));
        return formula;
    }

    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }

    private static String simplifica(int numerador, int denominador){
        int mdc = mdc(numerador,denominador);
        while (mdc != 1){
            numerador /= mdc;
            denominador /= mdc;
            mdc = mdc(numerador,denominador);
        }
        String resultado = numerador+"/"+denominador;
        return resultado;
    }

    public static void main(String[] args) {
        //inicializa dados:
        Scanner sc = new Scanner(System.in);
        Formula formula = new Formula();
        //Recebe número de vezes:
        int vezes = Integer.parseInt(sc.nextLine());
        int repeticao = 0;
        //Executa:
        while(repeticao < vezes){
            formula = separaValores(sc.nextLine());
            List<Integer> resultado = calculaResultado(formula);
            System.out.print(resultado.get(0)+"/"+resultado.get(1)+" = ");
            System.out.println(simplifica(resultado.get(0),resultado.get(1)));
            repeticao ++;
        }
    }

}

class Formula{
    private Integer numerador1;
    private Integer denominador1;
    private Integer numerador2;
    private Integer denominador2;
    private Character operador;

    public Integer getNumerador1() { return numerador1; }

    public void setNumerador1(Integer numerador1) { this.numerador1 = numerador1; }

    public Integer getDenominador1() { return denominador1; }

    public void setDenominador1(Integer denominador1) { this.denominador1 = denominador1; }

    public Integer getNumerador2() { return numerador2; }

    public void setNumerador2(Integer numerador2) { this.numerador2 = numerador2; }

    public Integer getDenominador2() { return denominador2; }

    public void setDenominador2(Integer denominador2) { this.denominador2 = denominador2; }

    public Character getOperador() { return operador; }

    public void setOperador(Character operador) { this.operador = operador; }
}