/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

/**
 *
 * @author student
 */
public class Wykladowca extends Osoba  {

    String przedmiot;
    int stazpracy;
    String tytulnaukowy;

    public Wykladowca(String przedmiot, int stazpracy, String tytulnaukowy, String imie, String nazwisko, String dataurodzenia, String plec) {
        super(imie, nazwisko, dataurodzenia, plec);
        this.przedmiot = przedmiot;
        this.stazpracy = stazpracy;
        this.tytulnaukowy = tytulnaukowy;
    }

    

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public int getStazpracy() {
        return stazpracy;
    }

    public void setStazpracy(int stazpracy) {
        this.stazpracy = stazpracy;
    }

    public String getTytulnaukowy() {
        return tytulnaukowy;
    }

    public void setTytulnaukowy(String tytulnaukowy) {
        this.tytulnaukowy = tytulnaukowy;
    }

}
