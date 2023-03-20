package src.produse;

import src.produse.tipuri.Categorie;

import java.util.List;
import java.util.Objects;

public abstract class Aliment {
    //pret, data expirare, ingrediente, calorii, tip aliment.
    protected Float pret;
    protected Integer dataExpirare;
    protected List<String> ingrediente;
    protected Float calorii;

    protected Categorie tip;

    public Aliment(Float pret, Integer dataExpirare, List<String> ingrediente) {
        this.pret = pret;
        this.dataExpirare = dataExpirare;
        this.ingrediente = ingrediente;
        this.calorii = 0F;
        this.tip = Categorie.ALTELE;
    }

    public Float getPret() {
        return pret;
    }

    public void setPret(Float pret) {
        this.pret = pret;
    }

    public Integer getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Integer dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Float getCalorii() {
        return calorii;
    }

    public void setCalorii(Float calorii) {
        this.calorii = calorii;
    }

    public Categorie getTip() {
        return tip;
    }

    public void setTip(Categorie tip) {
        this.tip = tip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aliment aliment = (Aliment) o;
        return pret.equals(aliment.pret) && dataExpirare.equals(aliment.dataExpirare) && Objects.equals(ingrediente, aliment.ingrediente) && calorii.equals(aliment.calorii) && tip == aliment.tip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pret, dataExpirare, ingrediente, calorii, tip);
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "pret=" + pret +
                ", dataExpirare=" + dataExpirare +
                ", ingrediente=" + ingrediente +
                ", calorii=" + calorii +
                ", tip=" + tip.getNume() +
                '}';
    }
}

