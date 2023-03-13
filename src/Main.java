package src;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {

    public static List<Aliment> CreareLista()
    {
        List<Aliment> listaAlimente = new ArrayList<Aliment>();
        listaAlimente.add(new Carne(12.3f, 5, Arrays.asList("ingredient1", "ingredient2")));
        listaAlimente.add(new Carne(7.5f, 2, Arrays.asList("ingredient2", "ingredient1")));
        listaAlimente.add(new Carne(13.5f, 3, Arrays.asList("ingredient3", "ingredient4")));
        listaAlimente.add(new Lapte(3.5f, 3, Arrays.asList("ingredient4", "ingredient5")));
        listaAlimente.add(new Cereale(5.6f, 10, Arrays.asList("ingredient7", "ingredient6", "ingredient8")));
        listaAlimente.add(new Cereale(6.4f, 13, Arrays.asList("ingredient7", "ingredient8", "ingredient9")));
        return listaAlimente;
    }

    public static List<Aliment> SortareLista(List<Aliment> listaAlimente)
    {
        List <Aliment> listaSortata = listaAlimente.stream()
                .sorted(Comparator.comparing(Aliment::getCalorii).thenComparing(Aliment::getDataExpirare))
                .collect(Collectors.toList());
        return listaSortata;
    }
    public static List<Aliment> AdaugareAliment(List<Aliment> lista)
    {
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
        List<String> ingred = new ArrayList<>();
        System.out.println("Introduceti lista de ingrediente");
        String ing = new String();
        ing = sc.nextLine();
        ing = sc.nextLine();
        while(!ing.trim().equals(""))
        {
            ingred.add(sc.next());
            ing = sc.nextLine();
        }
        if (ans == "1")
        {
            Aliment aliment = new Carne(pret, data, ingred);
            lista.add(aliment);
        }
        else if (ans == "2")
        {
            Aliment aliment = new Lapte(pret, data, ingred);
            lista.add(aliment);
        }
        else if(ans == "3")
        {
            Aliment aliment = new Cereale(pret, data, ingred);
            lista.add(aliment);
        }
        return lista;
    }
    public static List<Aliment> EliminareAliment(Aliment aliment, List<Aliment> lista)
    {
        if (lista.contains(aliment))
        {
            lista.remove(aliment);
        }
        else
        {
            System.out.println("Alimentul nu se gaseste in lista!");
        }
        return lista;
    }

    public static List<Aliment> EliminareAliment(int index, List<Aliment> lista)
    {
        if(index >= 0 && index < lista.size())
        {
            lista.remove(index);
        }
        else
        {
            System.out.println("Indexul precizat nu este valid!");
        }
        return lista;
    }
    public static void AfisareAlimete(List<Aliment> lista)
    {
        for(int i = 0; i < lista.size(); i++)
            System.out.println(i +  ". " + lista.get(i));
        System.out.println();
    }
    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        List<Aliment> listaAlimente = CreareLista();
        System.out.println("Lista de alimente are urmatoarele componente:");
        AfisareAlimete(listaAlimente);
        System.out.println("Doriti adaugarea mai multor alimente? (y/n)");
        String answer = sc.nextLine();
        System.out.println(answer);
        if (answer.equals("y"))
        {
            System.out.println("Numar de alimente de introdus:");
            int ans = sc.nextInt();
            for (int i = 1; i <= ans; i++)
                listaAlimente = AdaugareAliment(listaAlimente);
        }
        System.out.println("Doriti eliminarea unui aliment? (y/n)");
        String newAnswer = sc.nextLine();
        if (newAnswer == "y")
        {
            System.out.println("Introduceti indexul elementului de sters:");
            AfisareAlimete(listaAlimente);
            int index = sc.nextInt();
            listaAlimente = EliminareAliment(index, listaAlimente);
        }
        System.out.println("Sortarea alimentelor existente:");
        listaAlimente = SortareLista(listaAlimente);
        AfisareAlimete(listaAlimente);

    }
    public static void main(String[] args)
    {
        menu();
    }
}
