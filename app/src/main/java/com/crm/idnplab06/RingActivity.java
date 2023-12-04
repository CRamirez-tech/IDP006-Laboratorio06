package com.crm.idnplab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crm.idnplab06.graphs.LegendChart;
import com.crm.idnplab06.graphs.RingChart;
import com.crm.idnplab06.helpers.DataSet;

public class RingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring);

        RingChart ringChart = findViewById(R.id.ringChart);
        LegendChart legendChart = findViewById(R.id.ringChartLeyend);

        ringChart.setColorCatalog(DataSet.getColorCatalog());
        ringChart.setSerie(DataSet.getSerie(getAssets(),"data.csv"));

        legendChart.setLegendData(ringChart.getLegend());

    }


}