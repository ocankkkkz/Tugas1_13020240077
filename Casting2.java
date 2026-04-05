/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
public class Casting2 {
    public static void main(String[] args){
        int a=8,b=9;
        float d=2.f,e=3.2f;
        char g='5';
        double k=3.14;
        String n="67",m="45", l="100";
        
        a = Integer.parseInt(n);
        k = Double.parseDouble(m);
        d = Float.parseFloat(l);
        System.out.print("a : "+a+"\nk : "+k+"nd : "+d);
        n = String.valueOf(b);
        m = String.valueOf(g);
        l = String.valueOf(e);
        System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);
        k = Double.valueOf(a).intValue();
        double c = Integer.valueOf(b).doubleValue();
        
        System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);
        
    }
}
