/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;
import java.util.Scanner;
/**
 *
 * @author corte
 */
public class Consola {
    private Scanner sc;
    
    
    public Consola() {
    this.sc = new Scanner(System.in);
    }
    
    public String ReadString(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
    
    public void Write(String msg) {
        System.out.println(msg);
    }
    
    public int ReadInt(String msg) {
        System.out.println(msg);
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
    
}
