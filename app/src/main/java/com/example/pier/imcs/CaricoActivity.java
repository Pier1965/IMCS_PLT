package com.example.pier.imcs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CaricoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misure_carico);

        //
        // --------- gestione campi geometria inflessa carica-------------------------
        //
        // -------------- ALTEZZA 01 -----------------------------------
        //
        final EditText H11 = (EditText)findViewById(R.id.ET_h11);
        double h11 = mast.getInstance().getf11();
        //Log.d("Altezza 01 carico =", Double.toString(h11));
        H11.setText(Double.toString(h11));
        //
        // Perdita del focus della lunghezza
        //
        H11.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strh11=H11.getText().toString();
                    mast.getInstance().setf11(Double.valueOf(strh11));
                }
            }
        });
        // --------- gestione campi geometria inflessa carica-------------------------
        //
        // -------------- ALTEZZA 02 -----------------------------------
        //
        final EditText H12 = (EditText)findViewById(R.id.ET_h12);
        double h12 = mast.getInstance().getf12();
        //Log.d("Altezza 02 carico =", Double.toString(h12));
        H12.setText(Double.toString(h12));
        //
        // Perdita del focus della lunghezza
        //
        H12.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strh12=H12.getText().toString();
                    mast.getInstance().setf12(Double.valueOf(strh12));
                }
            }
        });
        // --------- gestione campi geometria inflessa carica-------------------------
        //
        // -------------- ALTEZZA 03 -----------------------------------
        //
        final EditText H13 = (EditText)findViewById(R.id.ET_h13);
        double h13 = mast.getInstance().getf13();
        //Log.d("Altezza 03 carico =", Double.toString(h13));
        H13.setText(Double.toString(h13));
        //
        // Perdita del focus della lunghezza
        //
        H13.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strh13=H13.getText().toString();
                    mast.getInstance().setf13(Double.valueOf(strh13));
                }
            }
        });

        //
        // Bottone in basso per tornare alla pagina frecce scarico
        //
        Button btn_back = (Button) findViewById(R.id.misure_c_back);
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(CaricoActivity.this, ScaricoActivity.class);
                startActivity(Nuovo);
            }
        });
        //
        // Bottone per passare alla pagina della geometria
        //
        Button btn_frwrd = (Button) findViewById(R.id.misure_c_fwd);
        btn_frwrd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(CaricoActivity.this, RisultatiActivity.class);
                startActivity(Nuovo);
            }
        });


    }
}
