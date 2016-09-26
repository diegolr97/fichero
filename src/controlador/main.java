package controlador;
import vista.vista;




public class main {
    
    public static void main(String[] args) {
        //ejecuta el controlador y este la vista
        new controlador( new vista() ).iniciar() ;
        System.out.println("arranque programa");
        
    }

}