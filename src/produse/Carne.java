package src.produse;

import src.produse.tipuri.Categorie;

import java.util.List;

public class Carne extends Aliment {

    public Carne(Float pret, Integer dataExpirare, List<String> ingrediente) {
        super(pret, dataExpirare, ingrediente);
        this.calorii = 1.05f;
        this.tip = Categorie.MEZELURI;
    }
}
