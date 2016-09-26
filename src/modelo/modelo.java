/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.vista;
import controlador.controlador;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;



/**
 *
 * @author Usuario
 */
public class modelo {
    
    ArrayList<persona> fichero = new ArrayList<persona>();
        
        public void escribir(String Nombre, String Apellido, String DNI, String Edad){
            persona p = new persona(Nombre, Apellido, DNI, Edad);
            
            fichero.add(p);
            
} 
        public String mostrarInterfaz(){
            
         String Area = ""; 
         String Area2 = "";
        
        for(int j = 0; j < fichero.size(); j++){
            Area = (fichero.get(j).toString());
            Area2 = Area2 + "\n" + Area;
                    }
        return Area2;
        }
        
        public void Borrar(){
            fichero.clear();
        }
        
        public void guardar(ArrayList<persona> fichero){
            
            
        }
        
        public void guardarFichero(String nombre) throws IOException {
        
        FileOutputStream fosPer = new FileOutputStream(nombre+".txt");
        ObjectOutputStream oosPer = new ObjectOutputStream (fosPer);
        
        for(int j = 0; j < fichero.size(); j++){            
            oosPer.writeObject(fichero.get(j));
        }
        fosPer.close();
    }
        
         public void abrirFichero (String nombre) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("Abriendo");

        FileInputStream fisPer = new FileInputStream(nombre+".txt");
        ObjectInputStream oisPer = new ObjectInputStream(fisPer);
        
            persona per = (persona)oisPer.readObject();
            System.out.println(per.toString());
        fisPer.close();
    }
        
        

}
    
    
    
 
    

    

