/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.Component;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import vista.vista;
import modelo.modelo;

/**
 *
 * @author Usuario
 */
public class controlador implements ActionListener,MouseListener{
    vista vista;
    modelo modelo = new modelo();
    
    
    public controlador( vista vista ){
        this.vista = vista;
    }
    public void iniciar()
    {
        
        
            
            vista.setVisible(true);
            System.out.println("vista arrancada");
            
            
            
            
        this.vista.btnAgregar.setActionCommand("btnAgregar");
        this.vista.btnAgregar.addActionListener(this);
        
        this.vista.btnMostrar.setActionCommand("btnMostrar");
        this.vista.btnMostrar.addActionListener(this);
        
        this.vista.nuevoLista.setActionCommand("nuevoLista");
        this.vista.nuevoLista.addActionListener(this);
        
        this.vista.Abrir.setActionCommand("Abrir");
        this.vista.Abrir.addActionListener(this);
        
        this.vista.Guardar.setActionCommand("Guardar");
        this.vista.Guardar.addActionListener(this);
        
        this.vista.guardarComo.setActionCommand("guardarComo");
        this.vista.guardarComo.addActionListener(this);
        
        this.vista.Salir.setActionCommand("Salir");
        this.vista.Salir.addActionListener(this);
        
        this.vista.Archivos.setActionCommand("Archivos");
        this.vista.Archivos.addActionListener(this);
        
        this.vista.Otros.setActionCommand("Otros");
        this.vista.Otros.addActionListener(this);
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch ( Fichero.valueOf( e.getActionCommand() ) ){
            
            case btnAgregar :
                this.modelo.escribir(this.vista.txtNombre.getText(), this.vista.txtApellido.getText(), this.vista.txtDNI.getText(), this.vista.txtEdad.getText());
                this.vista.txtNombre.setText("");
                this.vista.txtApellido.setText("");
                this.vista.txtDNI.setText("");
                this.vista.txtEdad.setText("");
                
                break;
                
            case btnMostrar :
            this.vista.txtGrande.setText(this.modelo.mostrarInterfaz());
            
                
                
                
                break;
                
            case nuevoLista:
                this.vista.txtNombre.setText("");
                this.vista.txtApellido.setText("");
                this.vista.txtDNI.setText("");
                this.vista.txtEdad.setText("");
                this.vista.txtGrande.setText("");
                this.modelo.Borrar();
                
                break;
                
            case Abrir :
                
                String sFichero = "rubros.txt"; 
               File fichero = new File(sFichero); 

              if (fichero.exists()) 
               System.out.println("El fichero " + sFichero + " ya existe"); 

               else { 
             try{ 
             BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero)); 
             bw.close(); 
            } catch (IOException ioe){ 
                       ioe.printStackTrace(); 
                      } 
                      } 
                break;
                
            case Guardar :
               javax.swing.JFileChooser jF1= new javax.swing.JFileChooser(); 
            String ruta = ""; 
              try{ 
            if(jF1.showSaveDialog(null)==jF1.APPROVE_OPTION){ 
         ruta = jF1.getSelectedFile().getAbsolutePath(); 
         //Aqui ya tiens la ruta,,,ahora puedes crear un fichero n esa ruta y escribir lo k kieras... 
       } 
           }catch (Exception ex){ 
            ex.printStackTrace(); 
                 }

                break;
                            
                
                
                
                
            case guardarComo :
                
                break;
                
            case Salir :
                
                break;
                
                
        }
        
        
    }
    public enum Fichero{
        btnAgregar,
        btnMostrar,
        nuevoLista,
        Abrir,
        Guardar,
        guardarComo,
        Salir,
        tbFichero,
        Archivos,
        Otros,
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
       }
    @Override
    public void mouseEntered(MouseEvent e) {
         }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
        
    
}
