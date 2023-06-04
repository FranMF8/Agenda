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
public class Menu {
    private String menu = "1";
     Scanner in = new Scanner(System.in);
    public void Run() {        
        while(menu.equals("1")) {
            System.out.println("Ingrese 1 para agregar otra persona a la agenda");
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese opcion:");
            menu = in.next();
        }
    }
}
