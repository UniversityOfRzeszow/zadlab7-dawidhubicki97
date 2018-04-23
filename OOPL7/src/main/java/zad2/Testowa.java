/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author Dawid
 */
public class Testowa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        punkt2d[] array2D = new punkt2d[100];
        punkt3d[] array3D = new punkt3d[100];
        for (int i = 0; i < 100; i++) {
            array2D[i] = new punkt2d();
            array3D[i] = new punkt3d();
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(array2D[i].x==array3D[j].x && array2D[i].y==array3D[j].y){
                    System.out.println(array2D[i].toString());
                    System.out.println(array3D[j].toString());
                }
            }

        }

    }

}
