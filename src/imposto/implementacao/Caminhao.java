package imposto.implementacao;

import imposto.iterface.IAliquotaIPVA;
import imposto.singleton.TaxaAliquota;

public class Caminhao implements IAliquotaIPVA {

    private TaxaAliquota taxa;

    public Caminhao(TaxaAliquota taxa) {
        this.taxa = taxa;
    }
    @Override
    public double calculoIpva(double valorVeiculo) {
        return valorVeiculo * taxa.getAliquotaCaminhao();
    }
}
