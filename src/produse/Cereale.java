package src.produse;

import src.produse.tipuri.Categorie;

import java.util.List;

public class Cereale extends Aliment {
    public Cereale(Float pret, Integer dataExpirare, List<String> ingrediente) {
        super(pret, dataExpirare, ingrediente);
        this.calorii = 2.56F;
        this.tip = Categorie.PATISERIE;
    }
}
