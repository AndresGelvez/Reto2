package Principal;
import Modelo.*;
import Vistas.*;

public class Main {
    
    public static void main(String[] args) {
        
        Login login = new Login();
        login.setVisible(true);
        
        Conexion conexion = new Conexion();
        conexion.getConnection();
       
    }
    
}
