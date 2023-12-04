package com.crm.idnplab06.helpers;

import android.graphics.Color;

import com.crm.idnplab06.models.LegendEntity;

import java.util.ArrayList;
import java.util.List;

public class LegendHelper {
    private List<LegendEntity> legendEntities;

    public LegendHelper() {
        legendEntities = new ArrayList<LegendEntity>();
    }

    public void addLeyendItem(String category, Color color) {
        LegendEntity leyend = new LegendEntity();
        leyend.setCategory(category);
        leyend.setColor(color);
        if (legendEntities.contains(leyend) == false) {
            legendEntities.add(leyend);
        }
    }

    public List<LegendEntity> getLegendItems() {
        return legendEntities;
    }
}