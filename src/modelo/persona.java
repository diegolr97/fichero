/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class persona {
    
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Edad;
    
    public persona (){}
    
    public persona(String Nombre, String Apellido, String DNI, String Edad){
        
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.DNI=DNI;
        this.Edad=Edad;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Edad
     */
    public String getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    public String toString(){
        String persona = "Nombre: " + getNombre() + " Apellido: " + getApellido()+ " DNI: " + getDNI() + " Edad: " + getEdad();
        
        return persona;
        
    }

    
    
    
    
}
