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
public class punkt3d extends punkt2d {
 int z;
   
 public punkt3d() {
       Random generator = new Random();
        this.z= generator.nextInt(20) + -10;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString()+ "punkt3d{" + "z=" + z + '}';
    }

    
   
 
    
}
