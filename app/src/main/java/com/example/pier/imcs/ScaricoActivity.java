package com.example.pier.imcs;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ScaricoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misure_scarico);

        //
        // Bottone in basso per tornare alla pagina precedente
        //
        Button btn_back = (Button) findViewById(R.id.misure_s_back);
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(ScaricoActivity.this, GeometryActivity.class);
                startActivity(Nuovo);
            }
        });
        //
        // Bottone per passare alla pagina frecce albero carico
        //
        Button btn_frwrd = (Button) findViewById(R.id.misure_s_fwd);
        btn_frwrd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(ScaricoActivity.this, CaricoActivity.class);
                startActivity(Nuovo);
            }
        });

        //
        // --------- gestione campi geometria inflessa scarica-------------------------
        //
        // -------------- ALTEZZA BOTTOM -----------------------------------
        //
        final EditText Hb = (EditText)findViewById(R.id.ET_hb);
        double hb = mast.getInstance().getfb();
        //Log.d("Altezza Bottom =", Double.toString(hb));
        Hb.setText(Double.toString(hb));
        //
        // Perdita del focus della lunghezza
        //
        Hb.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strhb=Hb.getText().toString();
                    mast.getInstance().setfb(Double.valueOf(strhb));
                }
            }
        });
        //
        // --------- gestione campi geometria inflessa scarica-------------------------
        //
        // -------------- ALTEZZA 01 -----------------------------------
        //
        final EditText H01 = (EditText)findViewById(R.id.ET_h01);
        double h01 = mast.getInstance().getf01();
        //Log.d("Altezza 01 scarico =", Double.toString(h01));
        H01.setText(Double.toString(h01));
        //
        // Perdita del focus della lunghezza
        //
        H01.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strh01=H01.getText().toString();
                    mast.getInstance().setf01(Double.valueOf(strh01));
                }
            }
        });
        // --------- gestione campi geometria inflessa scarica-------------------------
        //
        // -------------- ALTEZZA 02 -----------------------------------
        //
        final EditText H02 = (EditText)findViewById(R.id.ET_h02);
        double h02 = mast.getInstance().getf02();
        //Log.d("Altezza 02 scarico =", Double.toString(h02));
        H02.setText(Double.toString(h02));
        //
        // Perdita del focus della lunghezza
        //
        H02.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strh02=H02.getText().toString();
                    mast.getInstance().setf02(Double.valueOf(strh02));
                }
            }
        });
        // --------- gestione campi geometria inflessa scarica-------------------------
        //
        // -------------- ALTEZZA 03 -----------------------------------
        //
        final EditText H03 = (EditText)findViewById(R.id.ET_h03);
        double h03 = mast.getInstance().getf03();
        //Log.d("Altezza 03 scarico =", Double.toString(h03));
        H03.setText(Double.toString(h03));
        //
        // Perdita del focus della lunghezza
        //
        H03.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strh03=H03.getText().toString();
                    mast.getInstance().setf03(Double.valueOf(strh03));
                }
            }
        });
        // --------- gestione campi geometria inflessa scarica-------------------------
        //
        // -------------- ALTEZZA TOP -----------------------------------
        //
        final EditText Ht = (EditText)findViewById(R.id.ET_ht);
        double ht = mast.getInstance().getft();
        //Log.d("Altezza top =", Double.toString(ht));
        Ht.setText(Double.toString(ht));
        //
        // Perdita del focus della lunghezza
        //
        Ht.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strht=Ht.getText().toString();
                    mast.getInstance().setft(Double.valueOf(strht));
                }
            }
        });
    }
}
