package app.examen.ejercicio24;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.kyanogen.signatureview.SignatureView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Bitmap bitmap;
    Button clear, save;
    SignatureView signatureView;
    int path;
    private static final String Image_DIRECTORY="/signdemo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signatureView=findViewById(R.id.asignatureView);
        save=findViewById(R.id.save);
        clear=findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signatureView.clearCanvas();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bitmap=signatureView.getSignatureBitmap();
                path=Integer.parseInt(saveImage(bitmap));
            }
        });

    }

    private String saveImage(Bitmap MyBitmap) {
        ByteArrayOutputStream bytes=new ByteArrayOutputStream();
        MyBitmap.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
        File wallpaperDirectory=new File(Environment.getExternalStorageDirectory()+Image_DIRECTORY);
        //Guardar el objeto en el directorio
        if(!wallpaperDirectory.exists()){
            wallpaperDirectory.mkdirs();
            Log.d("hhh", wallpaperDirectory.toString());


        }
        File f=new File(wallpaperDirectory, Calendar.getInstance().getTimeInMillis()+".jpg");
        try {
            f.createNewFile();
            FileOutputStream fo=new FileOutputStream(f);
            fo.write(bytes.toByteArray());
            MediaScannerConnection.scanFile(MainActivity.this, new String[]{f.getPath()},new String[]{"image/jpeg"},null);
            fo.close();
            f.getAbsolutePath();
            return f.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "";
    }
}