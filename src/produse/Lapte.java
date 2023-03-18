package src.produse;

import src.produse.tipuri.Categorie;

import java.util.List;

public class Lapte extends Aliment {
    public Lapte(Float pret, Integer dataExpirare, List<String> ingrediente) {
        super(pret, dataExpirare, ingrediente);
        this.calorii = 3.05F;
        this.tip = Categorie.LACTATE;
    }
}
