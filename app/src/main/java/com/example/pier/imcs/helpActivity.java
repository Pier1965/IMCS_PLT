package com.example.pier.imcs;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        //
        // Bottone per tornare alla pagina precedente
        //
        Button btn_back = (Button) findViewById(R.id.hlp_btn_bck);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // azioni da fare
                Intent Nuovo = new Intent(helpActivity.this, MainActivity.class);
                startActivity(Nuovo);
            }
        });
    }
}
