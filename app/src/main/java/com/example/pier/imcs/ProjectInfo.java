package com.example.pier.imcs;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class ProjectInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_info);

        //
        // -------------- IDENTIFICATIVO -----------------------------------
        //
        final EditText Edt = (EditText)findViewById(R.id.identificativo);
        String edt = mast.getInstance().getident();
        Edt.setText(edt);
        //
        // Perdita del focus del diametro 2
        //

        Edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            // When focus is lost check that the text field
            // has valid values.
            //
                if (!hasFocus) {
                    String stredt=Edt.getText().toString();
                    mast.getInstance().setident(stredt);
                }
            }
        });

        //
        // -------------- MARCA -----------------------------------
        //

        final EditText Marca = (EditText)findViewById(R.id.marca);
        String mrc = mast.getInstance().getmarca();
        Marca.setText(mrc);
        //
        // Perdita del focus del diametro 2
        //

        Marca.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // When focus is lost check that the text field
                // has valid values.
                //
                if (!hasFocus) {
                    String strmarca=Marca.getText().toString();
                    mast.getInstance().setmarca(strmarca);
                }
            }
        });
        //
        // -------------- NOTE -----------------------------------
        //

        final EditText Note = (EditText)findViewById(R.id.note);
        String nts = mast.getInstance().getnote();
        Note.setText(nts);
        //
        // Perdita del focus del diametro 2
        //

        Note.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // When focus is lost check that the text field
                // has valid values.
                //
                if (!hasFocus) {
                    String strnote=Note.getText().toString();
                    mast.getInstance().setnote(strnote);
                }
            }
        });


        //
        // Bottone in basso per tornare alla pagina principale
        //
        Button btn_back = (Button) findViewById(R.id.back_button);
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(ProjectInfo.this, MainActivity.class);
                startActivity(Nuovo);
            }
        });
        //
        // Bottone per passare alla pagina della geometria
        //
        Button btn_frwrd = (Button) findViewById(R.id.btn_geom);
        btn_frwrd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(ProjectInfo.this, GeometryActivity.class);
                startActivity(Nuovo);
            }
        });

    }

}
