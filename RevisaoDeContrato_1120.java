import java.util.Scanner;

/*
Sr. Miranda, percebeu que a máquina apresentava falha em um dos dígitos numéricos.
O dígito falho não é impresso na folha
Ele percebeu que isso poderia ter alterado os valores numéricos representados nos contratos
Por exemplo, se a máquina apresenta falha no dígito 5,
o valor 1500 seria datilografado no contrato como 100, pois o 5 não seria impresso

A entrada consiste de diversos casos de teste, cada um em uma linha.
Cada linha contém dois inteiros D e N
, representando, respectivamente, o dígito que está apresentando problema na máquina
e o número que foi negociado originalmente no contrato
O ultimo caso de teste é seguido por uma linha que contém apenas dois zeros separados por espaços em branco

Exemplo de Entrada
5 5000000
3 123456
9 23454324543423
9 99999999991999999
7 777
0 0

Exemplo de saída:
0
12456
23454324543423
1
0
 */
public class RevisaoDeContrato_1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer digito;
        String valor;
        boolean continuar =true;
        while(continuar) {
            digito = sc.nextInt();
            valor = sc.next();
            if (digito != 0 && !valor.equals("0")) {
                String resposta = valor.replace(digito.toString(), "");
                //Verifica se não tiver sobrado nada:
                if (resposta.length()==0) {
                    resposta = "0";
                } else {
                    //verifica se tem zero no início:
                    while (Character.valueOf(resposta.charAt(0)).compareTo('0') == 0 && resposta.length() > 1) {
                        resposta = resposta.substring(1);
                    }
                }
                System.out.println(resposta);
            } else {
                continuar = false;
            }
        }
    }
}
