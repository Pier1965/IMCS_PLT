package com.example.pier.imcs;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
// TODO: Aggiungere la possibilità di richiamare un test gia fatto
// TODO: Aggiungere la possibilità di confrontare diversi test già fatti
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        // Creazione della classe albero
        //
        //mast Albero = new mast();
        //
        //
        // Bottone in alto per creare un nuovo progetto
        //
        Button buttonNuovo = (Button) findViewById(R.id.button2);

        buttonNuovo.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Toast.makeText(getApplicationContext(),"Creazione nuovo progetto",Toast.LENGTH_SHORT).show();
                mast.getInstance().azzera();
                Intent Nuovo = new Intent(MainActivity.this, ProjectInfo.class);
                startActivity(Nuovo);
            }
        });
        //
        // Bottone in alto per HELP
        //
        Button buttonHelp = (Button) findViewById(R.id.btn_help);

        buttonHelp.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Aiuto = new Intent(MainActivity.this, helpActivity.class);
                startActivity(Aiuto);
            }
        });
        /*
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder();
        builder.setMessage("Are you sure?").setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();

        */
    }
}
