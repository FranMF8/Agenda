/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;
import java.util.ArrayList;
/**
 *
 * @author cejit
 */
public class AgendaClass {
    private ArrayList<Persona> personas = new ArrayList();
    private Consola console = new Consola();

    
    public void InsertarPersona(int dni, String nombre, String apellido) {
        Persona aux = new Persona();
        
        aux.SetID(dni);
        aux.SetFirstName(nombre);
        aux.SetLastName(apellido);       
        
        personas.add(aux);
    }
    
    public void BuscarPersona(int dni) {    
        
        boolean encontrado = true;
        for (int i = 0; i < personas.size() && encontrado; i++) {
            Persona persona = personas.get(i);
            
            if (persona.GetID() == dni) {
                console.Write("");
                console.Write("Contacto encontrado");
                console.Write("");
                persona.MostrarPersona();
                encontrado = false;               
            }
            else if (!encontrado) {
                console.Write("");
                console.Write("No se encontro un contacto con ese dni");
                console.Write("");
            }  
        }
        
        if (encontrado) {
                console.Write("");
                console.Write("No se encontro un contacto con ese dni");
                console.Write("");
            }
    }

        
    public void ListarPersonas() {  
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            
                persona.MostrarPersona();
                        
        }
    }
}
