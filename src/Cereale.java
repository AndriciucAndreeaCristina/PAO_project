package src;

import java.util.List;

public class Cereale extends Aliment {
    public Cereale(float pret, int dataExpirare, List<String> ingrediente) {
        super(pret, dataExpirare, ingrediente);
        this.setCalorii(2.56f);
        this.setTip(CATEGORIE.PATISERIE);
    }
    @Override
    public String toString() {
        return "Cereale{" +
                "pret=" + pret +
                ", dataExpirare=" + dataExpirare +
                ", Ingrediente=" + ingrediente +
                ", calorii=" + calorii +
                ", tip=" + tip +
                '}';
    }
}
