/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import java.util.Random;

/**
 *
 * @author Dawid
 */
public class punkt2d {

   int x;
   int y;

    public punkt2d() {
       Random generator = new Random();
        this.x = generator.nextInt(20) + -10;
        this.y = generator.nextInt(20) + -10;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "punkt2d{" + "x=" + x + ", y=" + y + '}';
    }
   
    public static void main(String[] args) {
       punkt3d punkcik = new punkt3d();
       System.out.println("DZialac");
       punkcik.toString();
    }
    
}
