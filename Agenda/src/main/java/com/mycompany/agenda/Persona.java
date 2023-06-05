/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author corte
 */
public class Persona {
    private int id;
    private String firstName;
    private String lastName;
    private Consola console = new Consola();
    
    public int GetID() {
        return this.id;
    }
    
    public void SetID(int pId) {
        this.id = pId;
    }
    
    public String GetFirstName(){
        return this.firstName;
    }
    
    public void SetFirstName(String fN) {
        this.firstName = fN;
    }
    
    public String GetLastName(){
        return this.lastName;
    }
    
    public void SetLastName(String lN) {
        this.lastName = lN;
    }
    
    public void MostrarPersona() {
        console.Write("");
        console.Write("DNI: " + this.GetID());
        console.Write("Nombre: " + this.GetFirstName());
        console.Write("Apellido: " + this.GetLastName());
        console.Write("");
    }
}
