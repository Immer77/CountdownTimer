package controller;

import model.Vare;
import storage.Storage;

import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {

    public static Vare createVare(String navn){
        Vare vare = new Vare(navn);
        Storage.addvare(vare);
        return vare;
    }

    public static ArrayList<Vare> getVarer(){
        return Storage.getVarer();
    }


    public static void initStorage(){
        createVare("Salatmix");
        createVare("Iceberg");
        createVare("Agurk");
        createVare("Tomat");
        createVare("Pickles");
        createVare("Ost");
        createVare("Løg");
        createVare("Rødløg");
        createVare("Semidried");
        createVare("Bacon");
        createVare("Peberbacon");
        createVare("Ananas-Chipotle");
        createVare("Agurkerelish");
    }

    public static void init(){
        initStorage();
    }

}
