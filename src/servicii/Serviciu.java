package src.servicii;

import src.produse.Aliment;
import src.produse.Carne;
import src.produse.Cereale;
import src.produse.Lapte;

import java.util.*;

public class Serviciu {

    public static List<Aliment> creareLista() {
        List<Aliment> listaAlimente = new ArrayList<>();

        listaAlimente.add(new Carne(12.3f, 5, Arrays.asList("ingredient1", "ingredient2")));
        listaAlimente.add(new Carne(7.5f, 2, Arrays.asList("ingredient2", "ingredient1")));
        listaAlimente.add(new Carne(13.5f, 3, Arrays.asList("ingredient3", "ingredient4")));
        listaAlimente.add(new Lapte(3.5f, 3, Arrays.asList("ingredient4", "ingredient5")));
        listaAlimente.add(new Cereale(5.6f, 10, Arrays.asList("ingredient7", "ingredient6", "ingredient8")));
        listaAlimente.add(new Cereale(6.4f, 13, Arrays.asList("ingredient7", "ingredient8", "ingredient9")));

        return listaAlimente;
    }

    public static List<Aliment> sortareLista(List<Aliment> listaAlimente) {
        return listaAlimente.stream()
                .sorted(Comparator.comparing(Aliment::getCalorii).thenComparing(Aliment::getDataExpirare))
                .toList();
    }

    public static void adaugareAliment(List<Aliment> lista) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ce tip de aliment doriti sa introduceti?");
        System.out.println("        1 - Carne");
        System.out.println("        2 - Lapte");
        System.out.println("        3 - Cereale");

        String ans = sc.nextLine();

        //float pret, int dataExpirare, List<String> ingrediente

        System.out.println("Introduceti pretul:");
        float pret = sc.nextFloat();

        System.out.println("Introduceti zilele ramase pana la expirare:");
        int data = sc.nextInt();

        System.out.println("Introduceti lista de ingrediente");
        String ing = sc.next();

        List<String> ingred = Arrays.stream(ing.split(",")).toList();

        if ("1".equals(ans)) {
            Aliment aliment = new Carne(pret, data, ingred);
            lista.add(aliment);
        } else if ("2".equals(ans)) {
            Aliment aliment = new Lapte(pret, data, ingred);
            lista.add(aliment);
        } else if ("3".equals(ans)) {
            Aliment aliment = new Cereale(pret, data, ingred);
            lista.add(aliment);
        }
    }

    public static void eliminareAliment(Aliment aliment, List<Aliment> lista) {
        if (lista.contains(aliment)) {
            lista.remove(aliment);
        } else {
            System.out.println("Alimentul nu se gaseste in lista!");
        }
    }

    public static void eliminareAliment(int index, List<Aliment> lista) {
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
        } else {
            System.out.println("Indexul precizat nu este valid!");
        }
    }

    public static void afisareAlimete(List<Aliment> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ". " + lista.get(i));
        }

        System.out.println();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        List<Aliment> listaAlimente = creareLista();

        System.out.println("Lista de alimente are urmatoarele componente:");
        afisareAlimete(listaAlimente);

        System.out.println("Doriti adaugarea mai multor alimente? (y/n)");
        String answer = sc.next();

        System.out.println(answer);

        if ("y".equals(answer)) {
            System.out.println("Numar de alimente de introdus:");
            int ans = sc.nextInt();
            for (int i = 1; i <= ans; i++) {
                adaugareAliment(listaAlimente);
            }
        }

        System.out.println("Doriti eliminarea unui aliment? (y/n)");
        String newAnswer = sc.next();

        if ("y".equals(newAnswer)) {
            System.out.println("Introduceti indexul elementului de sters:");
            afisareAlimete(listaAlimente);
            int index = sc.nextInt();
            eliminareAliment(index, listaAlimente);
        }

        System.out.println("Sortarea alimentelor existente:");
        listaAlimente = sortareLista(listaAlimente);
        afisareAlimete(listaAlimente);
    }
}
