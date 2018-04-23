/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poduszkowiec;

/**
 *
 * @author Dawid
 */
public class Poduszkowiec {
 public Poduszkowiec() {
    }

    
    public String jazda() {
        String s ="Jedzie";
        return s;
    }

    
    public String plyniecie() {
        String s ="Plynie";
        return s;
    }

    public static void main(String[] args) {
        Poduszkowiec poduszk = new Poduszkowiec();
        System.out.println("Poduszkowiec i " + poduszk.jazda() + "  i " + poduszk.plyniecie());
    }
    
}
