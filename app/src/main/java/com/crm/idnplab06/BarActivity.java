package com.crm.idnplab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crm.idnplab06.graphs.BarChart;
import com.crm.idnplab06.graphs.LegendChart;
import com.crm.idnplab06.helpers.DataSet;

public class BarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        BarChart barChart=findViewById(R.id.barChart);
        LegendChart legendChart =findViewById(R.id.barChartLeyend);

        barChart.setSerie(DataSet.getSerie(getAssets(),"data.csv"));
        barChart.setColorCatalog(DataSet.getColorCatalog());

        legendChart.setLegendData(barChart.getLegend());
    }
}