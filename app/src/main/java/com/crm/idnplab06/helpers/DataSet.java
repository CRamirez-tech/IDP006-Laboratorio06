package com.crm.idnplab06.helpers;

import android.content.res.AssetManager;
import android.graphics.Color;

import com.crm.idnplab06.models.DataEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataSet {
    private static DataSet instance;
    public DataSet() {
        if(instance==null){
            instance=new DataSet();
        }
    }
    public static DataSet getInstance(){
        return instance;
    }
    public static List<DataEntity> getSerie(AssetManager assetManager, String filePath) {
        List<DataEntity> dataList = new ArrayList<DataEntity>();
        try {
            // Abre el archivo CSV desde el directorio de activos
            InputStream inputStream = assetManager.open(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            // Lee cada línea del archivo CSV
            String line;
            while ((line = reader.readLine()) != null) {
                // Divide la línea en campos usando la coma como delimitador
                String[] row = line.split(",");
                dataList.add(new DataEntity(row[0], Float.parseFloat(row[1])));
            }

            // Cierra los recursos
            reader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (IOException e) {
            dataList = new ArrayList<>();
            dataList.add(new DataEntity("Argentina", 20.7f));
            dataList.add(new DataEntity("Bolivia", 46.6f));
            dataList.add(new DataEntity("Brazil", 28.6f));
            dataList.add(new DataEntity("Canada", 14.5f));
            dataList.add(new DataEntity("Chile", 23.4f));
            dataList.add(new DataEntity("Columbia", 27.4f));
            dataList.add(new DataEntity("Ecuador", 32.9f));
            dataList.add(new DataEntity("Guyana", 28.3f));
            dataList.add(new DataEntity("Mexico", 29));
            dataList.add(new DataEntity("Paraguay", 34.8f));
            dataList.add(new DataEntity("Peru", 32.9f));
            dataList.add(new DataEntity("U.S.A.", 16.7f));
            dataList.add(new DataEntity("Uruguay", 18f));
            dataList.add(new DataEntity("Venezuela", 27.5f));
        }
        return dataList;
    }

    public static List<Color> getColorCatalog() {
        List<Color> colors = new ArrayList<>();
        for (int r = 64; r < 255; r = r + 64) {
            for (int g = 64; g < 240; g = g + 64) {
                for (int b = 16; b < 240; b = b + 80) {
                    Color color = Color.valueOf(r, g, b);
                    colors.add(color);
                }
            }
        }
        return colors;
    }
}
