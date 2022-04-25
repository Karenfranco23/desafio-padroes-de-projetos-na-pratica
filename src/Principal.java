import imposto.implementacao.Caminhao;
import imposto.implementacao.Carro;
import imposto.implementacao.CarroGas;
import imposto.implementacao.Moto;
import imposto.iterface.IAliquotaIPVA;
import imposto.singleton.TaxaAliquota;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        TaxaAliquota taxa = TaxaAliquota.getInstance(0.04,0.03,0.02,0.015);

        System.out.println("Calculadora do imposto IPVA");
        System.out.println("Digite o tipo do veículo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Carro a gas");
        System.out.println("3 - Moto");
        System.out.println("4 - Caminhão");

        Scanner entrada = new Scanner(System.in);
        int tipoVeiculo = entrada.nextInt();

        IAliquotaIPVA aliquota = null;
        switch (tipoVeiculo) {
            case 1:
                aliquota = new Carro(taxa);
                break;
            case 2:
                aliquota = new CarroGas(taxa);
                break;
            case 3:
                aliquota = new Moto(taxa);
                break;
            case  4:
                aliquota = new Caminhao(taxa);
                break;
        }

        System.out.println("Digite o valor do veículo:");
        double valorVeiculo = entrada.nextDouble();
        double valorImposto = aliquota.calculoIpva(valorVeiculo);
        System.out.println("O valor da aliquota de IPVA é: " + valorImposto);
    }
}
