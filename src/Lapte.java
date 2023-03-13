package src;

import java.util.List;

public class Lapte extends Aliment {
    public Lapte(float pret, int dataExpirare, List<String> ingrediente) {
        super(pret, dataExpirare, ingrediente);
        this.setCalorii(3.05f);
        this.setTip(CATEGORIE.LACTATE);
    }

    @Override
    public String toString() {
        return "Lapte{" +
                "pret=" + pret +
                ", dataExpirare=" + dataExpirare +
                ", Ingrediente=" + ingrediente +
                ", calorii=" + calorii +
                ", tip=" + tip +
                '}';
    }
}
