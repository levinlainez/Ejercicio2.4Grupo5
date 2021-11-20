package app.examen.ejercicio24.configuracion;

public class Transacciones {

    /*Nombre de la base de datos*/
    public static final String NameDatabase ="PM01DB";

    /* Tablas de la base de datos en SQLite*/

    public static final  String tablafirma= "firmas";

    /*Campos de la tabla personas de la base de datos en SQLite*/

    public static final String id="id";
    public static final String firma="firma";
    public static final String descripcion="descripcion";

    /*Transacciones DDl tabla Personas ""  = * + -*/

    public static final String createTablePersonas ="CREATE TABLE firmas (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "firma BLOB, descripcion TEXT)";

    public static final String DROPTablePersonas = "DROP TABLE EXISTS firmas";

}
