package src.produse.tipuri;

public enum Categorie {
    LACTATE("Lactate"),
    PATISERIE("Patiserie"),
    MEZELURI("Mezeluri"),
    ALTELE("Altele");

    Categorie(String nume) {
        this.nume = nume;
    }

    private String nume;

    public String getNume() {
        return this.nume;
    }
}