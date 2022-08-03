package storage;

import model.Vare;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Vare> varer = new ArrayList<>();

    public static ArrayList<Vare> getVarer() {
        return new ArrayList<>(varer);
    }

    public static void addvare(Vare vare){
        if(!varer.contains(vare)){
            varer.add(vare);
        }
    }
}
