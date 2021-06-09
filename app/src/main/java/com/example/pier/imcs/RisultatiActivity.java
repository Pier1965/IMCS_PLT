package com.example.pier.imcs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.graphics.*;


import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import androidx.appcompat.app.AppCompatActivity;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.*;

// TODO: aggiungere salvataggio dati e risultati in file

public class RisultatiActivity extends AppCompatActivity {

    private LineGraphSeries<DataPoint> mSeries1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risultati);
        //
        //
        mast.getInstance().calcola();
        String[] lbl_results=new String[]{getString(R.string.TV_IMCS) + " = " + String.format("%.2f", mast.getInstance().getimcs()), getString(R.string.TV_FLEX) + " = " + String.format("%.2f",mast.getInstance().getflex()) + "%", getString(R.string.TV_CURVA) + " = " + mast.getInstance().getcurva()};
        ArrayAdapter<String> adapter_results= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lbl_results);
        ListView lv = (ListView) findViewById(R.id.lstRisultati);
        lv.setAdapter(adapter_results);
        //
        //
        // ---------------------------- GRAFICO CURVA -------------------------------------
        //

        GraphView graph = (GraphView) findViewById(R.id.graph);
        //graph.setTitleTextSize();
        //graph.setTitleColor(Color.YELLOW);
        graph.setTitle(getString(R.string.Titolo_graph));
        graph.getViewport().setMaxX(mast.getInstance().getL());
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setBackgroundColor(R.color.bkgndGraph);
        mSeries1 = new LineGraphSeries<>(generateData());
        mSeries1.setColor(Color.YELLOW);
        mSeries1.setThickness(6);
        graph.addSeries(mSeries1);

        //
        // Bottone per tornare alla pagina precedente
        //
        Button btn_back = (Button) findViewById(R.id.risultati_back);
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // azioni da fare
                Intent Nuovo = new Intent(RisultatiActivity.this, CaricoActivity.class);
                startActivity(Nuovo);
            }
        });

    }
    private DataPoint[] generateData(){
        int count = 101;
        double dx = mast.getInstance().getL()/(count-1);
        double y=0;
        double x=0;
        DataPoint[] values = new DataPoint[count];
        //System.out.println("a = " + mast.getInstance().geta() + "  b = " + mast.getInstance().getb() + "  c = " + mast.getInstance().getc() + "  d = " + mast.getInstance().getd());
        for (int i=0; i<count; i++) {
                y = mast.getInstance().geta() * Math.pow(x,4) + mast.getInstance().getb() * Math.pow(x,3) + mast.getInstance().getc() * Math.pow(x,2) + mast.getInstance().getd() * x;
                new DataPoint(x, y);
                x += dx;
                //System.out.println("i= " + i + "  x = " + x + "  y = " + y);
                DataPoint v = new DataPoint(x, y);
                values[i] = v;
            }
            return values;
    }
}
