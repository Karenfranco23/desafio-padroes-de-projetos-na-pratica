package imposto.implementacao;

import imposto.iterface.IAliquotaIPVA;
import imposto.singleton.TaxaAliquota;

public class CarroGas implements IAliquotaIPVA {

    private TaxaAliquota taxa;

    public CarroGas(TaxaAliquota taxa) {
        this.taxa = taxa;
    }
    @Override
    public double calculoIpva(double valorVeiculo) {
        return valorVeiculo * taxa.getAliquotaCarroGas();
    }
}
