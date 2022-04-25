package imposto.implementacao;

import imposto.iterface.IAliquotaIPVA;
import imposto.singleton.TaxaAliquota;

public class Moto implements IAliquotaIPVA {

    private TaxaAliquota taxa;

    public Moto(TaxaAliquota taxa) {
        this.taxa = taxa;
    }
    @Override
    public double calculoIpva(double valorVeiculo) {
        return valorVeiculo * taxa.getAliquotaMoto();
    }
}
