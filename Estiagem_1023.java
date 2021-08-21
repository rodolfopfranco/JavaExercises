/*
o governo federal criou um órgão para a avaliação do consumo destas regiões
com finalidade de verificar o comportamento da população na época de racionamento.

irá pegar algumas cidades (por amostragem),
verificará como está sendo o consumo de cada uma das pessoas da cidade
e o consumo médio de cada cidade por habitante.

A primeira linha de cada caso de teste contém um inteiro N, indicando a quantidade de imóveis.
As N linhas contém um par de valores X, indicando a quantidade de moradores de cada imóvel
e o respectivo consumo total de cada imóvel (em m3).

Exemplo de entrada:
3
3 22
2 11
3 39
5
1 25
2 20
3 31
2 40
6 70
2
1 1
3 2
0

Exemplo de saída:
Cidade# 1:
2-5 3-7 3-13
Consumo medio: 9.00 m3.

Cidade# 2:
5-10 6-11 2-20 1-25
Consumo medio: 13.28 m3.

Cidade# 3:
3-0 1-1
Consumo medio: 0.75 m3.
 */

import java.util.*;

public class Estiagem_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int imoveis = Integer.parseInt(sc.nextLine());
        int contador = 1;
        while (imoveis!=0){
            //Cria a cidade atual:
            Cidade cidade = new Cidade();
            while (imoveis>0){
                //Pega os dados dos imoveis
                List<String> valores= Arrays.asList(sc.nextLine().split(" "));
                Imovel imovel = new Imovel(Integer.parseInt(valores.get(0)),Integer.parseInt(valores.get(1)));
                cidade.addImovel(imovel);
                imoveis--;
            }
            //Imprime resultado:
            System.out.println("Cidade# "+contador+":");
            contador++;
            Collections.sort(cidade.getImoveis());
            for(Imovel imovel : cidade.getImoveis()){
                System.out.print(imovel.getMoradores()+"-"+imovel.getConsumoMedio()+" ");
                //talvez tenha que verificar em qual ponto está para acrescentar espaço ou quebra
            }
            System.out.println();
            System.out.printf("Consumo medio: %.2f m3.\n",cidade.calculaConsumoMedio());
            imoveis = Integer.parseInt(sc.nextLine());
            if (imoveis>0)
                System.out.println();
        }
    }
}

class Imovel implements Comparable<Imovel>{
    private Integer moradores;
    private Integer consumo;
    private Integer consumoMedio;

    public Imovel(Integer moradores, Integer consumo) {
        this.moradores = moradores;
        this.consumo = consumo;
        this.consumoMedio = consumo/moradores;
    }

    public Integer getMoradores() {return moradores;}

    public Integer getConsumo() {return consumo;}

    public Integer getConsumoMedio() {return consumoMedio;}

    @Override
    public int compareTo(Imovel imovel){
        return this.getConsumoMedio().compareTo(imovel.getConsumoMedio());
    }
}

class Cidade{
    private List<Imovel> imoveis;

    public Cidade() { this.imoveis = new ArrayList<>(); }

    public void addImovel(Imovel imovel){ this.imoveis.add(imovel); }

    public List<Imovel> getImoveis() { return imoveis; }

    public Double calculaConsumoMedio(){
        Double consumoTotal = 0.0;
        Integer moradoresTotal = 0;
        for(Imovel imovel:this.imoveis){
            consumoTotal+=imovel.getConsumo();
            moradoresTotal+=imovel.getMoradores();
        }
        return consumoTotal/moradoresTotal;
    }
}