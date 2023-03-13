package src;

import java.util.List;

public class Carne extends Aliment
{

    public Carne(float pret, int dataExpirare, List<String> ingrediente) {
        super(pret, dataExpirare, ingrediente);
        this.setCalorii(1.05f);
        this.setTip(CATEGORIE.MEZELURI);
    }

    @Override
    public String toString() {
        return "Carne{" +
                "pret=" + pret +
                ", dataExpirare=" + dataExpirare +
                ", Ingrediente=" + ingrediente +
                ", calorii=" + calorii +
                ", tip=" + tip +
                '}';
    }
}
