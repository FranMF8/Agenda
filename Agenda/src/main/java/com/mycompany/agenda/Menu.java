/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;
/**
 *
 * @author corte
 */
public class Menu {
    private Consola console = new Consola();
    private AgendaClass agenda = new AgendaClass();
    private int menu = 1;
    
    public void Run() {        
        while(menu != 0) {
            console.Write("Ingrese 1 para agregar un contacto a la agenda");
            console.Write("Ingrese 2 para buscar un contacto por su DNI");
            console.Write("Ingrese 3 para listar los contactos");
             menu = console.ReadInt("Ingrese 0 para salir");
             
             switch(menu) {
                 case 1:                   
                     console.Write("Insertar persona");
                     console.Write("");
                     int auxID = console.ReadInt("Ingrese DNI de la persona");
                     String auxFName = console.ReadString("Ingrese nombre de la persona");
                     String auxLName = console.ReadString("Ingrese apellido de la persona");
                     console.Write("");
                     agenda.InsertarPersona(auxID, auxFName, auxLName);
                     console.Write("");
                     console.Write("Contacto agregado");
                     console.Write("");
                     
                     break;
                     
                 case 2:
                     console.Write("Buscar persona");
                     
                     int auxId = console.ReadInt("Ingrese el DNI del contacto");                  
                     agenda.BuscarPersona(auxId);
                     
                     break;
                     
                 case 3:
                     console.Write("");
                     console.Write("Contactos");
                     console.Write("");
                     agenda.ListarPersonas();
                     console.Write("");
                     break;
                     
                 default:
                     console.Write("");
                     console.Write("La opcion no es valida");
                     console.Write("");
                     break;
             }
        }
    }
}
