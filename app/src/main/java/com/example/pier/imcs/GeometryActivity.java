package com.example.pier.imcs;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;

import static com.example.pier.imcs.mast.getInstance;

public class GeometryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);
        //
        // Bottone per tornare alla pagina precedente
        //
        Button btn_back = (Button) findViewById(R.id.geom_back);
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(GeometryActivity.this, ProjectInfo.class);
                startActivity(Nuovo);
            }
        });
        //
        // Bottone per andare alla pagina delle frecce con albero scarico
        //
        Button btn_fwd = (Button) findViewById(R.id.geom_fwd);
        btn_fwd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(GeometryActivity.this, ScaricoActivity.class);
                startActivity(Nuovo);
            }
        });
        //
        // --------- gestione campi geometria -------------------------
        //
        // -------------- LUNGHEZZA -----------------------------------
        //
        final EditText Lunghezza = (EditText)findViewById(R.id.lunghezza);
        double L = mast.getInstance().getL()/10; // visualizzazione in cm
        //Log.d("Lunghezza =", Double.toString(L));
        Lunghezza.setText(Double.toString(L));
        //
        // Perdita del focus della lunghezza
        //
        Lunghezza.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strLunghezza=Lunghezza.getText().toString();
                    mast.getInstance().setL(Double.valueOf(strLunghezza)*10);
                }
            }
        });
        //
        // -------------- LUNGHEZZA DI RIFERIMENTO -----------------------------------
        //
        final EditText Lriferimento = (EditText)findViewById(R.id.Lref);
        double Lref = mast.getInstance().getLref()/10;
        Log.d("Lunghezza riferimento =", Double.toString(Lref));
        Lriferimento.setText(Double.toString(Lref));
        //
        // Perdita del focus della lunghezza
        //
        Lriferimento.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strLriferimento=Lriferimento.getText().toString();
                    mast.getInstance().setLref(Double.valueOf(strLriferimento)*10);
                }
            }
        });
        //
        // -------------- DIAMETRO BOTTOM -----------------------------------
        //
        final EditText Db = (EditText)findViewById(R.id.db);
        double db = mast.getInstance().getdb();
        //Log.d("Diametro bottom =", Double.toString(db));
        Db.setText(Double.toString(db));
        //
        // Perdita del focus del diametro di bottom
        //
        Db.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strDb=Db.getText().toString();
                    mast.getInstance().setdb(Double.valueOf(strDb));
                }
            }
        });
        //
        // -------------- DIAMETRO 1 -----------------------------------
        //
        final EditText D1 = (EditText)findViewById(R.id.d1);
        double d1 = mast.getInstance().getd1();
        //Log.d("Diametro 1 =", Double.toString(d1));
        D1.setText(Double.toString(d1));
        //
        // Perdita del focus del diametro 1
        //
        D1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strD1=D1.getText().toString();
                    mast.getInstance().setd1(Double.valueOf(strD1));
                }
            }
        });
        //
        // -------------- DIAMETRO 2 -----------------------------------
        //
        final EditText D2 = (EditText)findViewById(R.id.d2);
        double d2 = mast.getInstance().getd2();
        //Log.d("Diametro 2 =", Double.toString(d2));
        D2.setText(Double.toString(d2));
        //
        // Perdita del focus del diametro 2
        //
        D2.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strD2=D2.getText().toString();
                    mast.getInstance().setd2(Double.valueOf(strD2));
                }
            }
        });
        //
        // -------------- DIAMETRO 3 -----------------------------------
        //
        final EditText D3 = (EditText)findViewById(R.id.d3);
        double d3 = mast.getInstance().getd3();
        //Log.d("Diametro 3 =", Double.toString(d3));
        D3.setText(Double.toString(d3));
        //
        // Perdita del focus del diametro 3
        //
        D3.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strD3=D3.getText().toString();
                    mast.getInstance().setd3(Double.valueOf(strD3));
                }
            }
        });
        //
        // -------------- DIAMETRO TOP -----------------------------------
        //
        final EditText Dt = (EditText)findViewById(R.id.dt);
        double dt = mast.getInstance().getdt();
        //Log.d("Diametro Top =", Double.toString(dt));
        Dt.setText(Double.toString(dt));
        //
        // Perdita del focus del diametro 2
        //
        Dt.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            /* When focus is lost check that the text field
            * has valid values.
            */
                if (!hasFocus) {
                    String strDt=Dt.getText().toString();
                    mast.getInstance().setdt(Double.valueOf(strDt));
                }
            }
        });
    }
}
