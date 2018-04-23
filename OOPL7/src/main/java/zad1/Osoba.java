/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import zad1.Student;
import zad2.punkt3d;

/**
 *
 * @author student
 */
public class Osoba {

    /**
     * @param args the command line arguments
     */

    String imie;
    String nazwisko;
    String dataurodzenia;
    String plec;

    public Osoba(String imie, String nazwisko, String dataurodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
        this.plec = plec;
    }

    
    
    
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataurodzenia(String dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getDataurodzenia() {
        return dataurodzenia;
    }

    public String getPlec() {
        return plec;
    }
  
     public static void main(String[] args) {
    }
}


