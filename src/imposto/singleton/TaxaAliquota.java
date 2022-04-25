package imposto.singleton;

public class TaxaAliquota {

    private static TaxaAliquota instance;

    private double aliquotaCarro;
    private double aliquotaCarroGas;
    private double aliquotaMoto;
    private double aliquotaCaminhao;

    public static TaxaAliquota getInstance(double aliquotaCarro, double aliquotaCarroGas, double aliquotaMoto, double aliquotaCaminhao) {
        if (instance == null) {
            instance = new TaxaAliquota();
        }
        instance.aliquotaCarro = aliquotaCarro;
        instance.aliquotaCarroGas = aliquotaCarroGas;
        instance.aliquotaMoto = aliquotaMoto;
        instance.aliquotaCaminhao = aliquotaCaminhao;
        return instance;

    }

    public static double getAliquotaCarro() {
        return instance.aliquotaCarro;
    }

    public static double getAliquotaCarroGas() {
        return instance.aliquotaCarroGas;
    }

    public static double getAliquotaMoto() {
        return instance.aliquotaMoto;
    }

    public static double getAliquotaCaminhao() {
        return instance.aliquotaCaminhao;
    }
}
