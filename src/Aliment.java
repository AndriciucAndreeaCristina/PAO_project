package src;

import java.util.List;
import java.util.Objects;

public abstract class Aliment {
    //pret, data expirare, ingrediente, calorii, tip aliment.
      protected float pret;
      protected int dataExpirare;
      protected List<String> ingrediente;
      protected float calorii;

      protected CATEGORIE tip;
    public Aliment(float pret, int dataExpirare, List<String> ingrediente) {
        this.pret = pret;
        this.dataExpirare = dataExpirare;
        this.ingrediente = ingrediente;
        this.calorii = 0;
        this.tip = CATEGORIE.ALTELE;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(int dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public float getCalorii() {
        return calorii;
    }

    public void setCalorii(float calorii) {
        this.calorii = calorii;
    }

    public CATEGORIE getTip() {
        return tip;
    }

    public void setTip(CATEGORIE tip) {
        this.tip = tip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aliment aliment = (Aliment) o;
        return Float.compare(aliment.pret, pret) == 0 && dataExpirare == aliment.dataExpirare && Float.compare(aliment.calorii, calorii) == 0 && Objects.equals(ingrediente, aliment.ingrediente) && tip == aliment.tip;
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
                ", Ingrediente=" + ingrediente +
                ", calorii=" + calorii +
                ", tip=" + tip +
                '}';
    }
}

