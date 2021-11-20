package app.examen.ejercicio24.configuracion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteConexion extends SQLiteOpenHelper {

    private String firma;
    private String descripcion;



    //constructor de clase cracion de la base de datos en sqlite
    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version ){
        super(context, dbname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /*Creacion de la primera tabla de la base de datos*/
        db.execSQL(Transacciones.createTablePersonas);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //Eliminacion de las tablas al momento de eliminar la informacion de la db
        db.execSQL(Transacciones.DROPTablePersonas);
        onCreate(db);

    }
}
