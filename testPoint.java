/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author HCT
 */
public class testPoint {
    public static void main(String[] args) {
        float x, y, z;
        Scanner toaDo = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 so: ");
        x = toaDo.nextInt(); 
        System.out.println("Hoanh do la: " + x);
        y = toaDo.nextInt();
        System.out.println("Tung do la: " + y);
        z = toaDo.nextInt(); 
        System.out.println("Cao do la: " + z);
        
        point p1 = new point(x, y, z);
        p1.show();
    }
}
