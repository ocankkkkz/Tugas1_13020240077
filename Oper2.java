/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
public class Oper2 {
    public static void main(String[]args){
        char i, j;
        
        i = 3;
        j = 4;
        
        System.out.println("i = "+ (int) i);
        System.out.println("j = "+ j);
        System.out.println("i & j ="+ (i & j));
        
        System.out.println("i | j = "+(i | j));
        System.out.println("i ^ j = "+(i ^ j));
        
        System.out.println((int)Math.pow(i, j));
        System.out.println("~i = "+ ~i);
    }
    
}
