package model;

import javax.swing.Timer;

public class Vare {
    private String navn;
    private int holdbarhedISalatbarITimer;

    public Vare(String navn) {
        this.navn = navn;
        this.holdbarhedISalatbarITimer = 3;
    }

    public String getNavn() {
        return navn;
    }

    public int getHoldbarhedISalatbarITimer() {
        return holdbarhedISalatbarITimer;
    }


}
