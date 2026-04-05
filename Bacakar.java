/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
import java.io.*;  
import java.io.IOException;  
import java.io.InputStreamReader; 
public class Bacakar {
   public static void main(String[] args) throws IOException {
       
       char cc; int bil;
       
       InputStreamReader isr = new
       InputStreamReader (System.in);
       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.print ("hello\n");
       System.out.print ("baca 1 bilangan : ");
       
       cc =dataIn.readLine().charAt(0);
       System.out.print("baca 1 bilangan : ");
       
      bil = Integer.parseInt(dataIn.readLine());
       
       System.out.print(cc +"\n" +bil+"\n");
       System.out.print("bye \n");
       
    }
    
}
