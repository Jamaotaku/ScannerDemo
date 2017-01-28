/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws java.io.IOException {
        
        Scanner in = new Scanner (System.in);// создан сканнер
        
        int c;
        String s1;
        char ch = 0 , n = 0;
        
        System.out.print ("Enter any words:" );
        //System.out.print ("Введите целое число: ");
        
        //if (in.hasNextInt()){
        if (in.hasNextLine()) { 
            //i = in.nextInt(); // ожидает ввода числа
            s1 = in.nextLine();// ожидает ввода символов
            int i = s1.length();
            s1 = in.nextLine();// ожидает ввода символов
            c = s1.indexOf(ch);
            
            //s2 = in.nextLine();
            //System.out.println(i/3); // какое то выражение
            //System.out.print(i/3);
            System.out.println(s1);
            System.out.println("Длина введённой строки = " + i + " символов ");
            System.out.println( "Число = " + c);
            //System.out.println(i/3);
            
        } else {
            System.out.println("Вы ввели херню ");
        }
        
    }
    
}
