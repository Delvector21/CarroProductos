package cl.inacap.carroproductos.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ProductosSQLiteHelper extends SQLiteOpenHelper {

    private final String sqlCreate = "CREATE TABLE productos(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL" +
            ",nombre TEXT" +
            ",descripcion TEXT" +
            ",foto TEXT" +
            ",precio INTEGER)";

    public ProductosSQLiteHelper(@Nullable Context context
            , @Nullable String name
            , @Nullable SQLiteDatabase.CursorFactory factory
            , int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(sqlCreate);
        sqLiteDatabase.execSQL("INSERT INTO productos (nombre,descripcion,precio,foto)" +
                "VALUES ('Coca cola zero','coca cola pulenta',1000" +
                ",'https://www.espanolaonline.cl/wp-content/uploads/2020/03/Coca-Cola-Zero-15-L.png')");
        sqLiteDatabase.execSQL("INSERT INTO productos (nombre,descripcion,precio,foto)" +
                " VALUES ('centella papu', 'Esto fue desde la BD'" +
                ",400,'https://www.zancada.com/wp-content/imagenes//imagenescentella.jpg')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS productos");
        sqLiteDatabase.execSQL(sqlCreate);
        sqLiteDatabase.execSQL("INSERT INTO productos (nombre,descripcion,precio,foto)" +
                "VALUES ('Coca cola zero','coca cola pulenta',1000" +
                ",'https://www.espanolaonline.cl/wp-content/uploads/2020/03/Coca-Cola-Zero-15-L.png')");
        sqLiteDatabase.execSQL("INSERT INTO productos (nombre,descripcion,precio,foto)" +
                " VALUES ('centella papu', 'Esto fue desde la BD'" +
                ",400,'https://www.zancada.com/wp-content/imagenes//imagenescentella.jpg')");

    }
}
