package app.examen.ejercicio24;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.HolderRecord>{

    //Variables
    private Context context;
   // private ArrayList<ModelRecord> recordsList;
    //Constructor


    @NonNull
    @Override
    public HolderRecord onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate layout
       // View view = LayoutInflater.from(context).inflate(R.layout.mostrar_registro, parent, false);

       return new HolderRecord(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderRecord holder, int position) {

        // obtener datos, establecer datos, ver clics en el método

        //Obtener datos

        //Establecer Datos

        // si el usuario no adjunta la imagen, imageUri será nulo, por lo tanto,
        // configure una imagen predeterminada en ese caso


        // manejar clicks de elementos (ir a la actividad de registro de detalles)


        //manejar clicks de botones (mostrar opciones como editar, eliminar)

        holder.moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FALTA
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class HolderRecord extends RecyclerView.ViewHolder{
        //vistas
        ImageView profileIv;
        TextView nameTv;
        ImageButton moreBtn;
        public HolderRecord(@NonNull View itemView){
            super(itemView);

            //Inicializamos la vistas
           // profileIv = itemView.findViewById(R.id.profileIv);
            //nameTv = itemView.findViewById(R.id.nameTv);
            //moreBtn = itemView.findViewById(R.id.moreBtn);

        }
    }
}
