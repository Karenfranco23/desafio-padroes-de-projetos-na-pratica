package imposto.implementacao;

import imposto.iterface.IAliquotaIPVA;
import imposto.singleton.TaxaAliquota;

public class Carro implements IAliquotaIPVA {

    private TaxaAliquota taxa;

    public Carro(TaxaAliquota taxa) {
        this.taxa = taxa;
    }
    @Override
    public double calculoIpva(double valorVeiculo) {
        return valorVeiculo * taxa.getAliquotaCarro();
    }
}
