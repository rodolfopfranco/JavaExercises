import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo.
A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro,
tendo uma duração mínima de 1 hora e máxima de 24 horas.

Exemplo de etrada:
 16 2
 Exemplo de saída:
  O JOGO DUROU 10 HORA(S)
 */
public class TempoDeJogo_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int duracaoJogo = 24;
        if (fim<inicio) {
            duracaoJogo = duracaoJogo+fim-inicio;
        } else {
            if (fim > inicio) {
                duracaoJogo = fim - inicio;
            }
        }
        System.out.println("O JOGO DUROU "+duracaoJogo+" HORA(S)");
    }
}
