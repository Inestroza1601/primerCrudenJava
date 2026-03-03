package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() {
        Connection con = null;

        String servidor = "SERVER-ALONDRA";  // o tu IP
        String baseDatos = "uthprueba";
        String usuario = "uthcarlos";
        String password = "987";

        String url = "jdbc:sqlserver://" + servidor + ":1433;"
                + "databaseName=" + baseDatos + ";"
                + "encrypt=true;"
                + "trustServerCertificate=true;";

        try {
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }

        return con;
    }
}